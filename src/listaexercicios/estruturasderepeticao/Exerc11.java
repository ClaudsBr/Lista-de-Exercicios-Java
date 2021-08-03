package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc11 {

    public static void main(String[] args) {
        /*
        Faça um programa que receba dois números inteiros e gere os números 
        inteiros que estão no intervalo compreendido por eles.Mostre no final 
        a soma dos numeros
        */
        
        //Setup
        Scanner entrada = new Scanner(System.in);
        
        //Variaveis
        int inicio, fim, soma;
        
        //Entrada
        System.out.println("Entre com o valor do inicio do intervalo");
        inicio = entrada.nextInt();
        System.out.println("Entre com o valor do final do intervalo");
        fim = entrada.nextInt();
        
        //Processamento 
        soma = 0;
        if (inicio <= fim){
            System.out.println("Contagem Progressiva de "+inicio+" a "+fim);
            for(int i = inicio; i <= fim; i++){
                System.out.println(i);
                soma +=i;
            }
        }else{
            System.out.println("Contagem Regressiva de "+inicio+" a "+fim);
            for(int i = inicio; i >=fim;i--){
                System.out.println(i);
                soma +=i;
            }
        }
        
        //Saída
        System.out.println("Soma dos valores do intervalo = "+soma);
        
        //Encerramento
        entrada.close();
    }
    
}
