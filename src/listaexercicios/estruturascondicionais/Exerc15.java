package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc15 {

    public static void main(String[] args) {
        /*
        Faça um Programa que peça os 3 lados de um triângulo. O programa deverá 
        informar se os valores podem ser um triângulo. Indique, caso os lados 
        formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.

        - Dicas:

        - Três lados formam um triângulo quando a soma de quaisquer dois lados 
        for maior que o terceiro;
        - Triângulo Equilátero: três lados iguais;
        - Triângulo Isósceles: quaisquer dois lados iguais;
        - Triângulo Escaleno: três lados diferentes;
        */
        
        //Setup
        Scanner entrada = new Scanner(System.in);
        
        //Variaveis
        int ladoA, ladoB,ladoC;
        
        //Entrada
        System.out.println("Digite a medida de um lado");
        ladoA = entrada.nextInt();
        System.out.println("Digite a medida de outro lado");
        ladoB = entrada.nextInt();
        System.out.println("Digite a medida do ultimo lado");
        ladoC = entrada.nextInt();
        
        //Procedimento e Saída
        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA){
            if (ladoA == ladoB && ladoA == ladoC){
                System.out.println("Triangulo Equilátero");
            } else if(ladoA != ladoB && ladoA != ladoC){
                System.out.println("Triangulo Escaleno");
            }else{
                System.out.println("Triangulo Isoceles");
            }
        }else {
            System.out.println("Esses 3 lados não formam um triangulo");
        }
        
        //Fechamento
        entrada.close();
    }
    
}
