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
public class BoPhanChoVay {
    String name;
    int from;
    BoPhanChoVay next;
    
    public BoPhanChoVay(String name, int from) {
        this.name = name;
        this.from = from;
    }

    public BoPhanChoVay setNext(BoPhanChoVay next) {
        this.next = next;
        return this.next;
    }
   
    public String duyetChoVay(int tienVay) {
        if (tienVay >= from) {
            return name;
        }
        if (next != null) {
            return next.duyetChoVay(tienVay);
        }
        return "error";
    }
}
