package 流程控制.break语句;

public class testBreak {
    public static void main(String[] args) {
        int i=0;
        while (i<100){
            i++;
            System.out.println(i);
            if (i==30){
                break;
            }
        }
        System.out.println("跳到出循环");
    }
}
