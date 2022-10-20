package atividades;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;
        System.out.println(" Digite a idade ");
        idade = scan.nextInt();

        if(idade >= 18){
            System.out.println("Pode dirigir ");
        }else{
            System.out.println("Não pode dirigir");
        }
    }
}
