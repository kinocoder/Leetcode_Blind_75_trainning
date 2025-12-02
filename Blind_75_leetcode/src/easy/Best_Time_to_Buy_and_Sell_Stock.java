/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/**
 *
 * @author D E L L
 */
public class Best_Time_to_Buy_and_Sell_Stock {
      public int maxProfit(int[] prices) {
        int buy = prices[0];
          int sell = 0;
          int profit = 0;
          for (int i = 1; i < prices.length; i++) {
              if(prices[i]<buy){
                  buy = prices[i];
                  sell = prices[i];
              }else{
                  sell = prices[i];
              }
              if(sell-buy>profit){
                  profit = sell - buy;
              }  
          }
        return profit;
    }
}
