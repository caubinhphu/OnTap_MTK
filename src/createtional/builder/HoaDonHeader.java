/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createtional.builder;

/**
 *
 * @author Hai Tran Do
 */
public class HoaDonHeader {
    String maHoaDon, ngayBan, tenKhachHang;

    public HoaDonHeader(String maHoaDon, String ngayBan, String tenKhachHang) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKhachHang = tenKhachHang;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "maHoaDon=" + maHoaDon + ", ngayBan=" + ngayBan + ", tenKhachHang=" + tenKhachHang + '}';
    }
    
    
}
