/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structional.adapter;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hai Tran Do
 */
public class ApdaterMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(65);
        list.add(23);
        list.add(64);
        
        AdapterInterger adapter = new AdapterInterger();
        DefaultTableModel dtm = adapter.request(list);
        
        System.out.println(dtm.getDataVector());
    }
    
}
