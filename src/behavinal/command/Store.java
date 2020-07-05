/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavinal.command;

/**
 *
 * @author Hai Tran Do
 */
public class Store {
    int total = 0;
    
    public void muaHang(String ten, int gia, int soLuong) {
        StringBuilder builder = new StringBuilder();
        builder.append(ten)
                .append(", so luong: ")
                .append(soLuong)
                .append(", don gia: ")
                .append(gia)
                .append(", thanh tien: ")
                .append(gia * soLuong);
        total += gia * soLuong;
        System.out.println(builder.toString());
    }
    
    public int tongTienGioHang() {
        return total;
    }
}
