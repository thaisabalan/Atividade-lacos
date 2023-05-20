package com.mycompany.atividade1;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner teclado = new Scanner(System.in);   
       
        int i, pergunta;
        int maior = 0;
        
        for(i = 0; i <= 10; i++){
            System.out.printf("Insira o %d valor:\n", i + 1);
            pergunta = teclado.nextInt();
            
            if(pergunta > maior){
                maior = pergunta;
            }
        }
        System.out.printf("O maior numero e: %d \n", maior); 
    }
}
