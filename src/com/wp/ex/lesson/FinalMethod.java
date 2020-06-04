package com.wp.ex.lesson;

public class FinalMethod {
    
    public final String getName(String name){
        return "ww:" + name;
    }


    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        
        a = b = c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
}
