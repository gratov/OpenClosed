package com.cegeka.bool.openclosed.exercise1;

import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ListSorterTest {

    private ListSorter listSorter = new ListSorter();

    @Test
    public void sortAlfabetically_sortsOnlyOnFirstLetter() {
        ArrayList<String> toBeSorted = new ArrayList<>();
        toBeSorted.add("AA");
        toBeSorted.add("BB");
        toBeSorted.add("BA");
        toBeSorted.add("ZZ");
        toBeSorted.add("AB");
        toBeSorted.add("HH");

        ArrayList<String> sorted = listSorter.sort(toBeSorted);

        assertThat(sorted).containsExactly("AA","AB","BB","BA","HH","ZZ");

    }

    @Test
    public void sortAlfabetically_sortsOnAllLetters() {
        ArrayList<String> toBeSorted = new ArrayList<>();
        toBeSorted.add("AA");
        toBeSorted.add("BB");
        toBeSorted.add("BA");
        toBeSorted.add("ZZ");
        toBeSorted.add("AB");
        toBeSorted.add("HH");

        ArrayList<String> sorted = listSorter.sort(toBeSorted);

        assertThat(sorted).containsExactly("AA","AB","BA","BB","HH","ZZ");

    }

    @Test
    public void sortReverseAlfabetically_sortsOnAllLetters() {
        ArrayList<String> toBeSorted = new ArrayList<>();
        toBeSorted.add("AA");
        toBeSorted.add("BB");
        toBeSorted.add("BA");
        toBeSorted.add("ZZ");
        toBeSorted.add("AB");
        toBeSorted.add("HH");

        ArrayList<String> sorted = listSorter.sortReverseAlfabetically(toBeSorted);

        assertThat(sorted).containsExactly("ZZ","HH","BB","BA","AB","AA");

    }

}