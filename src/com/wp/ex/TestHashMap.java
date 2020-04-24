package com.wp.ex;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {
        Map a = new HashMap(1,1);
        a.put("ass","sfdes");
        //以下key在tab的同一个索引处，通过node节点进行连接
//        a.put("a",2);
//        a.put("q",5);
        
        //
        a.put("b",2);
        a.put("r",5);
        /*List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        List<Integer> list = Collections.synchronizedList(data);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

        System.out.println(list);*/
    }
}
