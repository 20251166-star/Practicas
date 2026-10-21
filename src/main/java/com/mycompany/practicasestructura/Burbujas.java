/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicasestructura;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author tavo123
 */
public class Burbujas {
    // 1. Método de burbuja tradicional
    public static void ordenamientoBurbuja(int[] arreglo) {

        int n = arreglo.length;

        // Recorre el arreglo en cada pasada
        for (int i = 0; i < n - 1; i++) {

            // Compara los elementos consecutivos
            for (int j = 0; j < n - 1; j++) {

                // Si están en orden incorrecto, los intercambia
                if (arreglo[j] > arreglo[j + 1]) {

                    int auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }
        }
    }

    // 2. Método de burbuja mejorado
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {

        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {

            boolean intercambio = false;

            for (int j = 0; j < n - 1 - i; j++) {

                if (arreglo[j] > arreglo[j + 1]) {

                    int auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;

                    intercambio = true;
                }
            }

            // Si no hubo intercambios, ya está ordenado
            if (!intercambio) {
                break;
            }
        }
    }

    // Método para mostrar el arreglo
    public static void mostrarArreglo(int[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }
        
}
