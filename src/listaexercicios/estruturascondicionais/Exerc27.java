package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc27 {

    public static void main(String[] args) {
        /*
        Uma quitanda está vendendo frutas com a seguinte tabela de preços: 
        
                        Até 5 Kg                Acima de 5 Kg  
        Morango         R$ 2,50 por Kg          R$ 2,20 por Kg  
        Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg 

        Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra  
        ultrapassar  R$  25,00,  receberá  ainda  um  desconto  de 10% sobre 
        este total. 
        Escreva um algoritmo para ler a quantidade  (em  Kg)  de  morangos  e  
        a  quantidade  (em  Kg)  de maças adquiridas e escreva o valor a ser 
        pago pelo cliente. 
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        //Variaveis
        double maca,morango,pesoTotal;
        double valorCesta=0;
        
        //Entrada
        System.out.println("Digite o peso dos morangos em Kgs");
        morango = scan.nextDouble();
        System.out.println("Digite o peso das maçãs em Kgs");
        maca = scan.nextDouble();
        
        //Processamento
        if(morango <= 5){
            valorCesta = valorCesta + (morango*2.5);
        }else if(morango > 5){
            valorCesta = valorCesta + (morango *2.2);
        }
        
        if (maca <= 5){
            valorCesta = valorCesta + (maca*1.8); 
        }else{
            valorCesta = valorCesta + (maca*1.5);
        }
        
        pesoTotal = maca + morango;
        if(pesoTotal > 8 || valorCesta > 25){
            valorCesta = valorCesta * 0.9;
        }
        //Saída
        System.out.printf("Total = R$ %.2f",valorCesta);
        
        //Encerramento
        scan.close();
    }
    
}
