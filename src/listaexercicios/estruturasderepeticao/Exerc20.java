package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc20 {

    public static void main(String[] args) {
        /*
        Altere o programa de cálculo do fatorial, permitindo ao usuário calcular
        o fatorial várias vezes e limitando o fatorial a números inteiros 
        positivos e menores que 16.
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        
        //Variaveis
        int numero;
        int fatorial;
        String resposta;
        
        //Entrada
        resposta= "s";
        do{
            System.out.println("Entre com um valor entre 1 e 16");
            numero = scan.nextInt();
            fatorial = 1;
            while(numero < 1 || numero > 16){
                System.out.println("Valor invalido");
                System.out.println("Digite novamente");
                numero = scan.nextInt();                
            }
            for(int i = numero; i >=1;i--){
                fatorial *=i;
            }
            System.out.println(numero+"! = "+fatorial);
            System.out.println("Deseja calcular novamente? [S/N]");
            resposta = scan.next();
        }while (!resposta.equalsIgnoreCase("n"));
        
        //Encerramento
        scan.close();
        
    }
    
}
