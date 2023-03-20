package 异常.throws测试;

public class testAPP {
    public static void main(String[] args) {
        System.out.println((new testAPP()).testdivide(1, 0));
        //测试是否是谁调用谁处理
        //(new testAPP().divide(1,2))   //调用报错，必须要要写try-catch
    }

    public int divide(int x ,int y) throws Exception{
        int result = x/y;   //可能出现异常但是不处理
        return result;
    }

    //这里的函数中调用了上面throws的函数，并且用try-catch进行了处理
    public int testdivide(int x, int y){
        int result = 222;
        try{
            result = this.divide(x,y);
        }catch (Exception e){
            System.out.println("反正要处理");
        }
        return result;
    }
}
