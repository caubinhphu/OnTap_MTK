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
public class GiangVien extends AbstractThanhPhan{

    public GiangVien(String name) {
        super(name);
    }
    
    @Override
    public void add(AbstractThanhPhan tp) {}

    @Override
    public String show() {
        return prety + name;
    }
    
}
