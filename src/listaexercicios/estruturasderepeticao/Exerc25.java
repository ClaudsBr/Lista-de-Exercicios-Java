package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc25 {

    public static void main(String[] args) {
        /*
        Faça um programa que peça para n pessoas a sua idade, ao final o 
        programa devera verificar se a média de idade da turma varia entre 0 e 
        25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou 
        idosa, conforme a média calculada.
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        //Variaveis
        int qtdPessoas, idade, somador;
        float media;
        
        //Entrada
        System.out.println("Digite a quantidade de Pessoas");
        qtdPessoas = scan.nextInt();
        somador =0;
        
        //Processamento
        for(int i=1; i <= qtdPessoas;i++){
            System.out.println("Entre com a "+i+"ª idade");
            idade = scan.nextInt();
            somador += idade;
        }
        media = somador / qtdPessoas;
        
        if(media <= 25){
            System.out.println("Media etária: "+media+"\nPopulação média: Jovem");
        }else if (media > 25 && media <= 60){
            System.out.println("Media etária: "+media+"\nPopulação média: Adulta");
        }else{
            System.out.println("Media etária: "+media+"\nPopulação média: Idosa");
        }
        //Encerramento
        scan.close();
    }
    
}
