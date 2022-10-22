package atividade03;

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Você tem 5 tentativas");

        int contador = 5;

        do {

            System.out.println("Digite a palavra secreta!");
            String Palavra = ler.nextLine();

            contador = contador - 1;
            if (Palavra.contentEquals("Java-2022")) {
                System.out.println("Parabéns , você acertou a palavra");
            } else {
                System.out.println("Está não e a palavra , tente novamente !");

            }

        } while(contador>0);
    }
}
