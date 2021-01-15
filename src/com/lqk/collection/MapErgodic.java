package com.lqk.collection;

import org.junit.Test;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author liangqiankun
 * @date 2020-12-18
 */
public class MapErgodic {


    @Test
    //最常见也是大多数情况下用的最多的，一般在键值对都需要使用
    public void map1(){
        Map<String,String> map = new HashMap<>(16);
        map.put("11","正常一级");
        map.put("22","正常二级");
        for (Map.Entry<String,String> m : map.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }

    @Test
    //在for循环中遍历key或者values，一般适用于只需要map中的key或者value时使用，在性能上比使用entrySet较好；
    public void map2(){
        Map<String,String> map = new HashMap<>(16);
        map.put("11","正常一级");
        map.put("22","正常二级");

        for(String key : map.keySet()){
            System.out.println(key);
        }
        for(String value : map.values()){
            System.out.println(value);
        }
    }

    @Test
    //通过Iterator遍历；
    public void map3(){
        Map<String,String> map = new HashMap<>(16);
        map.put("11","正常一级");
        map.put("22","正常二级");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }

    @Test
    //不建议使用
    public void map4(){
        Map<String,String> map = new HashMap<>(16);
        map.put("11","正常一级");
        map.put("22","正常二级");
        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
    }
}
