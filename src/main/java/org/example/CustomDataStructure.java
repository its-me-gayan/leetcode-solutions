package org.example;

import java.util.*;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 6/23/24
 * Time: 1:12 PM
 */
public class CustomDataStructure {
    public static void main(String[] args) {
        MyDataStructure<Integer> integerMyDataStructure = new MyDataStructure<>();
//integerMyDataStructure.insert(1);
//integerMyDataStructure.insert(2);
//integerMyDataStructure.insert(3);
//integerMyDataStructure.insert(4);
//integerMyDataStructure.insert(4567);

        System.out.println(integerMyDataStructure.size());
        System.out.println(integerMyDataStructure.getRandom());
        System.out.println(integerMyDataStructure.search(0));
        integerMyDataStructure.printAll();
    }
}

class MyDataStructure<T> {

    private final ArrayList<T> elements;
    private final Map<T, Integer> dsa;
    private final Random rand;

    public MyDataStructure() {
        dsa = new HashMap<>();
        elements = new ArrayList<>();
        rand = new Random(System.currentTimeMillis());
    }

    public boolean insert(T t) {
        if (!dsa.containsKey(t)) {
            elements.add(t);
            dsa.put(t, elements.size());
        }
        return false;

    }

    public void printAll() {
        dsa.forEach((t, integer) -> System.out.println("key : " + t + " -> value : " + integer));
    }

    public int size() {
        return elements.size();
    }

    public boolean delete(T t) {
        if (dsa.containsKey(t)) {
            Integer index = dsa.get(t);
            dsa.remove(t);
            int lastIndex = elements.size() - 1;

            if (index != lastIndex) {
                Collections.swap(elements, index, lastIndex);
                dsa.put(elements.get(index), index);
            }
            elements.remove(lastIndex);
            return true;
        }
        return false;
    }

    public T search(T t) {
        if (Objects.isNull(dsa.getOrDefault(t, null))) {
            return null;
        } else {
            return t;
        }
    }

    public T getRandom() {
        if (elements.isEmpty()) {
            throw new NoSuchElementException();
        }
        return elements.get(rand.nextInt(elements.size()));
    }
}