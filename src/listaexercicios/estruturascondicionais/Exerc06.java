package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc06 {

    public static void main(String[] args) {
        // Faça um Programa que leia três números e mostre o maior deles.
        
        // Setup
        Scanner teclado = new Scanner(System.in);
        
        //Variaveis
        int primeiro;
        int segundo;
        int terceiro;
        int maior;
        
        // Entrada 
        System.out.println("Entre o 1º numero");
        primeiro = teclado.nextInt();
        System.out.println("Entre com o 2º numero");
        segundo = teclado.nextInt();
        System.out.println("Entre com o 3º numero");
        terceiro = teclado.nextInt();
        
        // Procedimento
        if (primeiro >= segundo && primeiro >= terceiro){
            maior = primeiro;
        } else if( segundo > primeiro && segundo > terceiro){
            maior = segundo;
        } else {
            maior = terceiro;
        }
        
        //Saida
        System.out.println("Maior valor digitado: "+maior);
        
        //Fechamento
        teclado.close();
    }
    
}
