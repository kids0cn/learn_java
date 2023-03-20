package 常用类.File类;

import java.io.File;
import java.io.IOException;

public class testFile {
    public static void main(String[] args) {
        File f = new File("/Users/kids/test1");
        File f2 = new File("/Users/kids");
        File f3 = new File(f2,"test2");
        File f4 = new File(f2,"test3");
        File f5 = new File("/Users/kids/test/test");
        File f6 = new File(f5,"test5");

        try {
            //f4.createNewFile();
            System.out.println(("文件创建成功"));
            f5.createNewFile();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
