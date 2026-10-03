package Array.EasyQuestions;

public class Array_Ques_10 {
    public static void main(String[] args) {

//        #10-Find All Numbers Disappeared in an Array

        int[] arr={4,3,2,7,8,2,3,1}; // 5, 6

        for(int i=1;i<=arr.length;i++){
            boolean found=false;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println(i);
            }
        }
    }
}
