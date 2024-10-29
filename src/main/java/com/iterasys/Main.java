// 1 - Bibliotecas

// 1.5 Pacotes
package com.iterasys;

// 2 - Classe
public class Main {
    // 2.1 Atributos

    // 2.2 Métodos e Funções
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // float resultado = somar(5,7);
        // System.out.println("A soma de 5 + 7 = " + resultado);
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

    public static float dividirIF(float num1, float num2) {

        if (num2 != 0) {
            return num1 / num2;
        } 
        else {
            System.out.println("Não é possível dividir por zero");
            return 0;
        }
    }

    public static String dividirTry(float num1, float num2){
        try {
            return String.valueOf(num1 / num2);
        } catch (Exception e) {
            return "Não é possível dividir por zero";
        }
    }
}