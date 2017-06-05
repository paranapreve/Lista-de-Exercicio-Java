/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Scanner;


public class Questao1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        Scanner entrada = new Scanner(System.in); 
        
        
        System.out.print("Informe o nome do produto: ");
        String nome = input.next();
        
        System.out.print("Informe o preço de venda do produto: ");
        double preco = entrada.nextInt();
        
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco);
    }
}
