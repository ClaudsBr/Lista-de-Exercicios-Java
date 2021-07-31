package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc13 {

    public static void main(String[] args) {
        /*
        Faça um Programa que leia um número e exiba o dia correspondente da 
        semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve 
        aparecer valor inválido.
        */
        
        //Setup
        Scanner leitor = new Scanner(System.in);
        
        //Variaveis
        int diaSemana;
        
        //Entrada
        diaSemana = leitor.nextInt();
        
        //Procedimento e Saída
        switch(diaSemana){
            case 1:
                System.out.println("1 - Domingo");
                break;
            case 2:
                System.out.println("2 - Segunda-Feira");
                break;
            case 3:
                System.out.println("3 - Terça-Feira");
                break;
            case 4:
                System.out.println("4 - Quarta-Feira");
                break;
            case 5:
                System.out.println("5 - Quinta-Feira");
                break;
            case 6:
                System.out.println("6 - Sexta-Feira");
                break;
            case 7:
                System.out.println("7 - Sábado");
                break;
            default:
                System.out.println("Valor Inválido");
        }
        
        //Fechamento
        leitor.close();
    }
    
}
