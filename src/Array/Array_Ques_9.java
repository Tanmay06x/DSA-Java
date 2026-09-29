package Array;

public class Array_Ques_9 {
    public static void main(String[] args) {

//        #9-Single Number
        int[] arr={1,2,0,2,1,9,0};

        for(int i=0;i<arr.length;i++) {
            boolean twice = false;
            for(int j=0;j<arr.length;j++) {
                if (i!=j && arr[i] == arr[j]) {
                    twice = true;
                    break;
                }
            }
            if(!twice){
                System.out.println(arr[i]);
                break;
            }

        }


    }
}
