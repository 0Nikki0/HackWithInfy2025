public class Problem1_BuyTwoChocolates {
    public static void main(String[] args) {
        int prices[] = {3,2,3};
        int money = 3;
        System.out.println(buyChocolates(prices, money));
    }

    public static int buyChocolates(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i = 0; i<prices.length; i++){
            if(prices[i]<min){
                min2 = min;
                min = prices[i];
            }else if(prices[i]<min2){
                min2 = prices[i];
            }
        }
        int sum = min + min2;
        if(sum>money){
            return money;
        }else{
            return money - sum;
        }
    }
}
