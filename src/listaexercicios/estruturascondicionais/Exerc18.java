
package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc18 {

    public static void main(String[] args) {
        /*
         Faça  um  Programa  que  peça  uma  data  no  formato  dd/mm/aaaa  e 
        determine se a mesma é uma data válida. 
        */
        
        //Setup
        Scanner leitor = new Scanner(System.in);
        
        //Variaveis
        String data,vetor[];
        int dia, mes, ano;
        
        //Entrada
        System.out.println("Entre com uma data no formato dd/mm/AAAA");
        data = leitor.nextLine();
        
        //Procedimento e Saída
        if(data.length()!=10){
            System.out.println("Data invalida");
        } else{
            vetor = data.split("/");
            dia = Integer.parseInt(vetor[0]);
            mes = Integer.parseInt(vetor[1]);
            ano = Integer.parseInt(vetor[2]);
            if(dia <= 0 || dia > 31 || mes < 1 || mes > 12 || ano <= 0){
                System.out.println("Data Invalida");
            }else{
                System.out.println("Data valida");
            }
        }
        
        //Fechamento
        leitor.close();      
    }
    
}
