package listaexercicios.estruturascondicionais;

import java.util.Scanner;


public class Exerc22 {

    
    public static void main(String[] args) {
        /*
        Faça  um  Programa  que  peça  um  número  inteiro  e  determine  se  
        ele  é par ou impar.
        */
        
        //Setup
        Scanner leitor = new Scanner(System.in);
        
        //Variaveis
        int numero;
        
        // Entrada
        numero = leitor.nextInt();
        
        //Processamento e Saída
        if(numero%2 == 0 ){
            System.out.println("Par");
        }else{
            System.out.println("Ímpar");
        }
        
        //Fechamento
        leitor.close();
    }
    
}
