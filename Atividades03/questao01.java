package atividade03;

import java.util.Scanner;

//1. Escreva um programa que vai ler um número, o sistema vai escrever na tela a tabuada de 1 até 10 
//do número digitado.

public class questao01 {
    public static void main(String[] args) {
        int contador = 1;
        int numeroDigitado;

        Scanner input = new Scanner(System.in);
        System.out.println("digite o valor da tabuada:");
        numeroDigitado = input.nextInt();
        while (contador <= 10) {
            System.out.println(numeroDigitado + " X " + contador + " = " + contador * numeroDigitado);
            contador++;
        }
    }

}
