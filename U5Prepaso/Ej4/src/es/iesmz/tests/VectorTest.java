package es.iesmz.tests;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    @org.junit.jupiter.api.Test
    void reverso1() {
        int[] v = {1,2,3,4,5,6};
        int[] resultadoEsperado = {6,5,4,3,2,1};
        int[] resultadoReal = Vector.reverso(v);
        assertArrayEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void reverso2() {
        int[] v =  {10,12,5,221,6,7};
        int[] resultadoEsperado = {7,6,221,5,12,10};
        int[] resultadoReal = Vector.reverso(v);
        assertArrayEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void reverso3() {
        int[] v = {5};
        int[] resultadoEsperado = {5};
        int[] resultadoReal = Vector.reverso(v);
        assertArrayEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void reverso4() {
        int[] v =  {5,10,20};
        int[] resultadoEsperado = {20,10,5};
        int[] resultadoReal = Vector.reverso(v);
        assertArrayEquals(resultadoEsperado, resultadoReal);
    }
}