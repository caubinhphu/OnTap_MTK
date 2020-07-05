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
public class ObserverMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan taiKhoan = new TaiKhoan(1000000);
        atm.thietLapTaiKhoan(taiKhoan);
        atm.rutTien(500000);
        atm.rutTien(1000000);
    }
    
}
