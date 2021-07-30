package listaexercicios;

import java.util.Scanner;

public class Exerc07 {

    public static void main(String[] args) {
        /*
        Faça um Programa que leia três números e mostre o maior e o menor deles.
        */
        
        //Setup
        Scanner teclado = new Scanner(System.in);
        
        // Variaveis
        int primeiro, segundo, terceiro;
        int maior, menor;
        
        // Entrada
        System.out.println("Entre com o primeiro valor");
        primeiro = teclado.nextInt();
        System.out.println("Entre com o segundo valor");
        segundo = teclado.nextInt();
        System.out.println("Entre com o terceiro valor");
        terceiro = teclado.nextInt();
        
        //Procedimento
        if (primeiro >= segundo && primeiro >= terceiro){
            maior = primeiro;
            if(segundo >= terceiro){
                menor = terceiro;
            }else{
                menor = segundo;
            }
        } else if(segundo >= primeiro && segundo >= terceiro){
            maior = segundo;
            if (primeiro >= terceiro){
                menor = terceiro;
            } else {
                menor = primeiro;
            }
        } else{
            maior = terceiro;
            if (primeiro >= segundo){
                menor = segundo;
            }else{
                menor = primeiro;
            }
        }
        
        //Saida
        System.out.println("O maior valor digitado foi "+maior);
        System.out.println("O menor valor digitado foi "+menor);
        
        // Fechamento
        teclado.close();
    }
    
}
