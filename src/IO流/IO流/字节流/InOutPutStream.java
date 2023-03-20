package IO流.IO流.字节流;

import java.io.*;

//字节流读写文件
public class InOutPutStream {
    public static void main(String[] args) {
        try{
            InOutPutStream.writeByteToFile();
        }catch (IOException e){
            System.out.println(e);
        }

        try{
            InOutPutStream.readByteFromFile();
        }catch (IOException e){
            System.out.println(e);
        }

    }

    public static void writeByteToFile() throws IOException{
        String hello = new String("Hello world");
        byte[] byteArray = hello.getBytes();
        File file = new File("./test.txt");
        OutputStream os = new FileOutputStream(file);
        os.write(byteArray);
        os.close();
    }

    public static void readByteFromFile() throws IOException{
        File file = new File("./test.txt");
        byte[] byteArray = new byte[(int) file.length()];
        InputStream is = new FileInputStream(file);
        int size = is.read(byteArray);
        System.out.println("大小"+size+"；内容"+new String(byteArray));
        is.close();
    }
}
