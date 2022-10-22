package atividade03;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = 1;
        String mensagem;
        System.out.println("Digite uma mensagem");
        mensagem = ler.next();
        System.out.println("Digite quantas vezes ira repetir");
        numero = ler.nextInt();  
        
        int repeticao = numero;
        
        for (numero = 0; numero <= repeticao; numero = numero + 1){
            System.out.println(mensagem);

        }
    }    
}    



