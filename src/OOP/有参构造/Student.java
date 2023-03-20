package OOP.有参构造;

public class Student {
    String name;
    //无参构造
    public Student(){
        // 显示定义无参构造
       // this();
        this("无参构造中传参给有参构造"); // 调用对象本身的有参构造

    }

    //有参构造
    public Student(String name){
        this.name = name;
        System.out.println("进入有参构造");
        System.out.println(this.name);

    }
}
