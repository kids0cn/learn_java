package 异常.final测试;

public class testFinal {
    static void proc1(){
        try{
            System.out.println("inside Proc1");
            throw new RuntimeException("demo");
        }finally {
            System.out.println("Proc1's finally");
        }
    }

    static int proc2(){
        try{
            System.out.println("inside Proc2");
            return 3;
        }finally {
            System.out.println("Proc2's finally");
        }
    }

    static void proc3(){
        try{
            System.out.println("inside proc3");
        }finally {
            System.out.println("Proc3's finally");
        }
    }

    public static void main(String[] args) {
        try{
            proc1();
        }catch (Exception e){
            System.out.println("Exception");
        }
        System.out.println(proc2());
        proc3();
    }
}
