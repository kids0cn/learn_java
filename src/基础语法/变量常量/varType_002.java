package 基础语法.变量常量;

public class varType_002 {
    public static void main(String[] args) {
        System.out.println(testVar.staticName); //静态变量可以直接调用
        testVar test = new testVar();
        System.out.println(test.publicName); // public变量需要创建对象
        test.method();
    }
}
