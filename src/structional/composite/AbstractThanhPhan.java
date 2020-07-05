/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structional.composite;

/**
 *
 * @author Hai Tran Do
 */
public abstract class AbstractThanhPhan {
    String name, prety = "";

    public AbstractThanhPhan(String name) {
        this.name = name;
    }

    public abstract void add(AbstractThanhPhan tp);
    public abstract String show();
    
}
