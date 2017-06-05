/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;
import java.util.Scanner;



public class Questao7 {

	public static void main(String[] args) {
            try (Scanner ler = new Scanner(System.in)) {
                double valorProduto;
                
                System.out.println("Valor do produto comprado (R$ 0.0): ");
                valorProduto = Double.parseDouble(ler.nextLine());
                
                if(valorProduto<20){
                    valorProduto = valorProduto + valorProduto*0.45;
                    System.out.println("Valor da venda do produto: R$ "+valorProduto);
                }
                else{
                    valorProduto = valorProduto + valorProduto*0.3;
                    System.out.println("Valor da venda do produto: R$ "+valorProduto);
                }
            }
	}

}
