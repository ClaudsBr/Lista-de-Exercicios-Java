package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc26 {

    public static void main(String[] args) {
        /*
        Um  posto  está  vendendo  combustíveis  com  a  seguinte  tabela  de 
        descontos: 
 
        Álcool: 

        a. até 20 litros, desconto de 3% por litro 
        b. acima de 20 litros, desconto de 5% por litro 

        Gasolina: 

        c. até 20 litros, desconto de 4% por litro 
        d. acima de 20 litros, desconto de 6% por litro 
        
        Escreva um algoritmo que leia o número de litros vendidos, o tipo de 
        combustível (codificado da seguinte forma: A-álcool, G- gasolina),  
        calcule  e  imprima  o  valor  a  ser  pago  pelo  cliente sabendo-se 
        que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool 
        é R$ 1,90. 
        */
        
        //Setup        
        Scanner scan = new Scanner(System.in);
        
        //Variaveis        
        String tipo;
        int litro;
        double total=0;
        
        //Entrada
        System.out.println("Digite o tipo de Combustivel que deseja abastecer:"
                + "\nA - Alcool \nG - Gasolina");
        tipo = scan.next();
        
        //Processamento e Saída
        if (tipo.equalsIgnoreCase("a")|| tipo.equalsIgnoreCase("g")){
            System.out.println("Digite a quantidade de litros que deseja comprar");
            litro = scan.nextInt();
            if(tipo.equalsIgnoreCase("a")){
                if(litro > 0){
                    if(litro <= 20){
                        total = ((double) litro * 1.9)*0.97; 
                    } else {
                        total = ((double)litro * 1.9)*0.95;
                    }                
                }else{
                    System.out.println("Quantidade inválida");
                }
            }else{
                if(litro > 0){
                    if(litro <= 20){
                        total = ((double) litro * 2.5)*0.96; 
                    } else {
                        total = ((double)litro * 2.5)*0.94;
                    }                
                }else{
                    System.out.println("Quantidade inválida");
                    }
            }
            System.out.printf("Total = R$ %.2f ",total);
        }else{
            System.out.println("Tipo de Combustível Inválido");
        }
        
        //Encerramento
        scan.close();
        
    }
    
}
