package OOP.继承;

public class Student  extends Person{
    public Student(){
        //super();
        super("调用");
    }
    private String name = "李四";
    public void print(String name){
        System.out.println(name); //打印传入的name
        System.out.println(this.name); // 李四
        System.out.println(super.name); //父类的名字

        super.print(name);
    }
}
