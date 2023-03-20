package 方法.可变参数;

public class testParam1 {
    public static void main(String[] args) {
        printMin(1,12,3,4,19);
        printMin(new int[]{1,2,3,4,0});
    }

    public static void printMin(int ... nums){
        if (nums.length == 0){
            System.out.println("没有参数");
            return;
        }

        int result = nums[0];
        for(int i = 1;i<nums.length;i++){
            if (result > nums[i]){
                result = nums[i];
            }
        }
        System.out.println("min nums: "+ result);
    }
}


