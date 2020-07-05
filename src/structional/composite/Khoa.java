/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structional.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hai Tran Do
 */
public class Khoa extends AbstractThanhPhan{
    List<AbstractThanhPhan> composite = new ArrayList<>();

    public Khoa(String name) {
        super(name);
    }
    
    @Override
    public void add(AbstractThanhPhan tp) {
        composite.add(tp);
        tp.prety += this.prety + "..";
    }

    @Override
    public String show() {
        String str = prety + name;
        for (AbstractThanhPhan tp : composite) {
            str += "\n" + tp.show();
        }
        return str;
    }
    
}
