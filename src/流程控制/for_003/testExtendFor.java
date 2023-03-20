package 流程控制.for_003;

public class testExtendFor {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        for (int x:numbers){
            System.out.println(x);
        }

        String[] strings = {"James","Larry","Tom"};
        for(String name:strings){
            System.out.println(name);
        }
    }
}
