package 常用类.Random类;

import java.util.Random;

public class utilRandom {
    public static void main(String[] args) {
        method1();
        System.out.println("======");
        method2();

    }

    public static void method1(){
        Random rand = new Random();
        for (int i = 0;i<5;i++){
            int temp = rand.nextInt(100);
            System.out.println(i + ":random=" + temp);
        }
    }

    public static void method2(){
        Random rand = new Random(25);
        for (int i = 0;i<5;i++) {
            int temp = rand.nextInt(100);
            System.out.println(i + ":random=" + temp);
        }
    }

}
