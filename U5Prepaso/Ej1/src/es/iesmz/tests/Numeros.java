package es.iesmz.tests;

import java.util.ArrayList;

public class Numeros {
    private int numero;

    public static int soniguales(int a, int b, int c){
        boolean unIgual = false;
        boolean dosIgual = false;
        if (a == b && a == c){
            return 0;
        } else if (a == b){
            return 1;
        } else if (a == c) {
            return 1;
        } else if (b == c) {
            return 1;
        } else {
            return 2;
        }
    }
}
