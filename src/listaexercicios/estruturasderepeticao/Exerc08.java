package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc08 {

    public static void main(String[] args) {
        /*
        Faça um programa que leia 5 números e informe a soma e a média dos 
        números.
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        //Variaveis
        float vetor[];
        float media;
        float soma;
        
        vetor = new float[5];
        soma =0;
        for (int i=0; i < vetor.length;i++){
            System.out.println("Digite o "+(1+i)+"º valor");
            vetor[i] = scan.nextFloat();
            soma += vetor[i];
        }
        System.out.println("Soma = "+soma);
        media = soma / vetor.length;
        System.out.println("Média = "+media);
        
        
        //Encerramento
        scan.close();
    }
    
}
