package OOP.静态内部类;

public class StaticInnerClassTest {
    private String name = "名字";    //外部类的私有属性
    private static int age = 18;    //外部类的static属性

    public void run(){};            //外部类非静态方法
    public static void go(){};      //外部类静态方法
    private void walk(){};         //外部类私有方法

    public static void main(String[] args) {
        //System.out.println(StaticInnerClass.name);  //不能访问静态内部类的非静态属性
        System.out.println(StaticInnerClass.age);  //直接访问静态内部类的非静态方法
        //StaticInnerClass.test1("测试");  //不能访问非静态的方法，这是必然的，非静态的方法，不实例化自然不能访问
    }

    //静态内部类
    private static class StaticInnerClass{
        private String name = "静态内部类";          //静态内部类私有属性 非静态
        private static int age = 21;               //静态内部类静态属性
        public void test1(String name){            //静态内部类方法
            System.out.println(name);              //会覆盖掉外部类中的name
            System.out.println(this.name);
            System.out.println(StaticInnerClass.age);
            System.out.println(age);   // 这两个的测试其实没什么意义，因为在一个类里的资源可以访问
            //未实例化只能访问静态资源
            System.out.println(StaticInnerClassTest.age);
            //System.out.println(StaticInnerClassTest.this.name);  只有非静态内部类能这样访问资源，还是因为静态内部类加载时间不一样
            //System.out.println(StaticInnerClassTest.this.age);  //也报错了，因为thiis代表实例化后的对象嘛？
        }
    }
}
