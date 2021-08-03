package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc13 {

    public static void main(String[] args) {
        /*
        Faça um programa que peça dois números, base e expoente, calcule e 
        mostre o primeiro número elevado ao segundo número. Não utilize a função 
        de potência da linguagem.
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        //Variaveis
        int base, expoente, resultado;
        
        //Entrada
        System.out.println("Entre com o valor da base");
        base = scan.nextInt();
        System.out.println("Entre com o valor do expoente");
        expoente = scan.nextInt();
        
        //Processamento
        resultado=base;
        for(int i=1;i <expoente;i++){
            resultado *= base;
        }
        System.out.println(resultado);
        //Encerramento
        scan.close();
    }
    
}
