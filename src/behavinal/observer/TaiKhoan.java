/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavinal.observer;

/**
 *
 * @author Hai Tran Do
 */

//Obserer class
public class TaiKhoan implements ATM.ATM_Obserer {
    int soDu;

    public TaiKhoan(int soDu) {
        this.soDu = soDu;
    }
    
    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        return soDu >= soTienRut;
    }

    @Override
    public void nhanThongBao(int soTienDaRut, String thongBao) {
        soDu -= soTienDaRut;
        System.out.println(thongBao);
        System.out.println("So du tai khoan: " + soDu);
    }
    
}
