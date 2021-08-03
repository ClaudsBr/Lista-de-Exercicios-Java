package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc12 {

    public static void main(String[] args) {
        /*
        Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer 
        número inteiro entre 1 a 10. O usuário deve informar de qual numero ele 
        deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
 
        Tabuada de 5:
        
        5 X 1 = 5
        5 X 2 = 10
        5 X 3 = 15
         ...
        5 X 10 = 50
        */
        
        //Setup
        Scanner entrada = new Scanner(System.in);
    
        //Variaveis
        int tabuada;
    
        //Entrada
        System.out.println("Qual tabuada deseja imprimir?");
        tabuada = entrada.nextInt();
        
        
        //Processamento
        while(tabuada <1 || tabuada >10){
            System.out.println("Valor invalido.\nDigite um valor entre 1 e 10");
            tabuada = entrada.nextInt();
        }
        
        //Saída
        System.out.println("Tabuada do "+tabuada);
        for (int i = 0; i <= 10;i++){
                System.out.println(tabuada +" X "+i+" = "+ (tabuada*i));
        }
    
        //Encerramento
        entrada.close();
        
    }
   
    
    
    
            
    
}
