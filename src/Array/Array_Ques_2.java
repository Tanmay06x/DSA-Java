package Array;

public class Array_Ques_2 {
    public static void main(String[] args) {

//        #2-Contains Duplicate(Easy)
        int[] nums={1,2,3,2};
        boolean twice=false;

        for(int i=0;i<nums.length;i++){
            int n1=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(n1==nums[j]){
                    twice=true;
                    break;
                }
            }
        }
        System.out.println(twice);
    }
}
