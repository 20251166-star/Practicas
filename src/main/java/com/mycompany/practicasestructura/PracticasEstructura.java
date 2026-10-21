/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicasestructura;
import static com.mycompany.practicasestructura.Burbujas.mostrarArreglo;
import static com.mycompany.practicasestructura.Burbujas.ordenamientoBurbuja;
import static com.mycompany.practicasestructura.Burbujas.ordenamientoBurbujaMejorado;
import java.util.Scanner;
import static com.mycompany.practicasestructura.RecursividadPalindromo.esPalindromoFrase;

/**
 *
 * @author tavo123
 */
public class PracticasEstructura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ORDENAMIENTO BURBUJA ===");
        System.out.print("¿Cuántos números deseas ingresar? ");

        int cantidad = scanner.nextInt();

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            scanner.close();
            return;
        }

        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nArreglo original:");
        mostrarArreglo(numeros);

        System.out.println("\nSelecciona el método:");
        System.out.println("1. Burbuja tradicional");
        System.out.println("2. Burbuja mejorado");
        System.out.print("Opción: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                ordenamientoBurbuja(numeros);
                System.out.println("\nMétodo tradicional:");
                mostrarArreglo(numeros);
                break;

            case 2:
                ordenamientoBurbujaMejorado(numeros);
                System.out.println("\nMétodo mejorado:");
                mostrarArreglo(numeros);
                break;

            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
    /*
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
    */
       
}