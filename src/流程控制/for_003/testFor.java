package 流程控制.for_003;

public class testFor {
    public static void main(String[] args) {
        int oddSum = 0;
        int evenSum = 0;
        int i = 0;
        int j = 100;

        for (;i<=100;i++,j--){
            if(i%2==0){
                evenSum += i;
            }else{
                oddSum += i;
            }
            System.out.println("i="+i+"\tj="+j);
        }
        System.out.println("偶数的和"+evenSum);
        System.out.println("奇数的和"+oddSum);

        for (;j<10;){
            System.out.println("j="+j++);
        }
    }

}
