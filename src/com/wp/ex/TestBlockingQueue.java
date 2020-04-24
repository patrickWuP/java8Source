package com.wp.ex;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestBlockingQueue {

    public static void main(String[] args) {
        BlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(2);
        linkedBlockingQueue.add(2);
    }
}
