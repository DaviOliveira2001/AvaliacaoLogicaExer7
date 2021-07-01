/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaologicaexer7;

import java.util.Scanner;

/**
 *
 * @author odavi
 */
public class AvaliacaoLogicaExer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int quantidadeTotal, quantP, quantM, quantG;
        double valorArrecadado, valorP, valorM, valorG, valorDesconto;
        valorArrecadado = 0;
        
        System.out.println("Informe a quantidade de camisetas P vendidas:");
        quantP = teclado.nextInt();
        System.out.println("Informe a quantidade de camisetas M vendidas:");
        quantM = teclado.nextInt();
        System.out.println("Informe a quantidade de camisetas G vendidas:");
        quantG = teclado.nextInt();
        
        valorP = quantP * 10;
        valorM = quantM * 12;
        valorG = quantG * 15;
        valorArrecadado = valorP + valorM + valorG;
        quantidadeTotal = quantP + quantM + quantG;
        
        if(quantP > 5 && quantM > 5 && quantG > 5){
            valorDesconto = valorArrecadado - (valorArrecadado * 0.055);
            System.out.println("Valor da camiseta P: R$10,00");
            System.out.println("Valor da camiseta M: R$12,00");
            System.out.println("Valor da camiseta G: R$15,00");
            System.out.println("Valor total com desconto: R$"+valorDesconto);
        }else{
             System.out.println("Valor da camiseta P: R$10,00");
            System.out.println("Valor da camiseta M: R$12,00");
            System.out.println("Valor da camiseta G: R$15,00");
            System.out.println("Valor total sem desconto: R$"+valorArrecadado);
        }
        
    }
    
}
