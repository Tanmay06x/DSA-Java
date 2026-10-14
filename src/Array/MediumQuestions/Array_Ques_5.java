package Array.MediumQuestions;
import static java.lang.Math.min;

public class Array_Ques_5 {
    public static void main(String[] args) {
//        #5-Container with most water

        int[] arr={1,8,6,2,5,4,8,3,7};

        int n1=0;
        int n2=arr.length-1;
        int maxArea=0;
        while(n1<n2){
            int area=0;
            area=min(arr[n1],arr[n2])*(n2-n1);
            if(area>maxArea){
                maxArea=area;
            }
            if(arr[n1]<arr[n2]){
                n1++;
            }
            else{
                n2--;
            }
        }
        System.out.println(maxArea);
    }
}
