package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc10 {

    public static void main(String[] args) {
        /*
        Faça um Programa que pergunte em que turno você estuda. Peça para 
        digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem 
        "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme 
        o caso.
        */
        
        //Setup
        Scanner teclado = new Scanner(System.in);
        
        //Variaveis
        String turno;
        
        // Entrada
        System.out.println("Digite seu turno:"
                + "\nM - Matutino \nV-Vespertino \nN - Noturno ");
        turno=teclado.nextLine();
        
        if (turno.equalsIgnoreCase("m")){
            System.out.println("Bom Dia!");
        } else if (turno.equalsIgnoreCase("v")){
        System.out.println("Boa Tarde!");
        } else if (turno.equalsIgnoreCase("n")){
            System.out.println("Boa Noite!");
        }else {
            System.out.println("Valor Inválido");
        }
    }
    
}
