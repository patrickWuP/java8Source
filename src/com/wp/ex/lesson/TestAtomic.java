package com.wp.ex.lesson;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class TestAtomic {

    public static void main(String[] args) {
        /*AtomicInteger i1 = new AtomicInteger(666666);
        
        AtomicInteger i2 = new AtomicInteger(2);

        System.out.println(i1.toString());
        System.out.println(i1.getAndUpdate(data -> data / 2));
        System.out.println(i1.get());*/
//        int[] intArr = new int[]{2,4,5,7,8};

//        AtomicIntegerArray atomicIntegerArray1 = new AtomicIntegerArray(intArr);
//        AtomicIntegerArray atomicIntegerArray2 = new AtomicIntegerArray(intArr);

//        System.out.println(Integer.numberOfLeadingZeros(8));
        
        /*Man man = new Man();
        Man man1 = new Man();
        
        Woman woman = new Woman();

        AtomicIntegerFieldUpdater updater = AtomicIntegerFieldUpdater.newUpdater(man.getClass(),"age");
        
        updater.addAndGet(man,20);
        updater.addAndGet(man1,40);
        updater.addAndGet(woman,20);*/

        /*SoftReference<Man> manSoftReference = new SoftReference<>(new Man());
        System.out.println(manSoftReference.get().age);
        Woman woman = new Woman();
        AtomicMarkableReference markableReference = new AtomicMarkableReference(manSoftReference,true);
        
        markableReference.compareAndSet(manSoftReference,woman,true,false);

        System.out.println(markableReference.getReference());*/
        
        Man wp = new Man();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AtomicReferenceFieldUpdater.newUpdater(wp.getClass(),Integer.class,"age");
        atomicReferenceFieldUpdater.compareAndSet(wp,null,100);

        System.out.println(wp.age);
    }
}
