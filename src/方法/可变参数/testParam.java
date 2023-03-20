package 方法.可变参数;

public class testParam {
    public static void main(String[] args) {
        printMax(1,19,3,5,6);
        printMax(new double[]{1,2,3,4,5});
    }

    public static void printMax(double... numbers){
        if (numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];
        for (int i = 1;i<numbers.length;i++){
            if (numbers[i] > result){
                result = numbers[i];
            }
        }
        System.out.println("The max value is "+ result);
    }
}
