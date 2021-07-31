package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc19 {

    public static void main(String[] args) {
        /*
        Faça  um  Programa  que  leia  um  número  inteiro  menor  que  1000  e 
        imprima a quantidade de centenas, dezenas e unidades do mesmo. 

        - Observando  os  termos  no  plural  a  colocação  do  "e",  da  
        vírgula entre outros. 
        Exemplo: 

        - 326 = 3 centenas, 2 dezenas e 6 unidades 

        - 12  =  1  dezena  e  2  unidades 
        
        Testar  com:  326,  300,  100,  320, 
        310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
        */
        
        //Setup
        Scanner teclado = new Scanner(System.in);
        
        //Variaveis
        int numero, centena, dezena, unidade,resto;
        
        //Entrada
        System.out.println("Entre com um numero inteiro menor que 1000");
        numero = teclado.nextInt();
        
        //Procedimento e Saída
        if(numero >= 1000){
            System.out.println("Valor inválido");
        } else {
            centena = numero/100;
            resto = numero%100;
            dezena = resto/10;
            unidade = resto%10;
            
            if (centena == 0 && dezena == 0 && unidade ==1){
                System.out.println(unidade + " unidade");               
            } else if(centena == 0 && dezena==0 && unidade > 1){
                System.out.println(unidade+" unidades");
            }else if(centena == 0 && dezena ==1 && unidade == 0){
                System.out.println(dezena+" dezena");
            } else if(centena == 0 && dezena == 1 && unidade == 1){
                System.out.println(dezena+" dezena e "+unidade+" unidade");
            } else if (centena ==0 && dezena == 1 && unidade > 1 ){
                System.out.println(dezena+" dezena e "+unidade+" unidades");
            }else if(centena == 0 && dezena > 1 && unidade ==0){
                System.out.println(dezena+" dezenas");
            }else if(centena == 0 && dezena > 1 && unidade ==1){
                System.out.println(dezena+" dezenas e "+unidade+" unidade");
            }else if(centena == 0 && dezena > 1 && unidade >1){
                System.out.println(dezena+" dezenas e "+unidade+" unidades");
            }else if(centena == 1 && dezena ==0 && unidade ==0){
                System.out.println(centena+" centena");
            }else if(centena == 1 && dezena ==0 && unidade ==1){
                System.out.println(centena+" centena e "
                        +unidade+" unidade");
            }else if(centena == 1 && dezena ==0 && unidade >1){
                System.out.println(centena+" centena e "+unidade+" unidades");
            }else if(centena == 1 && dezena ==1 && unidade ==0){
                System.out.println(centena+" centena, "+dezena+" dezenas");
            }else if(centena == 1 && dezena == 1 && unidade == 1){
                System.out.println(centena+" centena, "+dezena+" dezena e "
                        +unidade+" unidade");
            }else if(centena == 1 && dezena > 1 && unidade ==0){
                System.out.println(centena+" centena, "+dezena+" dezenas");
            }else if(centena == 1 && dezena > 1 && unidade ==1){
                System.out.println(centena+" centena, "+dezena+" dezenas e "
                        +unidade+" unidade");
            }else if(centena == 1 && dezena > 1 && unidade >1){
                System.out.println(centena+" centena, "+dezena+" dezenas e "
                        +unidade+" unidades");
            }else if(centena > 1 && dezena ==0 && unidade ==0){
                System.out.println(centena+" centenas");
            }else if(centena > 1 && dezena ==0 && unidade ==1){
                System.out.println(centena+" centenas e "+unidade+" unidade");
            }else if(centena > 1 && dezena ==0 && unidade >1){
                System.out.println(centena+" centenas e "+unidade+" unidades");
            }else if(centena > 1 && dezena ==1 && unidade ==0){
                System.out.println(centena+" centenas, "+dezena+" dezena ");
            }else if(centena > 1 && dezena == 1 && unidade == 1){
                 System.out.println(centena+" centenas, "+dezena+" dezena e "
                        +unidade+" unidade");
            }else if(centena > 1 && dezena > 1 && unidade ==0){
                System.out.println(centena+" centenas, "+dezena+" dezenas");
            }else if(centena > 1 && dezena > 1 && unidade ==1){
                System.out.println(centena+" centenas, "+dezena+" dezenas e "
                        +unidade+" unidade");                
            }else if(centena > 1 && dezena > 1 && unidade >1){
                System.out.println(centena+" centenas, "+dezena+" dezenas e "
                        +unidade+" unidades");
            }
            
            //Fechamento
            teclado.close();
        }
    }
    
}
