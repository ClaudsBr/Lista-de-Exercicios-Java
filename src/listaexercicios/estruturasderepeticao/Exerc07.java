package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc07 {

    public static void main(String[] args) {
        /*
        Faça um programa que leia 5 números e informe o maior número.
        
        */
        
        //Setup
        Scanner teclado = new Scanner(System.in);
        
        //Variaveis
        float vetor[], maior;
        
        //Entrada e Processamento
        vetor = new float[5];
        maior =  Float.NEGATIVE_INFINITY;
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Entre com o "+(i+1)+"º valor:");
            vetor[i] = teclado.nextFloat();
            if(i == 0){
                maior = vetor[i];
            }else{
                if (vetor[i] > maior){
                    maior = vetor[i];
                }
            }
        }
        
        //Saida
        System.out.println("O maior valor é "+maior);
        
        //Encerramento
        teclado.close();
    }
    
}
