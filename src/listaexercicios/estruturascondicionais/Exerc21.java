package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc21 {

    public static void main(String[] args) {
        /*
        Faça  um  Programa  para  um  caixa  eletrônico.  O  programa  deverá 
        perguntar ao usuário a valor do saque e depois informar quantas notas de 
        cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 
        50  e  100  reais.  O  valor  mínimo  é  de  10  reais  e  o  máximo  de
        600 reais. 
        O programa não deve se preocupar com a quantidade de notas existentes 
        na máquina. 
 
        . Exemplo  1:  Para  sacar  a  quantia  de  256  reais,  o  programa 
        fornece  duas  notas  de  100,  uma  nota  de  50,  uma  nota  de  5  e 
        uma nota de 1; 

        . Exemplo  2:  Para  sacar  a  quantia  de  399  reais,  o  programa 
        fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota 
        de 5 e quatro notas de 1.
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        //Variaveis        
        int saque, um, cinco, dez, cinquenta,cem, resto;
        
        //Entrada
        System.out.println("Digite a quantidade que deseja sacar");
        saque = scan.nextInt();
        
        //Procedimento e Saida
        if(saque < 10 || saque > 600){
            System.out.println("Esta máquina só permite saques com valores entre"
                    + " R$ 10,00 e R$ 600,00");
        } else{
            cem = saque/100;
            resto = saque%100;
            cinquenta = resto/50;
            resto = resto%50;
            dez = resto/10;
            resto = resto%10;
            cinco = resto/5;
            um = resto%5;
            
            System.out.println("Você receberá: ");
            System.out.println(cem + " notas de R$ 100,00");
            System.out.println(cinquenta + " notas de R$ 50,00");
            System.out.println(dez + " notas de R$ 10,00");
            System.out.println(cinco + " notas de R$ 5,00");
            System.out.println(um + " notas de R$ 1,00");
        }
        
        //Fechamento
        scan.close();
    }
    
}
