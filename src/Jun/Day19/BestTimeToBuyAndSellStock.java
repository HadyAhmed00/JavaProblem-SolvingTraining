package Jun.Day19;

import java.util.ArrayList;
import java.util.Collections;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        // the N solution
        int prof=0,minVal=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<=minVal){
                minVal=prices[i];

            }
            int currProf = prices[i]-minVal;
            if(currProf>prof){
                prof = currProf;
            }
        }


        return prof;
        /*
        // the N^2 solution
        ArrayList<Integer> diffs = new ArrayList<>();

        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices.length; j++) {
                if(i>=j){
                    diffs.add(prices[i]-prices[j]);
                }
            }
        }
        return Collections.max(diffs);*/
    }

    public static void main(String[] args) {
        int[] input = new int[]{10000,9999,9998,9997,9996,9995};
        System.out.println(maxProfit(input));
    }

}
