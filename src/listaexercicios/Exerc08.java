package listaexercicios;

import java.util.Scanner;

public class Exerc08 {

    public static void main(String[] args) {
        /*
        Faça um programa que pergunte o preço de três produtos e informe qual 
        produto você deve comprar, sabendo que a decisão é sempre pelo mais 
        barato.
        */
        
        // Setup
        Scanner teclado = new Scanner (System.in);
        
        // Variaveis
        float preco1,preco2,preco3;
        float maisBarato;
        
        // Entrada
        System.out.println("Digite o preço do 1º produto");
        preco1 = teclado.nextFloat();
        System.out.println("Digite o preço do 2º produto");
        preco2 = teclado.nextFloat();
        System.out.println("Digite o preço do 3º produto");
        preco3 = teclado.nextFloat();
        
        // Procedimento e Saida
        if(preco1 <= preco2 && preco1 <= preco3 ){
            maisBarato = preco1;
            System.out.printf("Você deve comprar o 1º produto que custa %.2f "
            ,maisBarato);
        }else if(preco2 <= preco1 && preco2 <= preco3){
            maisBarato = preco2;
            System.out.printf("Você deve comprar o 2º produto que custa %.2f "
                    ,maisBarato);
        }else{
            maisBarato = preco3;
            System.out.printf("Você deve comprar o 3º produto que custa %.2f "
            , maisBarato);
        }
        
        //Fechamento
        teclado.close();
        
    }
    
}
