package Array.EasyQuestions;

public class Array_Ques_8 {
    public static void main(String[] args) {

//        #8-Missing Number

        int[] arr={9,6,4,2,3,5,7,0,1};
        for(int i=0;i<=arr.length;i++){
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
