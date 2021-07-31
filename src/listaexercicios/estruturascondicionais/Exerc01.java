package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {
        //Faça um Programa que peça dois números e imprima o maior deles. 
        
        
        //Setup
        Scanner teclado = new Scanner(System.in);
        
        // Variaveis
        int primeiro, segundo;
        
        // Entrada
        System.out.println("Entre com o 1º valor:");
        primeiro = teclado.nextInt();
        System.out.println("Entre com o 2º valor");
        segundo = teclado.nextInt();
        
        //Procedimento e Saida
        if (primeiro > segundo){
            System.out.println("O maior valor é "+primeiro);
        } else {
            System.out.println("O maior valor é "+ segundo);
        }
        // fechamento
        teclado.close();
    }
    
}
