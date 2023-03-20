package 基础语法.变量常量;

public class testVar {
    public String publicName = "publicName";
    static String staticName = "staticName";  //静态变量，类一存在就有的变量
    private String privateName = "privateName";



    public void method(){
        String methodName = "methodName";
        System.out.println("进入方法");
        System.out.println(staticName);
        System.out.println(publicName);
        System.out.println(privateName);
        System.out.println(methodName);
    }

}
