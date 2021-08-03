package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc17 {

    public static void main(String[] args) {
        /*
        Faça um programa que calcule o fatorial de um número inteiro 
        fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        //Variaveis
        int numero, fatorial;
        
        //Entrada
        System.out.println("Digite um inteiro para calcular seu respectivo fatorial");
        numero = scan.nextInt();
        
        //Processamento
        fatorial =1;
        for(int i = numero; i >=1;i--){
            fatorial *= i;
        }
        
        //Saida
        System.out.println(numero+"! = "+fatorial);
        //Encerramento
        scan.close();
    }
    
}
