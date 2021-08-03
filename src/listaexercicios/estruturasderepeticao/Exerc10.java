package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc10 {

    public static void main(String[] args) {
        /*
        Faça um programa que receba dois números inteiros e gere os números 
        inteiros que estão no intervalo compreendido por eles.
        */
        
        //Setup
        Scanner entrada = new Scanner(System.in);
        
        //Variaveis
        int inicio, fim;
        
        //Entrada
        System.out.println("Entre com o valor do inicio do intervalo");
        inicio = entrada.nextInt();
        System.out.println("Entre com o valor do final do intervalo");
        fim = entrada.nextInt();
        
        //Processamento e Saída
        if (inicio <= fim){
            System.out.println("Contagem Progressiva de "+inicio+" a "+fim);
            for(int i = inicio; i <= fim; i++){
                System.out.println(i);
            }
        }else{
            System.out.println("Contagem Regressiva de "+inicio+" a "+fim);
            for(int i = inicio; i >=fim;i--){
                System.out.println(i);
            }
        }
        
        //Encerramento
        entrada.close();
    }
    
}
