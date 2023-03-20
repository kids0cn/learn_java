package 流程控制.switch_002;

public class testSwitch {
    public static void main(String[] args) {
        String name = "笑";


        switch (name){
            case "金":
                System.out.println(name);
                break;
            case "山":
                System.out.println(name);
                break;
            case "笑":
                System.out.println(name); //没有break胡穿透
            default:
                System.out.println(name);

        }
    }
}
