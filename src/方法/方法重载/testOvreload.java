package 方法.方法重载;

public class testOvreload {
    public static void main(String[] args) {
        System.out.println(max(1, 2));
        System.out.println(max(1.0, 2.0, 3.0));

    }

    public static int max(int num1,int num2){
        return num1 > num2 ? num1 : num2;
    }

    public static  double max(double num1, double num2, double num3){
        if (num1 > num2){
            return (num1>num3) ? num1 : num3;
        }else{
            return (num2>num3) ? num2 : num3;
        }
    }
}
