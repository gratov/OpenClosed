package com.cegeka.bool.openclosed.excercise3;

import com.cegeka.bool.openclosed.excercise3.ListSorter;
import com.cegeka.bool.openclosed.exercise1.shapes.Rectangle;
import com.cegeka.bool.openclosed.exercise1.shapes.Triangle;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

public class ListSorterTest {

    private ListSorter listSorter = new ListSorter();

    @Test
    public void sortAlfabetically() {
        Collection<String> sorted = listSorter.sort("AA","BB","BA","ZZ","AB","HH");
        assertThat(sorted).containsExactly("AA","AB","BB","BA","HH","ZZ");
    }

    @Test
    public void sortNumericallyLowToHigh() {
        Collection<Integer> sorted = listSorter.sort(1,2,3,4,5,6,7,8,9,10,15,20);
        assertThat(sorted).containsExactly(1,2,3,4,5,6,7,8,9,10,15,20);
    }

    @Test
    public void sortNumericallyHighToLow() {
        Collection<Integer> sorted = listSorter.sort(1,2,3,4,5,6,7,8,9,10,15,20);
        assertThat(sorted).containsExactly(20,15,10,9,8,7,6,5,4,3,2,1);
    }

    @Test
    public void sortReverseAlfabetically() {
        Collection<String> sorted = listSorter.sortReverseAlfabetically("AA","BB","BA","ZZ","AB","HH");
        assertThat(sorted).containsExactly("ZZ","HH","BB","BA","AB","AA");
    }

    @Test
    public void sortshapes() {
//        Collection<Shape> sorted = listSorter.sortSmallToLarge(new Triangle(2,11),new Rectangle(2,5),new Triangle(5,10));
//        assertThat(sorted).containsExactly(new Rectangle(2,5),new Triangle(2,11),new Triangle(5,10));
    }



}