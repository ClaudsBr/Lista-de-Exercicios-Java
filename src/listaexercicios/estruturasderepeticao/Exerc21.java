package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc21 {

    public static void main(String[] args) {
        /*
        Faça um programa que peça um número inteiro e determine se ele é ou não 
        um número primo. Um número primo é aquele que é divisível somente por 
        ele mesmo e por 1.
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        //Variaveis
        int numero, contador;
        
        //Entrada
        System.out.println("Digite um valor inteiro");
        numero = scan.nextInt();
        
        //Procedimento
        contador = 0;
        for(int i=numero;i >= 1;i-- ){
            
            if(numero%i==0){
                contador++;
            }
        }
        
        //Saída
        if(contador <= 2){
            System.out.printf("O valor %d é primo\n",numero);
        }else{
            System.out.printf("O valor %d NÃO é primo\n",numero);
        }
        
        // Encerramento
        scan.close();
    }
    
}
