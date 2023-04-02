package es.iesmz.tests;

import java.util.Arrays;
import java.util.Collections;

public class Vector {

    public static int[] reverso(int[] v) {
        Integer[] temp = new Integer[v.length];
        for (int i = 0; i < v.length; i++) {
            temp[i] = v[i];
        }
        Collections.reverse(Arrays.asList(temp));
        int[] reversedArray = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            reversedArray[i] = temp[i];
        }
        return reversedArray;
    }
}
