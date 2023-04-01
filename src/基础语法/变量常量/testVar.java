package 基础语法.变量常量;

public class testVar {
    public String publicName = "publicName"; //实例变量、成员变量
    int i; //实例变量 成员变量 初始化为 成员默认值 0
    static String staticName = "staticName";  //静态变量，类一存在就有的变量
    private String privateName = "privateName";



    public void method(){
        String methodName = "methodName";
        System.out.println("进入方法");
        System.out.println(staticName);
        System.out.println(publicName);
        System.out.println(privateName);
        System.out.println(methodName);
        System.out.println("i="+i);
    }

}
