package OOP.多态;

public class Father {
    String name = "父亲";
    private Integer age = 19;
    public void testFather(){
        System.out.println("这是父类的方法");
    }

    private  void testFatherPrivate(){
        System.out.println("父亲的私有方法");
    }

    public void testRewrite(){
        System.out.println("父亲的重写");
    }
}
