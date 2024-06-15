
public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int min = prices[0];
        int ind =0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
                ind = i;
            }
        }
        int max = prices[ind];
        for(int j=ind;j<prices.length;j++){
            if(prices[j]>max){
                max=prices[j];
            }
        }
        
        System.out.println(Math.abs(max-min));
    }
}