package com.lqk.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author liangqiankun
 * @date 2020-12-18
 */
public class ListErgodic {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(123);
        list.add("AAA");
        list.add("cc");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }

        for(Object obj : list){
            System.out.println(obj);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
