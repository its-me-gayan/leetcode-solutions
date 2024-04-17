package org.example;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 4/9/24
 * Time: 10:48 PM
 */
public class TimeRequiredToBuy {
    public static void main(String[] args) {
        int[] ar = new int[]{84,49,5,24,70,77,87,8};
//        int[] ar = new int[]{2,3,2};
        int i = timeRequiredToBuy(ar, 3);
//        int i = timeRequiredToBuy(ar, 2);
        System.out.println("required time - "+i);
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int totSec = 0;

            int round = 1;
            int ticket1 = tickets[k];
        System.out.println(ticket1);
            for (int i = 0; i < ticket1; i++) {
                for (int j = 0; j < tickets.length; j++) {
                    int ticket = tickets[j];
                    if(ticket > 0){
                        tickets[j] = ticket-round;
                        totSec++;
                    }
                }
            }
        return totSec;
    }
}
