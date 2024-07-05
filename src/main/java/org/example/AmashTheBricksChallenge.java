package org.example;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 6/25/24
 * Time: 1:58 PM
 */
public class AmashTheBricksChallenge {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 9, 3, 2, 5, 8, 4, 6};
        int bighits = 9;
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<List<Long>> lists = smashTheBricks(bighits, collect);

        System.out.println(lists.toString());

    }

    public static List<List<Long>> smashTheBricks(int bigHits, List<Integer> newtons) {
        // Write your code here
        List<List<Long>> result = new ArrayList<>();
        Long totalBlows = 0L;
        List<Long> bricksSmashedByBigHammer = new ArrayList<>();
        List<Long> bricksSmashedBySmallHammer = new ArrayList<>();
        HashMap<Integer , Integer> indexMap = new HashMap<>();

        if(bigHits <= 0){
            for (int i = 0; i < newtons.size(); i++) {
                totalBlows+=newtons.get(i);
                bricksSmashedBySmallHammer.add(i+1L);
            }
        }else {
            totalBlows = (long) bigHits;
            for (int i = 0; i < newtons.size(); i++) {
                indexMap.put(newtons.get(i) , i+1);
            }
            newtons.sort(Comparator.reverseOrder());
            if(newtons.size() < bigHits){
                totalBlows = (long) newtons.size();
                for (Integer newton : newtons) {
                    bricksSmashedByBigHammer.add(Long.valueOf(indexMap.get(newton)));
                }

            }else {
                for (Integer newton : newtons) {
                    bricksSmashedByBigHammer.add(Long.valueOf(indexMap.get(newton)));
                }

                for (int i = bigHits; i < newtons.size(); i++) {
                    totalBlows += newtons.get(i);
                    bricksSmashedBySmallHammer.add(Long.valueOf(indexMap.get(newtons.get(i))));
                }
            }
        }


       result.add(Collections.singletonList(totalBlows));

        // Prepare result
        result.add(Collections.singletonList(totalBlows));
        result.add(bricksSmashedByBigHammer.isEmpty() ? Collections.singletonList(-1L) : bricksSmashedByBigHammer);
        result.add(bricksSmashedBySmallHammer.isEmpty() ? Collections.singletonList(-1L) : bricksSmashedBySmallHammer);

        return result;
    }
}
