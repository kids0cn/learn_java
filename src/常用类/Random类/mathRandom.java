package 常用类.Random类;

public class mathRandom {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(i + ": math.random=" + Math.random());
            System.out.println(i + ": math.random=" + (int)(Math.random()*10));

        }
    }
}
