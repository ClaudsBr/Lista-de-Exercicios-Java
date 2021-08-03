package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc18 {

    public static void main(String[] args) {
        /*
        Faça um programa que, dado um conjunto de N números, determine o menor 
        valor, o maior valor e a soma dos valores.
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        //Variaveis
        int n;
        float conjunto[], menor, maior, soma;
        
        //Entrada
        System.out.println("Digite a quantidade de elementos do conjunto");
        n = scan.nextInt();
        
        //Processamento
        conjunto = new float[n];
        maior = Float.POSITIVE_INFINITY;
        menor = Float.NEGATIVE_INFINITY;
        soma =0;
        for(int i =0; i < conjunto.length;i++){
            System.out.println("Entre com o "+(i+1)+"º numero do conjunto");
            conjunto[i] = scan.nextFloat();
            soma +=conjunto[i];
            if(i == 0){
                maior = conjunto[i];
                menor = conjunto[i];
            } else if(conjunto[i] > maior ){
                maior = conjunto[i];
            } else if (conjunto[i]< menor){
                menor = conjunto[i];
            }
        }
        
        //Saída
        System.out.println("Menor valor: "+menor);
        System.out.println("Maior valor: "+maior);
        System.out.println("Soma dos valores: "+soma);
        
        //Encerramento
        scan.close();
    }
    
}
