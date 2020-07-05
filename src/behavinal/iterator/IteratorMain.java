/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavinal.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hai Tran Do
 */
public class IteratorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aggregate<Integer> aggregate1 = new ArrayAggregate<>(new Integer[] {1, 2, 3, 4});
        MyIterator<Integer> iterator1 = aggregate1.createIterator();
        while (!iterator1.isDone()) {
            System.out.println(iterator1.current());
            iterator1.next();
        }
        
        Aggregate<Person> aggregate2 = new ArrayAggregate<>(new Person[] {new Person("A", 18), new Person("B", 19)});
        MyIterator<Person> iterator2 = aggregate2.createIterator();
        while (!iterator2.isDone()) {
            System.out.println(iterator2.current().toString());
            iterator2.next();
        }
        
        Aggregate<Integer> aggregate3 = new ArrayListAggregate<>(new ArrayList<>(List.of(1, 2, 3, 4, 5)));
        MyIterator<Integer> iterator3 = aggregate3.createIterator();
        while (!iterator3.isDone()) {
            System.out.println(iterator3.current());
            iterator3.next();
        }
        
        Aggregate<Person> aggregate4 = new ArrayListAggregate<>(new ArrayList<>(List.of(new Person("C", 20), new Person("D", 21))));
        MyIterator<Person> iterator4 = aggregate4.createIterator();
        while (!iterator4.isDone()) {
            System.out.println(iterator4.current());
            iterator4.next();
        }
    }
}
