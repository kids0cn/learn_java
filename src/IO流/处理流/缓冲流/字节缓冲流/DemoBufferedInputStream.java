package IO流.处理流.缓冲流.字节缓冲流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DemoBufferedInputStream {
    public static void main(String[] args) throws IOException {
        method();
    }

    public static void method() throws  IOException{
        FileInputStream fis = new FileInputStream("/Users/kids/test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        int temp = 0;
        while (temp != -1){
            temp = bis.read();
            System.out.println(temp);
        }

        bis.close();
        fis.close();
    }
}
