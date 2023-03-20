package OOP.继承;

public class Person {
    protected String name = "张三";
    private  Integer age = 19;

    public Person(){
        System.out.println("无参构造器");
    }
    public Person(String name){
        System.out.println("有参构造器"+name);
    }

    public void print(String name){
        System.out.println("这是父类"+name);
    }
}

