/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolbinario1;

/**
 *
 * @author julia
 */
public class ArbolBinario<T extends Comparable<T>> {
    Nodo<T> raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(T valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo<T> insertarRecursivo(Nodo<T> nodo, T valor) {
        if (nodo == null) {
            return new Nodo<>(valor);
        }
        if (valor.compareTo(nodo.valor) < 0) {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, valor);
        } else if (valor.compareTo(nodo.valor) > 0) {
            nodo.derecha = insertarRecursivo(nodo.derecha, valor);
        } else {
            System.out.println("El valor " + valor + " ya está presente en el árbol y no se insertará.");
        }
        return nodo;
    }

    // Método para imprimir el árbol de forma vertical con líneas de conexión
    public void imprimirArbolVertical() {
        imprimirNodoVertical(raiz, 0, "Raíz", "");
    }

    private void imprimirNodoVertical(Nodo<T> nodo, int nivel, String posicion, String prefijo) {
        if (nodo != null) {
            // Primero imprimimos el lado derecho (subárbol derecho)
            imprimirNodoVertical(nodo.derecha, nivel + 1, "Derecha", prefijo + "    ");

            // Imprimir el valor del nodo con el prefijo adecuado
            System.out.println(prefijo + (posicion.equals("Raíz") ? "" : "|-- ") + nodo.valor);

            // Luego imprimimos el lado izquierdo (subárbol izquierdo)
            imprimirNodoVertical(nodo.izquierda, nivel + 1, "Izquierda", prefijo + "    ");
        }
    }
}