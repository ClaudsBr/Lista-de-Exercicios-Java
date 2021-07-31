package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc23 {

    public static void main(String[] args) {
        /*
        Faça  um  Programa  que  peça  um  número  e  informe  se  o  número  é 
        inteiro ou decimal. Dica: utilize uma função de arredondamento.
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        //Variaveis
        double numero;
        
        //Entrada
        System.out.println("Digite um numero");
        numero = scan.nextDouble();
        
        //Processamento e Saída
        if(numero%(int)numero ==0){
            System.out.println("Inteiro");
        }else{
            System.out.println("Decimal");
        }
        
        //Fechamento
        scan.close();
        
    }
    
}
