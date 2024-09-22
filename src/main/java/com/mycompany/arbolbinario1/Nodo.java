/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolbinario1;

/**
 *
 * @author julia
 */
public class Nodo<T extends Comparable<T>> {
    T valor;
    Nodo<T> izquierda, derecha;

    public Nodo(T valor) {
        this.valor = valor;
        this.izquierda = null;
        this.derecha = null;
    }
}