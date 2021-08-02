package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {
        /*
        Faça um programa que peça uma nota, entre zero e dez. Mostre uma 
        mensagem caso o valor seja inválido e continue pedindo até que o usuário
        informe um valor válido.
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        //Variavies
        float nota;
        
        //Entrada, Processamento e Saida
        do{
            System.out.println("Entre com a sua nota");
            nota = scan.nextInt();
            if(nota < 0 || nota > 10){
                System.out.println("Nota inválida");
            }
            
        }while(nota < 0 || nota >10);
        
        // Encerramento
        scan.close();
    }
    
}
