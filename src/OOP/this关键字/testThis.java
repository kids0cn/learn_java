package OOP.this关键字;

public class testThis {

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.printName());
        s.changeName("笑死我了");
        System.out.println(s.printName());

    }
}

class Student{
    private String name;

    public Student(){
        this("调用构造器");//this代表类自己，相当于调用了自己的有参构造
        System.out.println("无参构造运行了");
    }

    public Student(String name){
        this.name = name;
    }

    public void changeName(String name){
        this.name = name;
    }

    public String printName(){
        return this.name;
    }
}