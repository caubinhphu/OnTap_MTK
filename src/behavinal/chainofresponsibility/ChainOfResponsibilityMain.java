/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavinal.chainofresponsibility;

/**
 *
 * @author Hai Tran Do
 */
public class ChainOfResponsibilityMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BoPhanChoVay chuTich = new BoPhanChoVay("Chu tich", 10000000);
        chuTich.setNext(new BoPhanChoVay("Giam doc", 8000000))
                .setNext(new BoPhanChoVay("Truong phong", 5000000))
                .setNext(new BoPhanChoVay("Pho truong phong", 0));
        
        System.out.println(chuTich.duyetChoVay(19500000));
        System.out.println(chuTich.duyetChoVay(9500000));
        System.out.println(chuTich.duyetChoVay(5500000));
        System.out.println(chuTich.duyetChoVay(2000000));
        System.out.println(chuTich.duyetChoVay(-1));
    }
    
}
