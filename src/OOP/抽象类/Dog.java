package OOP.抽象类;

public class Dog extends Animal{
    @Override
    public void sing() {
        System.out.println("汪汪汪");
    }

    @Override
    public void printName() {
        System.out.println("这里是狗啦笨蛋");;
    }
}
