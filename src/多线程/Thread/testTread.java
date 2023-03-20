package 多线程.Thread;

public class testTread {
    public static void main(String[] args) {
        startThread t = new startThread();
        startThread t1 = new startThread();
        Thread t2 = new Thread(new runnableThread());
        t.start();
        t1.start();
        t2.start();
    }


}


class startThread extends Thread{
    public void run() {
        for (int i = 0;i < 10;i++){
            System.out.println("我在听课"+i);
        }
    }
}

class runnableThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable的方式启动新线程");
    }
}