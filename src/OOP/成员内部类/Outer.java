package OOP.成员内部类;

public class Outer {
    private int id;
    public void out(){
        System.out.println("这是外部类方法");
    }
    class Inner{
        public void in(){
            System.out.println("这是内部类方法");
        }
    }
}
