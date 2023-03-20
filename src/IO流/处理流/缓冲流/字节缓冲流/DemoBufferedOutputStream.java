package IO流.处理流.缓冲流.字节缓冲流;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoBufferedOutputStream {
    public static void main(String[] args) throws IOException { //因为method抛出了异常，我又没处理，只能继续交给上层处理
        method();
    }

    public static void method() throws IOException{
        //创建FileOutputStream对象，绑定对象输出地址
        FileOutputStream fos = new FileOutputStream("/Users/kids/test.txt",true);
        //构造BufferedOutputStream对象，将fos传入buffer
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //使用bos的write方法，写入内部缓冲区
        byte[] temp = "abc".getBytes();
        bos.write(temp);

        bos.flush();

        bos.close();
    }
}
