package com.mycompany.practicasestructura;

import java.text.Normalizer;

/**
 *
 * @author tavo123
 */
public class RecursividadPalindromo {

    // Método recursivo principal
    public static boolean esPalindromo(String s) {
        // Validación de null
        if (s == null) {
            return false;
        }

        // Caso base 1: cadena vacía o de un solo carácter
        if (s.length() <= 1) {
            return true;
        }

        // Caso base 2: los extremos no coinciden
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        // Paso recursivo: recortamos el primer y último carácter
        return esPalindromo(s.substring(1, s.length() - 1));
    }

    // Método auxiliar para frases (ignora espacios, puntuación, mayúsculas y acentos)
    public static boolean esPalindromoFrase(String frase) {
        if (frase == null) {
            return false;
        }

        // Quita acentos, deja solo letras y pasa a minúsculas
        String limpia = Normalizer.normalize(frase, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "")
                .replaceAll("[^a-zA-Z]", "")
                .toLowerCase();

        // Si no quedó ninguna letra, no se considera válida
        if (limpia.isEmpty()) {
            return false;
        }

        return esPalindromo(limpia);
    }
}