/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Scanner;


public class Questao10 {

	public static void main(String[] args) {
            try (Scanner ler = new Scanner(System.in)) {
                char[] vogais = {'A','E','I','O', 'U', 'a','e','i','o', 'u'};
                int[] qtds = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                String mensagem;
                
                System.out.println("Digite a mensagem");
                mensagem = ler.nextLine();
                
                for(int i = 0; i<mensagem.length(); i++){
                    for(int j = 0; j<vogais.length; j++){
                        if(mensagem.charAt(i) == vogais[j]){
                            qtds[j]++;
                        }
                    }
                }
                
                for(int i = 0; i < vogais.length; i++){
                    System.out.println(vogais[i] + ": " + qtds[i]);
                }
            }
	}

}

