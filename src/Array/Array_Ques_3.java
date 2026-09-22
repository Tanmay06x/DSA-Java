package Array;

public class Array_Ques_3 {
    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 3, 2};
        int j=0;
        for(int i=0;i<nums.length;i++){
            int n1=nums[i];
            if(n1 !=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}