package com.heymysweetheart.thread;

/**
 * Created by leo on 15/8/16.
 */
public class TestSyncronized implements Runnable{
    Timer timer = new Timer();
    public static void main(String[] args) {
        TestSyncronized runnable= new TestSyncronized();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.setName("thread1");
        thread2.setName("thread2");
        thread1.start();
        thread2.start();
    }

    @Override
    public void run() {
        timer.add(Thread.currentThread().getName());
    }
}

class Timer {
    private static int num = 0;

    //将synchronized加在方法上，说明在执行这个方法的时候，方法所在的对象是上了锁的，即改对象在上锁期间不能被其他对象调用。
    //public synchronized void add(String name) {
    public void add(String name) {
        synchronized (this) {
            num++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
            System.out.println(name + "是第" + num + "个调用add的线程。");
        }
    }
}
