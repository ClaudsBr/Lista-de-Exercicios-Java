package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc20 {

    public static void main(String[] args) {
        /*
         Faça um Programa para leitura de três notas parciais de um aluno. 
        O programa deve calcular a média alcançada por aluno e apresentar: 
        . A  mensagem  "Aprovado",  se  a  média  for  maior  ou  igual  a  7, 
        com a respectiva média alcançada; 
        a. A mensagem "Reprovado", se a média for menor do que 7, com a 
        respectiva média alcançada; 
        b. A mensagem "Aprovado com Distinção", se a média for igual a 10.
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        //Variaveis
        double nota1, nota2, nota3, media;
        
        //Entrada
        System.out.println("Entre com a primeira nota:");
        nota1 = scan.nextDouble();
        
        //Procedimento e Saida
        if (nota1 > 10 || nota1 <0){
            System.out.println("Nota Inválida");
        } else{
            System.out.println("Entre com a segunda nota:");
            nota2 = scan.nextDouble();
            if (nota2 > 10 || nota2 <0){
                System.out.println("Nota Inválida");
            } else {
                System.out.println("Entre com a terceira nota:");
                nota3 = scan.nextDouble();
                if (nota3 > 10 || nota3 <0){
                    System.out.println("Nota Inválida");
                } else {
                    media = (nota1+nota2+nota3)/3;
        
                    if(media == 10 ){
                        System.out.println("Média = 10 \nAprovado com Distinção");
                    } else if (media <10 && media >= 7){
                        System.out.println("Média = "+media);
                        System.out.println("Aprovado");
                    }else {
                        System.out.println("Média = "+media);
                        System.out.println("Reprovado");
                    }
                }
            }
        }
        
        //Fechamento
        scan.close();
    }
    
}
