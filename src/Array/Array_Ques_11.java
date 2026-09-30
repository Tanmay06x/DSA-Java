package Array;

public class Array_Ques_11 {
    public static void main(String[] args) {

//        #11-Majority Element
        int[] arr={3,3,3,3,2,3};
        int n=arr.length/2;

        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;

                }
            }
            if(count>n){
                System.out.println(arr[i]);
                break;
            }

        }

    }
}
