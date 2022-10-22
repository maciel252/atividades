package atividades;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double peso;
        System.out.println("Digite seu peso!");
        peso = ler.nextDouble();
        double altura;
        System.out.println("Digite sua altura!");
        altura = ler.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println(imc);

        if (imc < 20) {
            System.out.println("Abaixo do normal");
        } else if (imc > 20 && imc <= 25){
            System.out.println("Sua Classificação Está Dentro do Normal");
        }
        if (imc > 25 && imc <= 30) {
            System.out.println("Sua Classificação é de Sobrepeso");
        } else if (imc > 30 && imc <= 35) {
            System.out.println("Sua Classificação é Obesidade leve");
        } else if (imc > 35 && imc <= 40) {
            System.out.println("Sua Classificação é Obesidade moderada ");
        } else if (imc > 40) {
            System.out.println("Sua Classificação é Obesidade Morbida");
        }
    }   
}
