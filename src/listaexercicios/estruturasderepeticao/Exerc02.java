package listaexercicios.estruturasderepeticao;

import java.util.Scanner;

public class Exerc02 {

    public static void main(String[] args) {
        /*
        Faça um programa que leia um nome de usuário e a sua senha e não 
        aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro 
        e voltando a pedir as informações.
        */
        
        //Setup
        Scanner entrada = new Scanner(System.in);
        
        //Variaveis
        String usuario;
        String senha;
        
        //Entrada
        System.out.println("Usuário: ");
        usuario = entrada.nextLine();
        System.out.println("Senha: ");
        senha = entrada.nextLine();
        do{
            System.out.println("Senha Inválida");
            System.out.println("Digite novamente sua senha");
            senha = entrada.nextLine();
            
        }while(usuario.equalsIgnoreCase(senha));
        
        //Encerramento
        entrada.close();
    }
    
}
