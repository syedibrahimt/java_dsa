package com.syed.day4;

public class BuySellStock {
    private static int bruteForce(int[] stockPrices) {
        int maxProfit = 0;
        for(int buyDay = 0; buyDay<stockPrices.length-1;buyDay++) {
            for (int sellDay = buyDay+1; sellDay < stockPrices.length; sellDay++) {
                int margin = stockPrices[sellDay] - stockPrices[buyDay];
                if (margin > maxProfit) maxProfit = margin;
            }
        }
        return maxProfit;
    }

    private static int singlePass(int[] stockPrices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int currentPrice: stockPrices) {
            if (currentPrice < minPrice) minPrice = currentPrice;
            else if (currentPrice - minPrice > maxProfit) maxProfit = currentPrice-minPrice;
        }
        return maxProfit;
    }

    public static void main(String[] a) {

        System.out.println(bruteForce(new int[] {7,1,5,3,6,4}));
        System.out.println(bruteForce(new int[] {7,6,4,3,1}));

        System.out.println(singlePass(new int[] {7,1,5,3,6,4}));
        System.out.println(singlePass(new int[] {7,6,4,3,1}));

    }
}
