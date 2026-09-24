package Array;

public class Array_Ques_5 {
    public static void main(String[] args) {

//        #5-Maximum Subarray
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int maxSum=arr[0];
        int start=0;
        int end=0;

        for(int i=0;i<arr.length;i++){
            int sum=0;

            for(int j=i;j<arr.length;j++){
                sum+=arr[j];

                if(sum>maxSum){
                    maxSum=sum;
                    start=i;
                    end=j;
                }
            }
        }
        System.out.println("Maximum sum is: "+maxSum);
        System.out.print("Subarray is:");
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }



    }
}
