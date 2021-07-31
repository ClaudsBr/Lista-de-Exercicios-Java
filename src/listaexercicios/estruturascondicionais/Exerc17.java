package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc17 {

    public static void main(String[] args) {
        /*
         Faça um Programa que peça um número correspondente a um determinado 
        e em seguida informe se este ano é ou não bissexto. 
        */
        
        //Setup
        Scanner entrada = new Scanner(System.in);
        
        
        //Variaveis
        int ano;
        
        //Entrada
        System.out.println("Entre com o ano");
        ano = entrada.nextInt();
        
        //Procedimento e Saída
        if(ano%400 ==0 || ano%4 ==0 && ano%100!=0){
            System.out.println("Ano bissexto");
        }else{
            System.out.println("Não é bissexto");
        }
        
        //Fechamento
        entrada.close();
            
    }
    
}
