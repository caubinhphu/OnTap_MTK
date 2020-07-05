/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavinal.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hai Tran Do
 */
public class GioHang{
    List<Command> gioHang = new ArrayList<>();
    Store store;

    public GioHang(Store store) {
        this.store = store;
    }
    
    public void xacNhanMuaHang(String ten, int gia, int soLuong) {
        Command ctgh = new ChiTietGioHang(ten, gia, soLuong, store);
        ctgh.datHang();
        gioHang.add(ctgh);
    }
    
    public void tinhTienGioHang() {
        System.out.println("Tong: " + store.tongTienGioHang());
    }
}
