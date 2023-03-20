package 多线程.中断线程;

import java.util.Date;

public class testInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new MyThread());
        t.start();
        //System.out.println("当前系统时间是：" + (new Date()));
        Thread.sleep(1000); // 当前线程暂停1毫秒
        //System.out.println("当前系统时间是：" + (new Date()));
        t.interrupt(); // 中断t线程
        //t.join(); // 等待t线程结束
        System.out.println("end");
    }
}

class MyThread implements Runnable {
    public void run() {
        int n = 0;
        while (! Thread.currentThread().isInterrupted()) {
            n ++;
            System.out.println(n + " hello!");
        }
        System.out.println("线程结束时，这个后面的代码还会运行嘛");
        for (int i =0;i<1000;i++){
            System.out.println("没有结束哦"+i);
        }
    }
}
