package listaexercicios;

import java.util.Scanner;

public class Exerc11 {

    public static void main(String[] args) {
        /*
        As Organizações Tabajara resolveram dar um aumento de salário aos seus 
        colaboradores e lhe contraram para desenvolver o programa que calculará 
        os reajustes.
        
        - Faça um programa que recebe o salário de um colaborador e o 
        reajuste segundo o seguinte critério, baseado no salário atual:
        - salários até R$ 280,00 (incluindo) : aumento de 20% 
        - salários entre R$ 280,00 e R$ 700,00 : aumento de 15% 
        - salários entre R$ 700,00 e R$ 1500,00 : aumento de 10% 
        - salários de R$ 1500,00 em diante : aumento de 5% 
        Após o aumento ser realizado, informe na tela:
        - o salário antes do reajuste;
        - o percentual de aumento aplicado;
        - o valor do aumento;
        - o novo salário, após o aumento.
        */
        
        //Setup
        Scanner teclado = new Scanner(System.in);
        
        // Variaveis
        float salario;
        int percentualAumento;
        //Entrada
        System.out.println("Entre com o valor do seu salário");
        salario = teclado.nextFloat();
        
        if (salario <= 280){
            percentualAumento = 20;
        } else if (salario > 280 && salario <= 700){
            percentualAumento = 15;
        } else if (salario > 700 && salario <= 1500){
            percentualAumento = 10;
        } else{
            percentualAumento = 5;
        }
        
        System.out.printf("Salário antes do reajuste: R$ %.2f \n", salario);
        System.out.println("Percentual de aumento aplicado: "+ percentualAumento+"%");
        System.out.printf("Valor do aumento: R$ %.2f \n", salario*((float)percentualAumento/100));
        System.out.printf("Novo salário após aumento: R$ %.2f \n",salario *(1+(float)percentualAumento/100));
    }
    
}
