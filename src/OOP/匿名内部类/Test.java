package OOP.匿名内部类;

public class Test {
    private String name;
    private static int age;
    public void say(){
        System.out.println("这是外部类的方法");
    };
    public static void go(){};

    public void test(){
        final int i = 90;
        Work w = new Work() {
            @Override
            public void work() {
                System.out.println(Test.this.name);//访问外部类的私有资源
                System.out.println(Test.age);  //访问外部类的静态资源
                Test.this.say();  //访问外部类的方法
                Test.go();   //访问外部类的静态方法

                System.out.println(i); //访问局部内部类所属方法的资源
            }
        };
        w.work();
    }

    public static void main(String[] args) {
        Test t =new Test();
        t.test();
    }

}
