package 多线程.中断线程;

public class testFlag {
    public static void main(String[] args) {
        threadFlag t1 = new threadFlag();
        new Thread(t1).start();

        for(int i=0;i<=1000000;i++){
            if (i == 90000){
                System.out.println("线程准备终止");
                t1.stopThread();
                System.out.println("线程终止");
            }

        }
    }
}

class threadFlag implements Runnable{
    private boolean flag = true;  //设置一个标志位

    @Override
    public void run() {
        int i = 0;
        while(flag){
            System.out.println(Thread.currentThread().getName() + "正在运行"+i++);

        }
    }

    public void stopThread(){  //设置一个可以访问的方法来改变线程的状态
        this.flag = false;
    }
}

