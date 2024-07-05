package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 7/5/24
 * Time: 11:29 PM
 */
public class FindTopKFrequent {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,1,1,1,1,2,2,3,3,3,3,3,3};
        int k = 2;
        int[] ints = topKFrequent(arr, k);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        List<Pair> pairList = new ArrayList<>();

        for (int num : nums) {
            if(pairList.isEmpty()){
                pairList.add(new Pair(num , 1));
            }else {
                boolean check = false;
                for (int i = 0; i < pairList.size(); i++) {
                    Pair pair = pairList.get(i);
                    int freq = pair.getFreq();
                    if(pair.getVal() == num){
                        pair.setFreq(++freq);
                        check = true;
                    }
                }
                if(!check){
                    pairList.add(new Pair(num , 1));
                }
            }
        }

        // Bubble sort by frequency in descending order
        for (int i = 0; i < pairList.size() - 1; i++) {
            for (int j = 0; j < pairList.size() - 1 - i; j++) {
                if (pairList.get(j).getFreq() < pairList.get(j + 1).getFreq()) {
                    Pair tmp = pairList.get(j);
                    pairList.set(j, pairList.get(j + 1));
                    pairList.set(j + 1, tmp);
                }
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pairList.get(i).getVal();
        }

        return result;
    }
}

class Pair{
    int val;
    int freq;

    @Override
    public String toString() {
        return "org.example.Pair{" +
                "val=" + val +
                ", freq=" + freq +
                '}';
    }

    public Pair(int val, int freq) {
        this.val = val;
        this.freq = freq;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }
}