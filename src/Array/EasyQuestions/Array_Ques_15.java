package Array.EasyQuestions;

public class Array_Ques_15 {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        int count=0;
        for(int i=0;i<arr.length;i++){
            int digit=0;
            int num=arr[i];
            while(num>0){
                num=num/10;
                digit++;
            }
            if(digit%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
