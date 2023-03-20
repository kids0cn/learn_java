package OOP.匿名内部类使用与否的区别;

public class NotUse {
    public static void main(String[] args) {
        Test t = new Test();
        t.method();
    }
}

class Test implements testInterface{

    @Override
    public void method() {
        System.out.println("实现了接口中的方法");
    }
}


