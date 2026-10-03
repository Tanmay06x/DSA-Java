package Array.EasyQuestions;

public class Array_Ques_7 {
    public static void main(String[] args) {

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        for(int j=0;j<nums2.length;j++){
            boolean flag = false;
            for(int k=0;k<j;k++){
                if(nums2[k]==nums2[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                int i = 0;
                for (i = 0; i < nums1.length; i++) {

                    if (nums1[i] == nums2[j]) {
                        System.out.print(nums1[i] + " ");
                        break;
                    }
                }
            }
        }

    }
}