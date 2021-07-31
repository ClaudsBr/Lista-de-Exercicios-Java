package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc05 {

    public static void main(String[] args) {
        /*
        Faça um programa para a leitura de duas notas parciais de um aluno.

        - programa deve calcular a média alcançada por aluno e apresentar:
        - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        - A mensagem "Reprovado", se a média for menor do que sete;
        - A mensagem "Aprovado com Distinção", se a média for igual a dez.
        
        */
        
        //Setup
        Scanner teclado = new Scanner(System.in);
        
        // Variaveis
        float nota1;
        float nota2;
        float media;
        
        //Entrada
        System.out.println("Digite o valor da primeira nota");
        nota1 = teclado.nextFloat();
        System.out.println("Digite o valor da segunda nota");
        nota2 = teclado.nextFloat();
        
        //Procedimento e Saida
        media = (nota1 + nota2)/2;
        if(media == 10){
            System.out.println("Aprovado com distinção");
            System.out.printf("Média = %.2f \n", media);
        } else if(media <10 && media >= 7){
            System.out.println("Aprovado");
            System.out.printf("Média = %.2f \n", media);
        }else{
            System.out.println("Reprovado");
            System.out.printf("Média = %.2f \n", media);
        }
        
        //Fechamento
        teclado.close();
    }
    
}
