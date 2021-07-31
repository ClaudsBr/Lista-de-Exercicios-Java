/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios.estruturascondicionais;

import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class Exerc24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Faça  um  Programa  que  leia  2  números  e  em  seguida  pergunte  ao 
        usuário  qual  operação  ele  deseja  realizar.  
        O  resultado  da  operação deve ser acompanhado de uma frase que diga 
        se o número é: 
 
        a. par ou ímpar; 

        b. positivo ou negativo; 

        c. inteiro ou decimal.
        */
        
        //Setup
        Scanner entrada = new Scanner(System.in);
        
        //Variaveis
        double num1, num2, resultado =0;
        String operacao;
        
        //Entrada
        
        System.out.println("Digite o primeiro valor");
        num1 = entrada.nextDouble();
        System.out.println("Digite o segundo valor");
        num2 = entrada.nextDouble();
        System.out.println("Qual operação você deseja realizar?");               
        operacao = entrada.next();
        //Processamento
        if(operacao.equalsIgnoreCase("+")||operacao.equalsIgnoreCase("-")|| 
                operacao.equalsIgnoreCase("/")|| operacao.equalsIgnoreCase("*")){
            switch(operacao){
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "/":
                    resultado = num1 / num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
            }
        }else{
            System.out.println("Operação inválida");
        }
        
        System.out.println("Resultado = "+resultado);
        
        if (resultado%2==0){
            System.out.println("Par");
            if (resultado > 0){
                System.out.println("Positivo");
            }else {
                System.out.println("Negativo");
            }
            if (resultado%(int)resultado==0){
                System.out.println("Inteiro");
            }else{
                System.out.println("Decimal");
            }
            
        }else{
            System.out.println("Ímpar");
            if (resultado > 0){
                System.out.println("Positivo");
            }else {
                System.out.println("Negativo");
            }
            if (resultado%(int)resultado==0){
                System.out.println("Inteiro");
            }else{
                System.out.println("Decimal");
            }
        }
        
        //Encerramento
        entrada.close();
        
        
    }
    
}
