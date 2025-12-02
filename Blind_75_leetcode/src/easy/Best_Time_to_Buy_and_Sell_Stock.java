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
        //các case ban đầu(bắt đầu)
        int buy = prices[0];
        int sell = 0;
        int profit = 0;
        
        
        /*
        Khi gặp giá [trị nhỏ hơn] giá trị mua vào lập tức để giá trị mua và bán tại [giá trị nhỏ hơn] đó
        Nếu giá trí tiếp theo được quét lớn hơn giá trị mua vào và profit sau tính toán lớn hơn profit hiện tại--> thay đổi giá trị profit
        nếu không thì tiếp tục quét phần tử tiếp theo(bỏ qua việc cập nhật profit)
        */
        for (int i = 1; i < prices.length; i++) { 
            if (prices[i] < buy) {
                buy = prices[i];
                sell = prices[i];
            } else {
                sell = prices[i];
            }
            if (sell - buy > profit) {
                profit = sell - buy;
            }
        }
        return profit;
    }
}
