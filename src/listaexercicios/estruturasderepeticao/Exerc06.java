package listaexercicios.estruturasderepeticao;



public class Exerc06 {

    public static void main(String[] args) {
        /*
        Faça um programa que imprima na tela os números de 1 a 20, um abaixo do 
        outro. Depois modifique o programa para que ele mostre os números um ao 
        lado do outro.
        */
        
        
        
        //Variaveis
        int contador;
        
        //Procedimento e saida
        contador = 1;
        
        System.out.println("Imprimindo um embaixo do outro");
        while(contador <=20){
            System.out.println(contador); // imprimeindo um embaixo do outro
            contador++;
        }
        
        System.out.println("Imprimindo um ao lado do outro");
        contador=1;
        while(contador <= 20){
            System.out.print(contador+ " "); //imprimindo um ao lado do outro
            contador++;
        }
            
    }
    
}
