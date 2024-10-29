// 1 - Bibliotecas

// 1.5 Pacotes
package com.iterasys;

// 2 - Classe
public class Main {
    // 2.1 Atributos

    // 2.2 Métodos e Funções
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static float somar(float num1, float num2) {
        float resultado = num1 + num2;
        System.out.println("Soma de " + num1 + " + " + num2 + " = " + resultado);  
        return resultado;
    }

    public static float subtrair(float num1, float num2) {
        float resultado = num1 + num2;
        System.out.println("Subtracao de " + num1 + " - " + num2 + " = " + resultado);  
        return resultado;
    }

    public static float multiplicar(float num1, float num2) {
        return num1 * num2;
    }

    public static float dividir(float num1, float num2) {
        return num1 / num2;
    }
}