package 基础语法.数据类型;

import org.omg.CORBA.INTERNAL;

import java.sql.SQLOutput;

public class dataType_001 {
    public static void main(String[] args) {
        // 1.基本数据类型:默认值和内存占用
        byte typeByte = 1;
        short typeShort = 1;
        int typeInt = 1;
        long typeLong = 1;

        float typeFloat = (float)1.0;
        double typeDouble = 1.0;


        char typeChar = 'A';

        System.out.println(typeByte+"："+Byte.SIZE/8+"\tMAX\t"+Byte.MAX_VALUE+"MIN\t"+Byte.MIN_VALUE);
        System.out.println(typeShort+"："+Short.SIZE/8+"\tMAX\t"+Short.MAX_VALUE+"MIN\t"+Short.MIN_VALUE);
        System.out.println(typeInt+"："+Integer.SIZE/8+"\tMAX\t"+Integer.MAX_VALUE+"MIN\t"+Integer.MIN_VALUE);
        System.out.println(typeLong+"："+Long.SIZE/8+"\tMAX\t"+Long.MAX_VALUE+"MIN\t"+Long.MIN_VALUE);
        System.out.println(typeFloat+"："+Float.SIZE/8+"\tMAX\t"+Float.MAX_VALUE+"MIN\t"+Float.MIN_VALUE);
        System.out.println(typeDouble+"："+Double.SIZE/8+"\tMAX\t"+Double.MAX_VALUE+"MIN\t"+Double.MIN_VALUE);
        System.out.println(typeChar+"："+Character.SIZE/8+"\tMAX\t"+Character.MAX_VALUE+"MIN\t"+Character.MIN_VALUE);

        int i1 = 10;
        int i2 = 010;
        int i3 = 0x10;

        System.out.println("原始值");
        System.out.println(i1);  //10    默认显示的是二进制，并自动进行转换
        System.out.println(i2);  //8
        System.out.println(i3);  //16
        //进制转换
        System.out.println("进制转换");
        System.out.println(Integer.toBinaryString(i1));
        System.out.println(Integer.toHexString(i1));
        System.out.println(Integer.toOctalString(i1));

        // 类型转换
        System.out.println(((int) 4.3 == 4));



    }
}
