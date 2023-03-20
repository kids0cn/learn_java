package 多线程.死锁;

public class testDeadLock {
    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new threadA());
        Thread b = new Thread(new threadB());
        b.start();
        a.start();
        a.join();
        b.join();
        System.out.println("线程结束");
    }
}

class Counter{
    public static final Object lockA = new Object();
    public static final Object lockB = new Object();

    public static int  count = 0;

    public void add(int m) {
        synchronized(lockA) { // 获得lockA的锁
            this.count += m;
            synchronized(lockB) { // 获得lockB的锁
                this.count += m;
            } // 释放lockB的锁
        } // 释放lockA的锁
    }

    public void dec(int m) {
        synchronized(lockA) { // 获得lockB的锁
            this.count -= m;
            synchronized(lockB) { // 获得lockA的锁
                this.count -= m;
            } // 释放lockA的锁
        } // 释放lockB的锁
    }
}

class threadA implements Runnable{
    Counter counter = new Counter();
    @Override
    public void run() {
        for (int i = 0;i<10000;i++){
            counter.add(i);
        }
        System.out.println(Counter.count);
        for (int i = 0;i<10000;i++){
            counter.dec(i);
        }
        System.out.println(Counter.count);
    }
}

class threadB implements Runnable{
    Counter counter = new Counter();
    @Override
    public void run() {

        for (int i = 0;i<10000;i++){
            counter.dec(i);
        }
        System.out.println(Counter.count);
        for (int i = 0;i<10000;i++){
            counter.add(i);
        }
        System.out.println(Counter.count);
    }
}