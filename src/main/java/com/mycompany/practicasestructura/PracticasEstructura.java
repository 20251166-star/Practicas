/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicasestructura;
import java.util.Scanner;
import static com.mycompany.practicasestructura.RecursividadPalindromo.esPalindromoFrase;

/**
 *
 * @author tavo123
 */
public class PracticasEstructura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pruebas con valores fijos
        String palabra = "reconocer";
        String frase = "Anita lava la tina";

        System.out.println("¿Es '" + palabra + "' palíndromo? "
                + RecursividadPalindromo.esPalindromoFrase(palabra));
        System.out.println("¿Es '" + frase + "' palíndromo? "
                + RecursividadPalindromo.esPalindromoFrase(frase));

        // Prueba con texto escrito por el usuario
        System.out.print("\nEscribe una palabra o frase: ");
        String texto = scanner.nextLine();
        System.out.println("¿Es '" + texto + "' palíndromo? "
                + RecursividadPalindromo.esPalindromoFrase(texto));

        scanner.close();
    }
}