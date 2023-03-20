package OOP.局部内部类;

public class Outer {
    private int id = 18;
    public void outMethod(){
        System.out.println("外部方法");
    }

    public void method(){
        System.out.println("这是方法体");
        final String name = "这是常量";
        class inMethodClass{
            private int age = 21;
            public void in(){
                System.out.println("这是局部内部类");
                System.out.println(name);
            }
        }

        inMethodClass in = new inMethodClass(); //在方法中直接实例化
        in.in(); //调用局部内部类的方法
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        out.outMethod();  //调用外部类的方法
        out.method();
    }
}
