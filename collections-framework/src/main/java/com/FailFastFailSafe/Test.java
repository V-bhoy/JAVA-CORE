package com.FailFastFailSafe;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            list.add(6);
            System.out.println(iterator.next());
            list.add(7);
        }
    }

    // Avoid ConcurrentModificationException
    // iterator.remove()	✅	Remove elements safely
    //CopyOnWriteArrayList / ConcurrentHashMap	✅	Modify during iteration
    //ListIterator	✅	Add/remove elements in list
    //Collect-to-remove later	✅	Batch modifications

}
