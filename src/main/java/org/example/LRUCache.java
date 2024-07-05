package org.example;

import java.util.*;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 6/24/24
 * Time: 1:15 PM
 */
public class LRUCache {

    private int initSize = 0;
    private Map<Integer, Integer> cacheStore = null;

    public LRUCache(int size) {
        initSize = size;
        cacheStore= new LinkedHashMap<>(size,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > initSize;
            }
        };
    }

    public int get(int key) {
        return cacheStore.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
            cacheStore.put(key, value);
    }
}
