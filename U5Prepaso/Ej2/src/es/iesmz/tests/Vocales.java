package es.iesmz.tests;

public class Vocales {

    public static int contarvocales(String cadena){
        final char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int contVocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (cadena.charAt(i) == vocales[j]){
                    contVocales++;
                }
            }
        }
        return contVocales;
    }
}
