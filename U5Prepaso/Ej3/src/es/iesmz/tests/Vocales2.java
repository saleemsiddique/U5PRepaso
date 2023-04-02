package es.iesmz.tests;

public class Vocales2 {

    public static String sinvocales(String cadena){
        final char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        StringBuilder cadenaSinVocales = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            boolean esVocal = false;
            for (int j = 0; j < vocales.length; j++) {
                if (cadena.charAt(i) == vocales[j]){
                    esVocal = true;
                    break;
                }
            }
            if (!esVocal) {
                cadenaSinVocales.append(cadena.charAt(i));
            }
        }
        return cadenaSinVocales.toString();
    }
}
