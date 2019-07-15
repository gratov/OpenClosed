package com.cegeka.bool.openclosed.exercise2;

import java.util.*;

import static java.util.Arrays.*;

public class ListSorter {
    public Collection<String> sort(String ... notsorted) {
        List<String> strings = asList(notsorted);
        //gebruik Collections.sort om strings alfabetisch te sorteren
        return strings;
    }

    public Collection<Integer> sort(Integer ... notsorted){
        List<Integer> integers = asList(notsorted);
        //gebruik Collections.sort om integers van laag naar hoog te sorteren.
        return integers;
    }

     public Collection<Integer> sortReversed(Integer ... notsorted){
        List<Integer> integers = asList(notsorted);
        //gebruik Collections.sort om integers van hoog naar laag te sorteren.
        return integers;
    }

    public Collection<String> sortReverseAlfabetically(String ... notSorted){
        List<String> notSortedList = asList(notSorted);
        //gebruik Collections.sort om Strings omgekeerd alfabetisch te sorteren.
        return notSortedList;
    }

//    public Collection<Shape> sortShapes(Shape ... notSorted)
//        List<Shape> notSortedList = asList(notSorted);
////        gebruik Collections.sort om Shapes to sorteren van klein naar groot.
//        return notSortedList;

    }
