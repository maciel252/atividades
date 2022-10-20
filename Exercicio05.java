package atividades;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;
        System.out.println(" Digite a idade ");
        idade = scan.nextInt();

        Scanner ler = new Scanner(System.in);
        int num ;
        System.out.println("Digite sua idade");
        num = ler.nextInt();

        if ((num == 16) || (num <= 17)) {
            System.out.println("Pode votar, mas não pode dirigir ");            
        } else if (num >= 18){
            System.out.println("Pode votar e pode dirigir ");
         }else {
            System.out.println("Não pode nem votar e nem dirigir ");
         }
    }
}
