package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc04 {

    public static void main(String[] args) {
        /*
        Faça um Programa que verifique se uma letra digitada é vogal ou
        consoante.
        */
        
        //Setup
        Scanner teclado = new Scanner(System.in);
        
        // Variaveis
        String letra;
        
        //Entrada e Procedimento
        System.out.println("Digite uma letra");
        letra = teclado.nextLine();
        
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || 
                letra.equalsIgnoreCase("i")|| letra.equalsIgnoreCase("o") || 
                letra.equalsIgnoreCase("u")){
            System.out.println("Você digitou a VOGAL "+letra.toUpperCase());
        }  else{
            System.out.println("Você digitou a CONSOANTE "+letra.toUpperCase());
        }
        
        //Fechamento
        teclado.close();
    }
    
}
