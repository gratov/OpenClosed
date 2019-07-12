package com.cegeka.bool.openclosed.exercise1;

import java.util.ArrayList;

public class ListSorter {
    public ArrayList<String> sort(ArrayList<String> notsorted){
        ArrayList<String> sorted = new ArrayList<>();

        for (String ellementToBesorted : notsorted){
             if (sorted.isEmpty()){
                 sorted.add(ellementToBesorted);
             }else{
                 int size = sorted.size();
                 for (int index = 0; index < size; index++) {
                     if(compare(sorted.get(index), ellementToBesorted)<0){
                         sorted.add(index,ellementToBesorted);
                         break;
                     }
                     if(index == size - 1){
                         sorted.add(ellementToBesorted);
                         break;
                     }
                 }
             }
        }
        return sorted;
    }

    private int compare(String sorted, String sorting) {
        //return -1 wanneer een sorting voor de reeds sorted string moet komen in de lijst
        return sorted.compareTo(sorting);
    }


    public ArrayList<String> sortAlfabetically(ArrayList<String> toBeSorted) {
        return sort(toBeSorted);
    }

    public ArrayList<String> sortReverseAlfabetically(ArrayList<String> toBeSorted) {
        return sort(toBeSorted);
    }
}
