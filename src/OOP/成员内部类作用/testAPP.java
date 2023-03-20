package OOP.成员内部类作用;

public class testAPP {
    public static void main(String[] args) {
        //实例化内部类分为两步
        //1.实例化外部类
        Outer out = new Outer();
        //2.通过外部类调用内部类
        Outer.Inner in = out.new Inner();
        in.in();
    }
}
