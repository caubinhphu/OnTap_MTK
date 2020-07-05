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
public class ChiTietGioHang extends Command{
    String ten;
    int gia, soLuong;
    Store store;

    public ChiTietGioHang(String ten, int gia, int soLuong, Store store) {
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
        this.store = store;
    }
    
    @Override
    public void datHang() {
        store.muaHang(ten, gia, soLuong);
    }
}
