package com.company;

import java.util.List;

public class SortingMethods {

    public static <T extends Comparable<T>> void BubbleSort(T[] list){
        boolean performedSwap;
        for (int i=0; i<list.length+1; i++){
            performedSwap = false;
            for(int j=0; j< list.length-1-i; j++){
                if (list[j].compareTo(list[j+1])>0){
                    T temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    performedSwap = true;
                }
            }
            if (!performedSwap){
                System.out.println("Left at iteration number: " + i);
                return;
            }
        }
    }
}