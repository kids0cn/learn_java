package 流程控制.scanner_001;
import java.util.Scanner;

public class testScanner_0331 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //next方式获取输入
        System.out.println("next方式接收");
        if(scanner.hasNext()){
            String str = scanner.next();
            System.out.println("输入内容为"+str);
        }


        //nextline方式输入
        System.out.println("nextline方式接收");
        if(scanner.hasNext()){
        //if(scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("输入内容为：\n"+str);
        }
        scanner.close();
    }
}
