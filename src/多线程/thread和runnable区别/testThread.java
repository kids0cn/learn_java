package 多线程.thread和runnable区别;

public class testThread implements Runnable{
    private int ticketNums = 10;

    @Override
    public void run() {
        while(true){
            if (ticketNums <= 0){
                break;
            }
            System.out.println(Thread.currentThread().getName() + "拿到了--->" + ticketNums-- + "票");


        }
    }

    public static void main(String[] args) {
        testThread ticket = new testThread(); //runnable的对象
        new Thread(ticket,"小明").start();
        new Thread(ticket,"老师").start();
        new Thread(ticket,"黄牛党").start();
    }
}
