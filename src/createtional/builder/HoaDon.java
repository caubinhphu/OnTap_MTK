/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createtional.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hai Tran Do
 */
public class HoaDon {
    HoaDonHeader header;
    List<CTHD> cthds;

    public HoaDon(HoaDonBuilder builder) {
        this.header = builder.header;
        this.cthds = builder.cthds;
    }

    public static class HoaDonBuilder {
        HoaDonHeader header;
        List<CTHD> cthds;

        public HoaDonBuilder() {
            cthds = new ArrayList<>();
        }
        
        public HoaDonBuilder addHeader(HoaDonHeader header) {
            this.header = header;
            return this;
        }
        
        public HoaDonBuilder addCTHD(CTHD cthd) {
            this.cthds.add(cthd);
            return this;
        }
        
        public HoaDon build() {
            return new HoaDon(this);
        }
    }
}
