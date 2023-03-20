package OOP.抽象类;

public class testAPP {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        //子类继承
        cat1.sing();
        dog1.sing();

        cat1.printName();
        dog1.printName();
    }


}
