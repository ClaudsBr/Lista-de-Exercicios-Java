package listaexercicios;

import java.util.Scanner;

public class Exerc14 {

    public static void main(String[] args) {
        /*
        Faça um programa que lê as duas notas parciais obtidas por um aluno numa
        disciplina ao longo de um semestre, e calcule a sua média. A atribuição 
        de conceitos obedece à tabela abaixo:
        
        - Média de Aproveitamento Conceito
        - Entre 9.0 e 10.0 A
        - Entre 7.5 e 9.0 B
        - Entre 6.0 e 7.5 C
        - Entre 4.0 e 6.0 D
        - Entre 4.0 e zero E

        O algoritmo deve mostrar na tela as notas, a média, o conceito 
        correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou 
        “REPROVADO” se o conceito for D ou E.
        */
        
        //Setup
        Scanner leitor = new Scanner(System.in);
        
        // Variaveis
        double nota1, nota2,media;
        String conceito, status;
        
        //Entrada
        System.out.println("Entre com a primeira nota");
        nota1 = leitor.nextDouble();
        System.out.println("Entre com a segunda nota");
        nota2 = leitor.nextDouble();
        
        // Procedimento
        media = (nota1+nota2)/2;
        if (media >= 9 && media <= 10){
            conceito = "A";
            status = "APROVADO";
        } else if (media >= 7.5 && media < 9){
            conceito = "B";
            status = "APROVADO";
        } else if(media >= 6 && media < 7.5){
            conceito = "C";
            status = "APROVADO";
        } else if (media >= 4 && media < 6){
            conceito = "D";
            status = "REPROVADO";
        }else{
            conceito = "E";
            status = "REPROVADO";
        }
        
        //Saida
        System.out.printf("1ª nota: %.1f \n",nota1);
        System.out.printf("2ª nota: %.1f \n",nota2);
        System.out.printf("Média: %.1f \n",media);
        System.out.println("Conceito Final: "+conceito);
        System.out.println("Status: "+status);
        
        //Fechamento
        leitor.close();
    }
    
}
