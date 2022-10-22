package atividade03;

import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int pessoas = 0;
        int pessoas1 =0;

        for(int i =1;i <= 5;i=i+1){
            System.out.print("Digite a idade: ");
            int idade = ler.nextInt();
            
           
            if(idade >= 18){
            pessoas++;

        }else{
            pessoas1++;

        }
        
        }
        System.out.println("Quantidade pessoas com idade maior ou igual a 18 anos são  " + pessoas +" e pessoas menores de 18 anos são: "+pessoas1);

    ler.close();
    }
}


    
