package listaexercicios;

import java.util.Scanner;

public class Exerc09 {

    public static void main(String[] args) {
        /*
        Faça um Programa que leia três números e mostre-os em ordem decrescente.
        */
        
        //Setup
        Scanner teclado = new Scanner(System.in);
        
        //Variaveis
        int primeiro, segundo, terceiro;
        int menor, meio, maior;
        
        //Entrada
        System.out.println("Digite o 1º valor");
        primeiro = teclado.nextInt();
        System.out.println("Digite o 2º valor");
        segundo = teclado.nextInt();
        System.out.println("Digite o 3º valor");
        terceiro = teclado.nextInt();
        
        //Procedimento
        if(primeiro >= segundo && primeiro >= terceiro){
            maior = primeiro;
            if(segundo >= terceiro){
                meio = segundo;
                menor = terceiro;
            } else{
                meio = terceiro;
                menor = segundo;
            }
        } else if(segundo >= primeiro && segundo >= terceiro){
            maior = segundo;
            if (primeiro >= terceiro){
                meio = primeiro;
                menor = terceiro;
            }else{
                meio = terceiro;
                menor = primeiro;
            }
        } else{
            maior = terceiro;
            if(primeiro >= segundo){
                meio = primeiro;
                menor = segundo;
            }else {
                meio = segundo;
                menor = primeiro;
            }
        }
        
        //Saída
        System.out.println("Numeros digitados em ordem decrescente: ");
        System.out.println(maior);
        System.out.println(meio);
        System.out.println(menor);
        
        //Fechamento
        teclado.close();
    }
    
}
