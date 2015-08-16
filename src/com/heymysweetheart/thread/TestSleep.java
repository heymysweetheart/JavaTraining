package com.heymysweetheart.thread;

import java.util.Date;

/**
 * Created by leo on 15/8/16.
 * @author leo
 */
public class TestSleep {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();

        try {
            Thread.sleep(10000); //The current thread(main thread) will sleep 10s.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myThread.flag = false;  //modify variable of the thread to end the thread.
        //thread.interrupt();    //send the interrupt cmd to the thread so that the target thread could catch the InterruptedException
        //while sleeping.
    }
}

class MyThread implements Runnable {
    boolean flag = true;
    public void run() {
        while (flag) {
            System.out.println("=====" + new Date() + "=====");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}