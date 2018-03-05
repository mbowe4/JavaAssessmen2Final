package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility<T> {


    public ArrayUtility() {
    }

    public T countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        int counter = 0;
        for (int i = 0; i < arrayToMerge.length; i++) {
            if (valueToEvaluate.equals(arrayToMerge[i])) {
                counter++;
            }
        }
        return null;
    }
}
