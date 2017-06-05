/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;
import java.util.Scanner;



public class Questao5 {

	public static void main(String[] args) {
            try (Scanner ler = new Scanner(System.in)) {
                String nome;
                double valorConta;
                boolean naoEsta = false;
                char[] letras = { 'A', 'D', 'M', 'S', 'a', 'd', 'm', 's' };
                
                System.out.println("Digite o nome do cliente: ");
                nome = ler.nextLine();
                System.out.println("Digite o valor da conta do cliente " + nome + " :");
                valorConta = Double.parseDouble(ler.nextLine()); //converte de String para double
                
                for (int i = 0; i < letras.length; i++) {
                    if (nome.charAt(0) == letras[i]) {
                        valorConta = valorConta - valorConta * 0.3;
                        System.out.println("Você ganhou um desconto de 30%");
                        System.out.println("Valor a pagar é: R$ " + valorConta);
                    } else {
                        naoEsta = true;
                    }
                }
                if (!naoEsta) {
                    System.out.println(
                            "Que pena. Nesta semana o desconto não é para seu nome, mas continue nos prestigiando que sua vez chegará");
                    System.out.println("Valor a pagar é: R$ " + valorConta);
                }
            }
	}

}
