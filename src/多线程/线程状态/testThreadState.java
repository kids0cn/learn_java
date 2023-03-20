package 多线程.线程状态;

public class testThreadState {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("线程在工作");
            try {
                Thread.currentThread().sleep(50); //当前线程睡一会儿
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程结束了");
        });


        //观测状态
        Thread.State state = thread.getState();
        System.out.println("线程未启动时的线程状态："+state);
        thread.start();
        state = thread.getState();
        System.out.println("线程启动时的线程状态："+state);
        while (state != Thread.State.TERMINATED){
            state = thread.getState();
            System.out.println("现在的线程状态是："+state);
        }
    }
}


