package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc02 {

    public static void main(String[] args) {
        /* 
        Faça um Programa que peça um valor e mostre na tela se o valor é
        positivo ou negativo 
        */
        
        //Setup
        Scanner teclado = new Scanner(System.in);
        //Variaveis
        int numero = teclado.nextInt();
        
        //Procedimento e Saída
        if (numero > 0){
            System.out.println("Positivo");
        } else if(numero < 0){
            System.out.println("Negativo");
        }
        
        //Fechamento
        teclado.close();
    }
    
}
