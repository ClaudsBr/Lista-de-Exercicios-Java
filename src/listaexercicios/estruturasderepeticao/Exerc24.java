package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc24 {

    public static void main(String[] args) {
        /*
        Faça um programa que calcule o mostre a média aritmética de N notas.
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        //Variaveis
        int qtdDeNotas;
        float nota, somador;
        
        //Entrada
        System.out.println("Digite a quantidade de provas realizadas");
        qtdDeNotas = scan.nextInt();
        
        //Processamento
        somador=0;
        for(int i=1; i <= qtdDeNotas;i++){
            System.out.println("Digite a "+i+"ª nota");
            nota = scan.nextFloat();
            somador+= nota;
        }
        
        //Saida
        System.out.println("Média: "+somador/qtdDeNotas);
        
        //Encerramento
        scan.close();
    }
    
}
