package listaexercicios;

import java.util.Scanner;

public class Exerc03 {

    public static void main(String[] args) {
        /*
        Faça um Programa que verifique se uma letra digitada é "F" ou "M".
        Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
        */ 
        
        //Setup
        Scanner teclado = new Scanner(System.in);
        
        // Variaveis
        String letra;
        
        // Entrada
        System.out.println("Digite o seu sexo:");
        letra = teclado.nextLine();
        
        // Procedimento e Saída
        if (letra.equalsIgnoreCase("f")){
            System.out.println("F - Feminino");
        } else if (letra.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
        }else{
            System.out.println("Sexo Inválido");
        }
        
        // Fechamento
        teclado.close();
    }
    
}
