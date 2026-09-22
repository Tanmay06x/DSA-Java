package Array;

public class Array_Ques_1 {
    public static void main(String[] args) {
//      #1-Two Sum Problem (Easy)
        int[] nums={2,11,7,5};
        int target=6;

        for(int i=0;i<nums.length;i++){
            int n1=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(n1+nums[j]==target){
                    System.out.println(i+","+j);
                    return;
                }
            }
        }
    }
}
