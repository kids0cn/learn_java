package IO流.处理流.缓冲流.字符缓冲流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DemoBufferedWrite {
    public static void main(String[] args) throws IOException {
        method();
    }

    public static void method() throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/kids/test1.txt"));
        bw.write("这是字符串写入测试");
        bw.flush();
        bw.close();
    }
}
