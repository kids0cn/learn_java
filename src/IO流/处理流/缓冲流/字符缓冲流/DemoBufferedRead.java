package IO流.处理流.缓冲流.字符缓冲流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferedRead {
    public static void main(String[] args) throws IOException {
        method();
    }

    public static void method() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("/Users/kids/test1.txt"));

        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}
