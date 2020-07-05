/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavinal.iterator;

import java.util.ArrayList;

/**
 *
 * @author Hai Tran Do
 */
public class ArrayListAggregate<T> extends Aggregate<T>{
    ArrayList<T> arrList;

    public ArrayListAggregate(ArrayList<T> arrList) {
        this.arrList = arrList;
    }
    
    @Override
    public MyIterator<T> createIterator() {
        return new ArrayListIterator<>(this);
    }
    
    public T getItem(int index) {
        return arrList.get(index);
    }
    
    public int count() {
        return arrList.size();
    }
}
