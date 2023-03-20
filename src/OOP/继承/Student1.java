package OOP.继承;

public class Student1 extends Person{
    private String name = "王八蛋";


    public void print(String name){
        System.out.println("这是子类的print");
        super.print("方法内调用父级方法");

        //System.out.println(super.age); //访问不了
        //super.print(super.age);  访问不了
    }
    {
        System.out.println("代码块");
    }
    {
        System.out.println("代码块会实例化时顺序运行");
    }

}
