package 多线程.守护线程;

public class testDeamon {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new threadDeamon());
        t.setDaemon(true);   //设置守护线程
        t.start();
        Thread.sleep(1000);
        t.interrupt(); //终端线程
        System.out.println("主线程退出");
    }
}


class threadDeamon implements Runnable{
    @Override
    public void run() {
        while (! Thread.currentThread().isInterrupted()){
            System.out.println("线程工作中");
        }
        while(true){
            System.out.println("线程继续工作中");
        }
    }
}