/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structional.composite;

/**
 *
 * @author Hai Tran Do
 */
public class CompositeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractThanhPhan khoa = new Khoa("CNTT");
        AbstractThanhPhan boMon1 = new BoMon("He thong thong tin");
        AbstractThanhPhan boMon2 = new BoMon("Cong nghe phan mem");
        khoa.add(boMon1);
        khoa.add(boMon2);
        boMon1.add(new GiangVien("Nguyen Van A"));
        boMon1.add(new GiangVien("Nguyen Van B"));
        boMon2.add(new GiangVien("Nguyen Van C"));
        boMon2.add(new GiangVien("Nguyen Van D"));
        System.out.println(khoa.show());
    }
}
