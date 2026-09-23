package Array;

public class Array_Ques_4 {
    public static void main(String[] args) {

        // #4 - Best Time to Buy and Sell Stock
        int[] arr = {2,4,1};

        int minElem=arr[0];
        int maxProfit=0;
        int buyingPrice=0;
        int sellingPrice=0;

        for(int i=1;i<arr.length;i++){
            int profit=arr[i]-minElem;

            if(profit>maxProfit){
                maxProfit=profit;
                buyingPrice=minElem;
                sellingPrice=arr[i];
            }
            if(minElem>arr[i]){
                minElem=arr[i];
            }
        }
        System.out.println("Maximum Profit is "+maxProfit);
        System.out.println("Buying Price is "+buyingPrice);
        System.out.println("Selling Price is "+sellingPrice);

    }
}