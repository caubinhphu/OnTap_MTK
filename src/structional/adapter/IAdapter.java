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
 * @param <T>
 */
public interface IAdapter<T> {
    public DefaultTableModel request(List<T> list);
}
