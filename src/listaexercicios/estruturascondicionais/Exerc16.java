package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc16 {

    public static void main(String[] args) {
        /*
         Faça um programa que calcule as raízes de uma equação do segundo grau, 
        na forma ax2 + bx + c. O programa deverá pedir os valores de a, b  e  c 
        e  fazer  as  consistências,  informando  ao  usuário  nas  seguintes 
        situações: 

        a. Se o usuário informar o valor de A igual a zero, a equação não é do 
        segundo grau e o programa não deve fazer pedir os demais valores, sendo 
        encerrado; 

        b. Se  o  delta  calculado  for  negativo,  a  equação  não  possui  
        raizes reais. Informe ao usuário e encerre o programa; 

        c. Se  o  delta  calculado  for  igual  a  zero  a  equação  possui  
        apenas uma raiz real; informe-a ao usuário; 

        d. Se  o  delta  for  positivo,  a  equação  possui  duas  raiz  reais; 
        informe-as ao usuário; 
        */
        
        //Setup
        Scanner teclado = new Scanner(System.in);
        
        //Variaveis
        int a,b,c;
        double delta;
        
        //Entrada
        System.out.println("Construindo uma equação do segundo grau");
        System.out.println("Entre com o valor de a");
        a = teclado.nextInt();
        
        //Procedimento e saída
        if(a == 0){
            System.out.println("Esta equação NÃO é de segundo grau");
        } else{
            System.out.println("Entre com o valor de b");
            b = teclado.nextInt();
            System.out.println("Entre com o valor de c");
            c = teclado.nextInt();
            delta = Math.pow(b, 2) - (4*a*c);
            if(delta < 0){
                System.out.println("A equação não possui raízes reais");
            } else if(delta==0){
                double raiz = ((-b) + Math.sqrt(delta))/(2*a);
                System.out.println("Delta = "+delta 
                        + "\n A equação possui apenas 1 raíz = "+raiz);
                                                    
                }else{
                double raiz1 = ((-b)+ Math.sqrt(delta))/(2*a);
                double raiz2 = ((-b) - Math.sqrt(delta))/(2*a);
                System.out.println("Delta = "+delta 
                        + "\nA equação possui duas raízes = "+raiz1+" e "+raiz2);
                }
                
            }
        
        
        //Procedimento e saída com loop while
        
       /* while(a != 0){
            System.out.println("Entre com o valor de b");
            b = teclado.nextInt();
            System.out.println("Entre com o valor de c");
            c = teclado.nextInt();
            delta = (b*b) - (4*a*c);
            
            if (delta < 0){
                System.out.println("Delta com valor negativo: "+delta
                        +"\nSua equação não possui raízes reais");
                break;
            }else if(delta == 0){
                double raiz = ((-b)+Math.sqrt(delta))/(2*a);
                System.out.println("Delta = "+delta
                        +"\nSua equação possui apenas uma raíz real = "+raiz);
                break;
            } else{
                double raiz1 = ((-b)+Math.sqrt(delta))/(2*a);
                double raiz2 = ((-b)-Math.sqrt(delta))/(2*a);
                System.out.println("Delta = "+delta
                        +"\nSua equação possui duas raizes reais: "
                        + raiz1+" e "+raiz2);
                break;
            }
            
        }*/
        
        //Fechamento
        teclado.close();
        
    }
    
}
