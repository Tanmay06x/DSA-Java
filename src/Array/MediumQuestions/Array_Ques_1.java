package Array.MediumQuestions;

public class Array_Ques_1 {
    public static void main(String[] args) {
//        #1-Rotate Array
        int[] arr={1,2,3,4,5,6,7};
        int[] arr2=new int[arr.length];

        int k=3;
        int j=0;
        int s=arr.length-k;

        for(int i=0;i<arr.length;i++){
            if(s<arr.length){
                arr2[i]=arr[s];
                s++;
            }
            else{
            arr2[i]=arr[j];
            j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
