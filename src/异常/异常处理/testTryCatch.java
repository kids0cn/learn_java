package 异常.异常处理;

public class testTryCatch {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try{
            if (b==0) throw new ArithmeticException();
            System.out.println("这些不会被打印，因为异常跳出了");
        }catch (ArithmeticException e){
            System.out.println("被除数不能为0"+ e);
        }
        System.out.println("程序正常结束");
    }
}
