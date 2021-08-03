package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc15 {

    public static void main(String[] args) {
        /*
        A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... 
        Faça um programa capaz de gerar a série até o n−ésimo termo.
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        //Variaveis
        int n1, n2, n, fib[];
        
        //Entrada
        System.out.println("Entre com o n-ésimo termo da sequencia de Fibonacci");
        n = scan.nextInt();
        
        // Processamento
        fib = new int[n];
        fib[0]=1;
        
        if(n > 1){
            fib[1]= 1;
            for(int i=2;i< fib.length;i++){
                fib[i]=fib[i-1]+fib[i-2];
            }
        }
        
        //Saída
        System.out.println("Sequencia de Fibonacci até o "+n+"º termo:");
        for(int termo: fib){
            System.out.print(termo+", ");
        }
        
        //Encerramento
        scan.close();
    }
    
}
