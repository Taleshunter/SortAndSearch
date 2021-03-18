package com.company;

public class Printing {

    public static <T> void PrintArray(T[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
