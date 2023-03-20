package OOP.匿名内部类使用与否的区别;

public class User {
    public static void main(String[] args) {
        new testInterface(){
            @Override
            public void method() {
                System.out.println("使用匿名内部类实现接口方法");
            }
        }.method();
    }
}
