public class BestTimeToBuyAndSellStock {

  public static void main(String[] args) {
    // read input
    int[] prices = {7, 1, 5, 3, 6, 4};
    int i = maxProfit(prices);
    System.out.println(i);
  }

  private static int maxProfit(int[] prices) {
    // first element
    int buy = prices[0];
    // variable to hold profit
    int maxProfit = 0;
    // iterate over elements
    for (int i = 1; i < prices.length; i++) {
      int price = prices[i];
      // if bigger swap elements
      if (buy > price) {
        buy = price;
      } else if (price - buy > maxProfit) {
        // new profit
        maxProfit = price - buy;
      }
    }
    // return profit
    return maxProfit;
  }
}
