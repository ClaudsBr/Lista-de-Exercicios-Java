package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc05 {

    public static void main(String[] args) {
        /*
        Faça um programa que permita ao usuário informar as populações e as 
        taxas de crescimento iniciais. Valide a entrada, calcule e escreva o 
        número de anos necessários para que a população do país A ultrapasse ou 
        iguale a população do país B, mantidas as taxas de crescimento.
        */
        
        //Setup
        Scanner entrada = new Scanner(System.in);
        
        //Variaveis
        int A, B, qtAnos=0;
        float tcA,tcB;
        
        //Entrada
        System.out.println("Entre com a população do primeiro país");
        A = entrada.nextInt();
        while(A < 0){
            System.out.println("População invalida");
            System.out.println("Digite novamente a população do primeiro país");
            A = entrada.nextInt();
        }
        System.out.println("Digite a taxa de crescimento anual deste país");
        tcA = entrada.nextFloat();
        while(tcA < 0){
            System.out.println("Valor invalido");
            System.out.println("Digite novamente a taxa de crescimento");
            tcA = entrada.nextFloat();
        }
        
        System.out.println("Entre com a população do segundo país ");
        B = entrada.nextInt();
        while(B<0){
            System.out.println("População Invalida");
            System.out.println("Digite novamente");
            B = entrada.nextInt();
        }
        System.out.println("Digite a taxa de crescimento anual deste país");
        tcB = entrada.nextFloat();
        while(tcB < 0){
            System.out.println("Valor invalido");
            System.out.println("Digite novamente a taxa de crescimento");
            tcA = entrada.nextFloat();
        }
        
        if (A > B && tcA < tcB){
            while(A > B){
                A = A + (int)(A * tcA/100);
                B = B + (int)(B * tcB/100);
                qtAnos++;
            }
            System.out.printf("A população do primeiro país será alcançada em "
                    + "%d anos",qtAnos);
        } else if (B > A && tcB < tcA){
            while(B > A){
                A = A + (int)(A * tcA/100);
                B = B + (int)(B * tcB/100);
                qtAnos++;
            }
            System.out.printf("A população do segundo país será alcançada em "
                    + "%d anos",qtAnos);
        }else{
            System.out.println("A população maior também tem uma taxa de "
                    + "crescimento maior, esta população nunca será alcançada");
        }
        
        
        
        //Encerramento
        entrada.close();
    }
    
}
