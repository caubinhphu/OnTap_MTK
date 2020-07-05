/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavinal.command;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hai Tran Do
 */
public class CommandMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GioHang gh = new GioHang(new Store());
        gh.xacNhanMuaHang("a", 10000, 1);
        gh.xacNhanMuaHang("b", 20000, 2);
        gh.tinhTienGioHang();
    }
    
}
