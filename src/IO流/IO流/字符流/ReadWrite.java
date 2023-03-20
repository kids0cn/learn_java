package IO流.IO流.字符流;

import java.io.*;

public class ReadWrite {
    public static void main(String[] args) {
        try{
            writeToFile();
        }catch (IOException e){
            System.out.println("写入错误");
            System.out.println(e);
        }

        try{
            readFromFile();
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public static void readFromFile() throws IOException{
        File file = new File("~\\test.txt");
        Reader rd = new FileReader(file);
        char[] charArray = new char[(int)file.length()];
        int size = rd.read(charArray);
        System.out.println(("大小：" + size + "内容：" + new String(charArray)));
        rd.close();
    }

    public static void writeToFile() throws IOException{
        File file = new File("~\\test.txt");
        String hello = "Hello World";
        Writer os = new FileWriter(file);
        os.write(hello);
        os.close();
    }


}
