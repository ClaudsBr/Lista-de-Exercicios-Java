package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc16 {

    public static void main(String[] args) {
        /*
        A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... 
        Faça um programa que gere a série até que o valor seja maior que 500.
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        //Variaveis
        int fib, t1, t2, t3;
        
        //Processamento e Saída
        t1 = 1;
        t2 = 1;
        t3 = t1 +t2;
        fib =0;
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        
        while(fib <=500){
            t3 = t1 +t2;
            fib = t2 + t3;
            System.out.println(fib);
            t1 = t2;
            t2 = t3;            
        }
        
        
        //Encerramento
        scan.close();
    }
    
}
