package com.vgalli;

import java.util.HashSet;
import java.util.Set;

/**
 * This class is responible to find Duplicated values
 * @param <T>
 */
public class FindDuplicates<T> {

    /**
     * Find Duplicated values
     * @param array T Array of values
     * @return Set<T> Duplicated values
     */
    public Set<T> findDuplicatedValues(T... array) {

        Set<T> values = new HashSet<>();
        Set<T> dupValues = new HashSet<>();

        for (T value : array) {
            if (values.contains(value)){
                dupValues.add(value);
            } else {
                values.add(value);
            }
        }

        return dupValues;
    }
}
