/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavinal.iterator;

/**
 *
 * @author Hai Tran Do
 * @param <T>
 */
public class ArrayAggregate<T> extends Aggregate<T>{

    T[] arr;

    public ArrayAggregate(T[] arr) {
        this.arr = arr;
    }

    @Override
    public MyIterator<T> createIterator() {
        return new ArrayIterator<>(this);
    }
    
    public T getItem(int index) {
        return arr[index];
    }
    
    public int count() {
        return arr.length;
    }

    
}
