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
public class ArrayListIterator<T> extends MyIterator<T>{
    ArrayListAggregate<T> aggregate;
    int index = 0;
    
    public ArrayListIterator(ArrayListAggregate<T> aggregate) {
        this.aggregate = aggregate;
    }
    
    @Override
    public T first() {
        index = 0;
        if (!isDone()) {
            return aggregate.getItem(0);
        }
        return null;
    }

    @Override
    public T next() {
        index++;
        if (!isDone()) {
            return aggregate.getItem(index);
        }
        return null;
    }

    @Override
    public T current() {
        return aggregate.getItem(index);
    }

    @Override
    public boolean isDone() {
        return index >= aggregate.count();
    }
    
}
