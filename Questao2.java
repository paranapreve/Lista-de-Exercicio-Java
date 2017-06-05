/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Scanner;

public class Questao2{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); 
        int opcao;
        int totalCalorias = 0;
        
        System.out.println("Selecione o PRATO informando o número da opção:");
        System.out.println("1 - Peixe (230cal) | 2 - Carne (300cal) ");
        opcao = entrada.nextInt();
        
        if(opcao == 1)
            totalCalorias += 230;
        else if(opcao == 2)
            totalCalorias += 300;

        System.out.println("Selecione a SOBREMESA informando o número da opção:");
        System.out.println("1 - Sorvete diet (110cal) | 2 - Mousse de chocolate (200cal) ");
        opcao = entrada.nextInt();
        
        if(opcao == 1)
            totalCalorias += 110;
        else if(opcao == 2)
            totalCalorias += 200;

        System.out.println("Selecione a BEBIDA informando o número da opção:");
        System.out.println("1 - Suco de laranja (70cal) | 2 - Chá (20cal) ");
        opcao = entrada.nextInt();
        
        if(opcao == 1)
            totalCalorias += 70;
        else if(opcao == 2)
            totalCalorias += 20;

        System.out.println("Total de calorias da refeição: " + totalCalorias + "cal");
    }
}
