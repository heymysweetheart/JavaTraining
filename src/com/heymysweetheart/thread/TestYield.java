package com.heymysweetheart.thread;

/**
 * Created by leo on 15/8/16.
 */
public class TestYield {
    public static void main(String[] args) {
        YieldThread t1 = new YieldThread("T1");
        YieldThread t2 = new YieldThread("T2");
        t1.start();
        t2.start();
    }
}

class YieldThread extends Thread {

    YieldThread(String name) {
        super(name);
    }
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + " is running: " + i);
            if((i % 5) == 0) {
                yield();  //A hint to the scheduler that the current thread is willing to yield its current use of a processor.
            }
        }
    }
}
