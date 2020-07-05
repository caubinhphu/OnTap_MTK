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
public class BuilderMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.HoaDonBuilder()
                    .addHeader(new HoaDonHeader("a", "1", "A"))
                    .addCTHD(new CTHD("a", 0, 0, 0))
                    .build();
    }
    
}
