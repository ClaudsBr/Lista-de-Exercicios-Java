package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc25 {

    public static void main(String[] args) {
        /*
         Faça  um  programa  que  faça  5  perguntas  para  uma  pessoa  sobre  
        um crime. As perguntas são: 
 
        a. "Telefonou para a vítima?" 
        b. "Esteve no local do crime?" 
        c. "Mora perto da vítima?" 
        d. "Devia para a vítima?" 
        e. "Já  trabalhou  com  a  vítima?" 
        
        O  programa  deve  no  final  emitir uma classificação sobre a 
        participação da pessoa no crime. Se a  pessoa  responder  positivamente 
        a  2  questões  ela  deve  ser classificada  como  "Suspeita",  entre  
        3  e  4  como  "Cúmplice"  e  5 como  "Assassino".  Caso  contrário,  
        ele  será  classificado  como "Inocente". 
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        //Variaveis
        int contador=0;
        String resp;
        
        //Entrada
        System.out.println("Telefonou para a vítima?");
        resp = scan.next();
        
        if (resp.equalsIgnoreCase("s")){
            contador++;
        }
        
        System.out.println("Esteve no local do crime?");
        resp = scan.next();
        
        if (resp.equalsIgnoreCase("s")){
            contador++;
        }
        
        System.out.println("Mora perto da vítima?");
        resp = scan.next();
        
        if (resp.equalsIgnoreCase("s")){
            contador++;
        }
        
        System.out.println("Devia para a vítima?");
        resp = scan.next();
        
        if (resp.equalsIgnoreCase("s")){
            contador++;
        }
        
        System.out.println("Já  trabalhou  com  a  vítima?");
        resp = scan.next();
        
        if (resp.equalsIgnoreCase("s")){
            contador++;
        }
        
        if(contador ==5){
            System.out.println("Assassino");
        }else if(contador == 3 || contador ==4){
            System.out.println("Cumplice");
        }else if(contador ==2){
            System.out.println("Suspeito");
        }else{
            System.out.println("Inocente");
        }
    }
    
}
