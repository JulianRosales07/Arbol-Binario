/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arbolbinario1;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class ArbolBinario1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArbolBinario<String> arbolPalabras = new ArbolBinario<>();
        ArbolBinario<Integer> arbolNumeros = new ArbolBinario<>();

        System.out.println("¿Desea insertar números o palabras? (n/p): ");
        String opcion = scanner.nextLine();

        if (opcion.equalsIgnoreCase("n")) {
            // Inserción de números
            System.out.println("Insertando números en el árbol...");
            arbolNumeros.insertar(5);
            arbolNumeros.insertar(3);
            arbolNumeros.insertar(8);
            arbolNumeros.insertar(1);
            arbolNumeros.insertar(4);
            arbolNumeros.insertar(7);

            System.out.println("\nÁrbol binario (números):");
            arbolNumeros.imprimirArbolVertical();
        } else if (opcion.equalsIgnoreCase("p")) {
            // Inserción de palabras
            System.out.println("Insertando palabras en el árbol...");
            arbolPalabras.insertar("manzana");
            arbolPalabras.insertar("banana");
            arbolPalabras.insertar("kiwi");
            arbolPalabras.insertar("cereza");
            arbolPalabras.insertar("durazno");

            System.out.println("\nÁrbol binario (palabras):");
            arbolPalabras.imprimirArbolVertical();
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}