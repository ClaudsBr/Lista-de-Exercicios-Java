/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class Exerc22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Faça um programa que peça um número inteiro e determine se ele é ou não 
        um número primo, informando, caso o número não seja primo, por quais 
        número ele é divisível.
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
        if(contador == 2){
            System.out.printf("O valor %d é primo\n",numero);
        }else{
            System.out.printf("O valor %d NÃO é primo\n",numero);
            System.out.printf("Divisores de %d: \n",numero);
            for(int i = 1;i <=numero;i++){
                if(numero%i==0){
                    System.out.println(i);
                }
            }
        }
        
        // Encerramento
        scan.close();
    }
    
}
