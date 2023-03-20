package OOP.多态;

public class Son extends Father {
    String name = "儿子";
    public void testSon(){
        System.out.println("儿子才有的方法");
    }

    public void testRewrite(){
        System.out.println("儿子的重写");
    }
}
