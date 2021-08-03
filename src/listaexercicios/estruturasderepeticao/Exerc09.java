package listaexercicios.estruturasderepeticao;

public class Exerc09 {

    public static void main(String[] args) {
        /*
        Faça um programa que imprima na tela apenas os números ímpares entre 1 
        e 50.
        */
        
        //Usando o laço for
        for(int i =0; i <= 50; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        
        //Pulando uma linha
        System.out.println();
        
        //Usando o laço while
        int contador = 0;
        while(contador <= 50){
            if (contador%2 != 0){
                System.out.println(contador);
            }
            contador++;
        }
    }
    
}
