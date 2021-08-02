package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc03 {

    public static void main(String[] args) {
        /*
        Faça um programa que leia e valide as seguintes informações:

        a. Nome: maior que 3 caracteres;
        b. Idade: entre 0 e 150;
        c. Salário: maior que zero;
        d. Sexo: 'f' ou 'm';
        e. Estado Civil: 's', 'c', 'v', 'd';
        */
        
        //Setup
        Scanner teclado = new Scanner(System.in);
        
        //Variaveis
        String nome;
        int idade;
        double salario;
        String sexo, estadoCivil;
        
        //Entrada e Processamento
        System.out.println("Digite seu nome");
        nome = teclado.nextLine();
        
        while(nome.length()<3){
            System.out.println("Nome Invalido");
            System.out.println("Digite seu nome novamente");
            nome = teclado.nextLine();
        }
        
        System.out.println("Digite sua idade");
        idade = teclado.nextInt();
        
        while(idade < 0 || idade > 150){
            System.out.println("Idade Inválida");
            System.out.println("Digite sua idade novamente:");
            idade = teclado.nextInt();
        }
        
        System.out.println("Digite o valor do seu salario");
        salario = teclado.nextDouble();
        
        while(salario < 0){
            System.out.println("Salario invalido");
            System.out.println("Digite novamente:");
            salario = teclado.nextDouble();
        }
        
        System.out.println("Digite seu sexo: \nM - masculino\nF - Feminino");
        sexo = teclado.next();
        
        while(!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")){
            System.out.println("Sexo Invalido");
            System.out.println("Digite novamente");
            sexo = teclado.nextLine();
        }
        
        System.out.println("Digite seu estado civil:\n"
                + "s - solteiro(a)\nc - casado(a)\n d- divorciado(a)\nv - viuvo(a)");
        estadoCivil = teclado.next();
        while(!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c")  
                && !estadoCivil.equalsIgnoreCase("d")&& !estadoCivil.equalsIgnoreCase("v")){
            System.out.println("Estado Civil Invalido");
            System.out.println("Digite novamente");
            estadoCivil = teclado.nextLine();
        }
        
        //Saida
        System.out.println("Nome: "+nome);
        System.out.println("Idade "+idade+" anos");
        System.out.printf("Salario: R$ %.2f\n",salario);
        if (sexo.equalsIgnoreCase("m")){
            System.out.println("Sexo: Masculino");
        }else {
            System.out.println("Sexo: Feminino");
        }
        
        if(estadoCivil.equalsIgnoreCase("s")){
            System.out.println("Estado Civil: Solteiro(a)");
        }else if(estadoCivil.equalsIgnoreCase("c")){
            System.out.println("Estado Civil: Casado(a)");
        }else if(estadoCivil.equalsIgnoreCase("d")){
            System.out.println("Estado Civil: Divorciado(a)");
        } else{
            System.out.println("Estado Civil: Viuvo(a)");
        }
        
        //Encerramento
        teclado.close();
    }
    
}
