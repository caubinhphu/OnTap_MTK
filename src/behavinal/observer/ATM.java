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

// subject class
public class ATM {
    ATM_Obserer obserer;
    
    public void thietLapTaiKhoan(ATM_Obserer obserer) {
        this.obserer = obserer;
    }
    
    private boolean kiemTraTienRut(int soTienRut) {
        return obserer.kiemTraSoDu(soTienRut);
    }
    
    public void rutTien(int soTienRut) {
        if (kiemTraTienRut(soTienRut)) {
            obserer.nhanThongBao(soTienRut, "Giao dich thanh cong");
        } else {
            obserer.nhanThongBao(0, "Khong du tien de rut");
        }
    }
    
    // IObserer
    public static interface ATM_Obserer {
        boolean kiemTraSoDu(int soTienRut);
        void nhanThongBao(int soTienDaRut, String thongBao);
    }
}
