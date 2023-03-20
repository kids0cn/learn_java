package 流程控制.scanner_001;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class testScanner1 {
    public static void main(String[] args) {
        Scanner testScan = new Scanner(System.in);
        System.out.println("hasNext");

        if(testScan.hasNext()){
            String str = testScan.next();
            System.out.println("输入内容 "+str);
        }

        String sc = testScan.nextLine();

        System.out.println("hasNextLine");
        if(testScan.hasNextLine()){
            String str = testScan.nextLine();
            System.out.printf("输入内容: " + str);
        }
        testScan.close();
    }

}
