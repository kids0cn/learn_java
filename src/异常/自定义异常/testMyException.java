package 异常.自定义异常;

public class testMyException {
    static void compute(int a) throws MyException{
        if (a>10){
            throw new MyException(a);
        }
    }

    public static void main(String[] args) {
        try{
            compute(20);
        }catch (MyException e){
            System.out.println(e);
        }
    }
}


class MyException extends Exception{
    private int details;
    MyException(int a){  //构造器
        details = a;
    }
    public String toString(){
        return "MyException ["+details+ "]";
    }
}