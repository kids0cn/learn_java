package 流程控制.scanner_001;

import java.util.Scanner;

public class testScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //next 方式获取字符串
        System.out.println("next方式接收");
        if(scanner.hasNext()){
            String str = scanner.next();
            System.out.println("输入内容："+str);
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("以nextline方式接收");
        if(scanner.hasNextLine()){
            String str = scanner1.nextLine();
            System.out.println("输入内容:"+str);
        }

        scanner.close();
    }
}
