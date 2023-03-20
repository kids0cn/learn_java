package IO流.处理流.性能对比;

import java.io.*;

public class testEfficiency {
    public static void main(String[] args) throws IOException{
        long method1StartTime = System.currentTimeMillis();
        method1();
        long method1EndTime = System.currentTimeMillis();
        System.out.println(("使用方法一，文件复制时间为（毫秒）：" + (method1EndTime - method1StartTime)));
        
        long method2StartTime = System.currentTimeMillis();
        method2();
        long method2EndTime = System.currentTimeMillis();
        System.out.println(("使用方法二，文件复制时间为（毫秒）：" + (method2EndTime - method2StartTime)));
        
        long method3StartTime = System.currentTimeMillis();
        method3();
        long method3EndTime = System.currentTimeMillis();
        System.out.println(("使用方法三，文件复制时间为（毫秒）：" + (method3EndTime - method3StartTime)));
        
        


    }

    //不使用缓冲区，一次读取一个字节的方式进行处理
    public static void method1() throws IOException{
        FileInputStream fis = new FileInputStream("/Users/kids/test.png");
        FileOutputStream fos = new FileOutputStream("/Users/kids/test1.png");

        int len = 0;
        while((len=fis.read()) != -1){
            fos.write(len);
        }

        fis.close();
        fos.close();
    }


    public static void method2() throws IOException{
        FileInputStream fis = new FileInputStream("/Users/kids/test.png");
        FileOutputStream fos = new FileOutputStream("/Users/kids/test1.png");

        byte[] bytes = new byte[1024];
        int len = 0;
        while((len=fis.read(bytes)) != -1){
            fos.write(len);
        }

        fis.close();
        fos.close();
    }


    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/kids/test.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/kids/test1.png"));

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        bis.close();
        bos.close();
    }


}
