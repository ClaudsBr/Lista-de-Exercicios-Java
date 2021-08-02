package listaexercicios.estruturasderepeticao;

import java.util.Scanner;


public class Exerc04 {

    public static void main(String[] args) {
        /*
        Supondo que a população de um país A seja da ordem de 80000 habitantes 
        com uma taxa anual de crescimento de 3% e que a população de B seja 
        200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa 
        que calcule e escreva o número de anos necessários para que a população 
        do país A ultrapasse ou iguale a população do país B, mantidas as taxas 
        de crescimento.
        */
        
               
        //Variaveis
        int A, B, qtAnos;
        float tcA,tcB;
        
        //Processamento
        A = 80000;
        B = 200000;
        tcA = 3;
        tcB = 1.5f;
        qtAnos =0;
        
        while(B > A){
            A = A + (int)(A*0.03);
            B = B + (int)(B*0.015);
            qtAnos++;
        }
        //Saída
        System.out.printf("Serão necessarios %d anos para que a população do país A "
                + "iguale ou ultrapasse a população do país B ", qtAnos);
        
        
    }
    
}
