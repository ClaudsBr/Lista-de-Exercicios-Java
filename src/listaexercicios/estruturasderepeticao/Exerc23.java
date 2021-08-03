package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc23 {

    public static void main(String[] args) {
        /*
        Faça um programa que mostre todos os primos entre 1 e N sendo N um 
        número inteiro fornecido pelo usuário. O programa deverá mostrar também 
        o número de divisões que ele executou para encontrar os números primos. 
        Serão avaliados o funcionamento, o estilo e o número de testes 
        (divisões) executados.
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        //Variaveis
        int n, numeroDeDivisoes, contador, primos[];
        
        //Entrada
        System.out.println("Digite um valor");
        n = scan.nextInt();
        
        //Processamento
        numeroDeDivisoes = 0;
        contador =0;
        
        System.out.println("Os numeros primos entre 1 e "+n+" são:");
        do{
            for(int i = 1; i <= n;i++){
                if(n%i == 0){
                    contador++;
                }
                numeroDeDivisoes++;
            }
            
            if(contador <= 2){
                System.out.println(n);
            }
            
            n--;
            contador = 0;
                   
             
        }while(n >=1);
        
        
        System.out.println("O numero de divisão desse intervalo é: "+numeroDeDivisoes);  
        
        //Encerramento
        scan.close();
    }
    
}
