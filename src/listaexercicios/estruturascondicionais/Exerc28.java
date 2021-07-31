package listaexercicios.estruturascondicionais;

import java.util.Scanner;

public class Exerc28 {

    public static void main(String[] args) {
        /*
        O  Hipermercado  Tabajara  está  com  uma  promoção  de  carnes  que  é 
        imperdível. Confira: 
        
                         Até 5 Kg                Acima de 5 Kg  
         Contra-Filé     R$ 44,90 por Kg          R$ 38,90 por Kg  
         Alcatra         R$ 40,90 por Kg          R$ 36,90 por Kg  
         Picanha         R$ 60,90 por Kg          R$ 53,90 por Kg 

        Para  atender  a  todos  os  clientes,  cada  cliente  poderá  levar 
        apenas  um  dos  tipos  de  carne  da  promoção,  porém  não  há limites
        para  a  quantidade  de  carne  por  cliente.  Se  compra  for feita  
        no  cartão  da loja  o  cliente  receberá  ainda  um  desconto de 5% 
        sobre o total a compra. 
        Escreva um programa que peça o  tipo  e  a  quantidade  de  carne  
        comprada  pelo  usuário  e  gere um  cupom  fiscal,  contendo  as  
        informações  da  compra:  tipo  e quantidade  de carne,  preço  total,  
        tipo  de  pagamento,  valor  do desconto e valor a pagar.
        */
        
        //Setup
        Scanner scan = new Scanner(System.in);
        
        //Variaveis
        int  tipoCarne, formaPagamento;
        double total,quantidade , desconto, valorDescontado;
        
        
        //Entrada
        System.out.println("Digite o tipo de Carne que deseja comprar"
                + "\n1 - Contra-Filé \n2 - Alcatra \n3 - Picanha");
        tipoCarne = scan.nextInt();
        if(tipoCarne >= 1 && tipoCarne <= 3){
            System.out.println("Digite o peso em Kgs que deseja comprar");
            quantidade = scan.nextDouble();
            System.out.println("Digite a forma de Pagamento"
                    + "\n1 - Dinheiro\n2 - Cartão da Loja");
            formaPagamento = scan.nextInt();
            if(tipoCarne ==1){
                System.out.println(" CUPOM FISCAL");
                if(quantidade <= 5){
                    if(formaPagamento == 2){
                        desconto = 0.05;
                        total = quantidade * 44.90 *0.95;
                        valorDescontado = desconto * total;
                        System.out.println("Tipo Pagamento: cartão da Loja");
                    }else {
                        desconto = 0;
                        total = quantidade*44.90;
                        valorDescontado = desconto * total;
                        System.out.println("Tipo de Pagamento: Dinheiro");
                    }
                }else {
                    if (formaPagamento == 2){
                       desconto = 0.95 -  (38.9/44.9);
                       total = quantidade*(38.90)*(0.95);
                       valorDescontado = desconto * total;
                       System.out.println("Tipo Pagamento: cartão da Loja");
                    }else{
                        total = quantidade*38.90;
                        desconto = 1 - (38.9/44.9);
                        valorDescontado = desconto * total;
                        System.out.println("Tipo de Pagamento: Dinheiro");
                    }
                }
                System.out.printf("Tipo de carne: Contra-Filé\nPeso: %.1f Kg "
                        + "\nDesconto: %.2f %%\nValor Descontado: R$ %.2f\nTotal a Pagar: R$ %.2f\n",
                        quantidade,  desconto*100, valorDescontado, total);
            }else if (tipoCarne == 2){
                System.out.println(" CUPOM FISCAL");
                if(quantidade <= 5){
                    total = quantidade*40.90;
                    if(formaPagamento == 2){
                        desconto = 0.05;
                        valorDescontado = desconto * total;
                        total = quantidade*40.90*0.95;
                        System.out.println("Tipo Pagamento: cartão da Loja");
                    }else{
                        desconto = 0;
                        valorDescontado = desconto * total;
                        System.out.println("Tipo de Pagamento: Dinheiro");
                    }
                } else{
                    if (formaPagamento == 2){
                        desconto = 0.95 -(36.90/40.90);
                        total = quantidade*36.90*0.95;
                        valorDescontado = desconto * total;
                        System.out.println("Tipo Pagamento: cartão da Loja");
                    }else{
                        desconto = 1 - (36.90/40.90);
                        total = quantidade*36.90;
                        valorDescontado = desconto * total;       
                        System.out.println("Tipo de Pagamento: Dinheiro");
                    }
                }
                System.out.printf("Tipo de carne: Alcatra\nPeso: %.1f Kg "
                        + "\nDesconto: %.2f %%\nValor Descontado: R$ %.2f\nTotal a Pagar: R$ %.2f\n",
                        quantidade,  desconto*100, valorDescontado, total);
            }else{
                System.out.println(" CUPOM FISCAL");
                if(quantidade <=5){
                    total = quantidade * 60.90;                    
                    if(formaPagamento == 2){
                        desconto = 0.05;
                        total = quantidade * 60.90*0.95;
                        valorDescontado = desconto * total;
                        System.out.println("Tipo Pagamento: cartão da Loja");
                    }else{
                       desconto = 0;
                       valorDescontado = desconto * total;
                       System.out.println("Tipo de Pagamento: Dinheiro");
                    }
                }else{
                    total = quantidade * 53.90;
                    if(formaPagamento ==2){
                        desconto = 0.95 - (53.90/60.90);
                        total = quantidade * 53.90*0.95;
                        valorDescontado = desconto * total;
                        System.out.println("Tipo Pagamento: cartão da Loja");
                    }else{
                        desconto = 1 - (53.90/60.90);
                        valorDescontado = desconto * total;                                
                        System.out.println("Tipo de Pagamento: Dinheiro");
                    }
                }
                System.out.printf("Tipo de carne: Picanha\nPeso: %.1f Kg "
                        + "\nDesconto: %.2f %%\nValor Descontado: R$ %.2f\nTotal a Pagar: R$ %.2f\n",
                        quantidade,  desconto*100, valorDescontado, total);
            }
        }else{
            System.out.println("Tipo inválido");
        }
    }
    
}
