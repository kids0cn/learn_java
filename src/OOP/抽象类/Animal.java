package OOP.抽象类;

public abstract class Animal {
    final static String  typeName = "地球生物";
    public void printName(){
        System.out.println("抽象类的非抽象方法");
        System.out.println(typeName);
    }
    public abstract void sing();



}
