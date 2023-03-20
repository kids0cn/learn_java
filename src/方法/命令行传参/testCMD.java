package 方法.命令行传参;

public class testCMD {
    public static void main(String[] args) {
        for (int i=0;i<args.length;i++){
            System.out.println("args["+i+"]"+args[i]);
        }

        for(String v:args){
            System.out.println(v);
        }
    }
}
