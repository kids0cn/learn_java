package OOP.内部类练习;

public class Out {
    private int id;
    public void out(){
        System.out.println("这是外部类方法");
    }
    class In{
        private String name = "这是内部啦";
        public void in(){
            System.out.println("这是内部类方法");
            out(); //可以直接调用外部类的方法
            Out.this.out();
            System.out.println(this.name);
        }
    }
}
