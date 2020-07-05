/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structional.adapter;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hai Tran Do
 */
public class AdapterInterger implements IAdapter<Integer>{
    DefaultTableModel model = new DefaultTableModel();
    
    @Override
    public DefaultTableModel request(List<Integer> list) {
        model.addColumn("item");
        
        list.forEach(it -> model.addRow(new Object[] {it}));

        return model;
    }
}
