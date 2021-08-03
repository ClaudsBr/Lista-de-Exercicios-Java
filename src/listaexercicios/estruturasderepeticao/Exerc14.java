package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc14 {

    public static void main(String[] args) {
        /*
        Faça um programa que peça 10 números inteiros, calcule e mostre a 
        quantidade de números pares e a quantidade de números impares.
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        //Variaveis
        int vetor[], par, impar;
        
        //Entrada e Processamento
        par = 0;
        impar = 0;
        vetor = new int[10];
        for(int i = 0; i < vetor.length;i++){
            System.out.println("Entre com o "+(i+1)+"º valor");
            vetor[i] = scan.nextInt();
            if (vetor[i]%2 == 0){
                par++;
            }else{
                impar++;
            }
        }
        
        //Saida
        System.out.println("Foram digitados "+par+" valor(es) par(es) e "+
                impar+" valor(es) ímpar(es)");
        
        
        //Encerramento
        scan.close();
    }
    
}
