package 常用类.包装类;

public class testAPP {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    public static void method3(){
        //自动装箱拆箱
        int m = 500;
        Integer obj = m;
        int n = obj;
        System.out.println(("n= " + n));
        Integer obj1 = 500;
        System.out.println(("obj等价于obj1") + obj.equals(obj1));
    }

    public static void method2(){
        //字符串转转换为整数
        String[] str = {"123","123abc","abc123","abcxyz"};
        for(String str1:str){
            try{
                int m = Integer.parseInt(str1,10);
                System.out.println((str1 + " 可以转换成整数 " + m));
                System.out.println(("整数利用toString转换为字符串"));
                System.out.println(((Integer.toString(12345)) + "字符串"));
            }catch(Exception e){
                System.out.println((str1 + " 无法转换成整数"));
            }
        }
    }

    public static void method1(){
        //装箱手动装箱,拆箱
        int m = 500;
        Integer obj = new Integer(m); //手动装箱
        int i = obj.intValue();
        System.out.println(("i=" + i));

        Integer obj1 = new Integer(500);
        System.out.println(("obj 等价于 obj1" + obj.equals(obj1))); // true

    }
}
