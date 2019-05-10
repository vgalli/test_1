package com.vgalli;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FindDuplicatesTest {

    @Test
    public void findStringDuplicateTest() {
        String[] values = new String[]{"6", "1", "2", "2", "5", "6", "1"};

        FindDuplicates<String> stringDup = new FindDuplicates<>();

        Set<String> expected = new HashSet<>(Arrays.asList("1","2", "6"));

        Set<String> dups = stringDup.findDuplicatedValues(values);

        assertEquals("Same size was expected", expected.size(), dups.size());

        for (String expDup: expected) {
            assertTrue(dups.contains(expDup));
        }
    }

    @Test
    public void findIntegerDuplicateTest() {
        Integer[] values = new Integer[]{6, 1, 2, 2, 5, 6, 1};

        FindDuplicates<Integer> stringDup = new FindDuplicates<>();

        Set<Integer> expected = new HashSet<>(Arrays.asList(1,2, 6));

        Set<Integer> dups = stringDup.findDuplicatedValues(values);

        assertEquals("Same size was expected", expected.size(), dups.size());

        for (Integer expDup: expected) {
            assertTrue(dups.contains(expDup));
        }

    }
}
