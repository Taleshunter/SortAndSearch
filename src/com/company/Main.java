package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer intarr[] = {10,7,8,9,5,4,3,11,2,1,6};
        Integer intarr2[] = {1,2,3,4,5,6,7,8,9,10,11,12};

        List<String> names = new ArrayList<>();
        names.add("Jon");
        names.add("Martin");
        names.add("Tim");
        names.add("Basira");
        names.add("Melanie");

        Integer indexOfElement = SearchMethod.BinarySearch(intarr2, 11,0,intarr2.length);

        if (indexOfElement != null)
            System.out.println("in intarr 11 is at index: " + indexOfElement + " and we retrieved " + intarr2[indexOfElement]);

        indexOfElement = SearchMethod.SequentialSearch(names, "Martin");

        if (indexOfElement != null)
            System.out.println("in names Martin is at index: " + indexOfElement + " and we retrieved " + names.get(indexOfElement));
    }
}
