package com.heymysweetheart.thread;

/**
 * Created by leo on 15/8/16.
 * 一个验证死锁的例子。
 * 新建了两个object，而且必须是static类型的。
 * 解决死锁的一个办法是加大锁的力度，就像本例，synchronize(this)即可。
 * if (flag == 0) {
 synchronized (this) {
 try {
 System.out.println("执行线程的第一个锁定对象！");
 Thread.sleep(100);
 } catch (InterruptedException e) {
 e.printStackTrace();
 }

 System.out.println("There is no dead lock");
 }

 }
 */
public class TestDeadLock implements Runnable{

    int flag = 0;
    static Object o1 = new Object();
    static Object o2 = new Object();

    @Override
    public void run() {
        if (flag == 0) {
            synchronized (o1) {
                try {
                    System.out.println("执行线程的第一个锁定对象！");
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (o2) {
                    System.out.println("There is no dead lock!");
                }
            }

        }
        if (flag == 1) {
            synchronized (o2) {
                try {
                    System.out.println("执行线程的第二个锁定对象！");
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (o1) {
                    System.out.println("There is no dead lock!");
                }
            }

        }

    }

    public static void main(String[] args) {
        TestDeadLock testDeadLock1 = new TestDeadLock();
        TestDeadLock testDeadLock2 = new TestDeadLock();

        testDeadLock1.flag = 0;
        testDeadLock1.flag = 1;

        Thread t1 = new Thread(testDeadLock1);
        Thread t2 = new Thread(testDeadLock2);

        t1.start();
        t2.start();

    }
}
