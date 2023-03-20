package OOP.成员内部类作用;

public class Outer {
    private int id;
    private void out(){
        System.out.println("这是外部类方法");
    }

    class Inner{
        private String name = "Inner";
        public void in(){
            System.out.println("这是内部类方法");
            System.out.println((id + 3)); //id的默认值为0
            out(); //直接调用外部类的私有方法
            Outer.this.out();
            System.out.println(this.name);
        }
    }
}
