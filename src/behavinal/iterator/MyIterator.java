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
public abstract class MyIterator<T> {
    public abstract T first();
    public abstract T next();
    public abstract T current();
    public abstract boolean isDone();
}
