package OOP.代码块;

public class testAPP {
    static Integer countContruct = 1;  //计算构造器执行次数
    static Integer countAnony = 1;  //计算匿名代码块执行次数
    static Integer countStatic = 1; //计算静态代码块执行次数
    public testAPP(){
        System.out.println("构造器,创建对象时执行一次"+countContruct++);
    }

    static {
        //静态代码块
        System.out.println("第一次床架对象的时候执行一次");
        System.out.println("静态代码块"+countStatic++);
    }
    {
        //匿名代码块
        System.out.println("每次实例化的时候执行一次");
        System.out.println("匿名代码块"+countAnony++);
    }

    public static void main(String[] args) {
        testAPP t1 = new testAPP();
        testAPP t2 = new testAPP();
        testAPP t3 = new testAPP();
    }
}
