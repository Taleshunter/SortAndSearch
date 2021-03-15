package com.company;

import java.util.List;
import java.math.*;

public class SearchMethod {

    public static <T extends Comparable<T>> Integer SequentialSearch(T[] list, T object){
        for (int i = 0; i<=list.length; i++){
            if (object == list[i]){
                return i;
            }
        }
        return null;
    }

    public static <T extends Comparable<T>> Integer SequentialSearch(List<T> list, T object){
        for (int i = 0; i<=list.size(); i++){
            if (object == list.get(i)){
                return i;
            }
        }
        return null;
    }

    public static <T extends Comparable<T>> Integer JumpSearch(T[] list, T object){
        int squarerootList = (int) Math.sqrt(list.length);
        int j = squarerootList;
        int prev = 0;

        while(list[Math.min(j-1, list.length-1)].compareTo(object)<0){
            prev = j;
            j = j+squarerootList;
            if (prev >= list.length){
                return null;
            }
        }

        while (list[prev].compareTo(object)<0){
            prev ++;
            if (prev == j || prev == list.length){
                return null;
            }
            if (list[prev] == object){
                return prev;
            }
        }
        return null;
    }

    public static <T extends Comparable<T>> Integer JumpSearch(List<T> list, T object){
        return null;
    }

    public static <T extends Comparable<T>> Integer BinarySearch(T[] list, T object){
        return null;
    }

    public static <T extends Comparable<T>> Integer BinarySearch(List<T> list, T object){
        return null;
    }
}
