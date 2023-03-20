package 多线程.线程同步.同步冲突;

//演示多个线程操作同一个变量可能产生的问题

public class testAPP {
    public static void main(String[] args) throws InterruptedException {
        Thread add = new Thread(new AddThread());
        Thread dec = new Thread(new DecThread());
        add.start();
        dec.start();

        add.join();
        dec.join();

        System.out.println(Counter.count);
    }
}

class Counter{
    public static int count = 0;
}

class AddThread implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<10000;i++){
            Counter.count += 1;
        }
    }
}

class DecThread implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<10000;i++){
            Counter.count -= 1;
        }
    }
}
