package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc12 {

    public static void main(String[] args) {
        /*
        Faça um programa para o cálculo de uma folha de pagamento, sabendo que 
        os descontos são do Imposto de Renda, que depende do salário bruto 
        (conforme tabela abaixo), 3% para o sindicato e 10% para o INSS e que o 
        FGTS corresponde a 11% do Salário Bruto, mas não é descontado 
        (é a empresa que deposita). 
        O Salário Líquido corresponde ao Salário Bruto menos os descontos. 
        O programa deverá pedir ao usuário o valor da sua hora e a quantidade 
        de horas trabalhadas no mês.
        
        - Desconto do IR:
        - Salário Bruto até 900 (inclusive) - isento
        - Salário Bruto até 1500 (inclusive) - desconto de 5%
        - Salário Bruto até 2500 (inclusive) - desconto de 10%
        - Salário Bruto acima de 2500 - desconto de 20% 
        Imprima na tela as informações, dispostas conforme o exemplo abaixo. 
        No exemplo o valor da hora é 5 e a quantidade de hora é 220.
        
        Salário Bruto: (5 * 220) : R$ 1100,00
        (-) IR (5%) : R$ 55,00
        (-) INSS ( 10%) : R$ 110,00
        FGTS (11%) : R$ 121,00
        Total de descontos : R$ 165,00
        Salário Liquido : R$ 935,00
        */
        
        //Setup
        Scanner teclado = new Scanner(System.in);
        
        //Variaveis
        float valorHora;
        int horasTrabalhadas;
        float salarioBruto;
        float IR, INSS, FGTS, sindicato;
        
        
        // Entrada
        System.out.println("Entre com o valor da hora trabalhada");
        valorHora = teclado.nextFloat();
        System.out.println("Entre com a quantidade de horas trabalhadas");
        horasTrabalhadas = teclado.nextInt();
        
        // Procedimento
        salarioBruto = valorHora * horasTrabalhadas;
        INSS = 10;
        FGTS = 11;
        sindicato = 3;
        if (salarioBruto <= 900 ){
            IR = 0;
        }else if(salarioBruto > 900 && salarioBruto <= 1500){
            IR = 5;
            
        } else if(salarioBruto > 1500 && salarioBruto <= 2500){
            IR = 10;
        }else {
            IR = 20;
        }
        
        //Saida
        System.out.printf("Salario Bruto: (%d * %d) : R$ %.2f \n", 
                (int)valorHora, horasTrabalhadas, valorHora*horasTrabalhadas);
        System.out.printf("(-) IR (%d %%) : R$ %.2f \n",
                (int)IR,salarioBruto*IR/100);  
        System.out.printf("(-) INSS ( %d %%) : R$ %.2f \n",
                (int)INSS, salarioBruto * INSS/100 );
        System.out.printf("FGTS (%d %%) : R$ %.2f \n",
                (int)FGTS,salarioBruto*FGTS/100 );
        System.out.printf("(-) Sindicato (%d %%) : R$ %.2f \n",
                (int)sindicato,salarioBruto*sindicato/100);
        System.out.printf("Total de descontos : R$ %.2f \n", 
                (salarioBruto*IR/100) +  (salarioBruto * INSS/100) 
                        + (salarioBruto*sindicato/100) );
        System.out.printf("Salário Liquido : R$ %.2f\n",salarioBruto 
                - ((salarioBruto*IR/100) +  (salarioBruto * INSS/100) 
                        + (salarioBruto*sindicato/100)) );
        //Fechamento
        teclado.close();
    }
    
}
