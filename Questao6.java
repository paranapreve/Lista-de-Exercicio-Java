/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Scanner;


public class Questao6 {

	public static void main(String[] args) {
            try (Scanner ler = new Scanner(System.in)) {
                String nome;
                int idade;
                
                System.out.println("Digite o nome: ");
                nome = ler.nextLine();
                System.out.println("Digite a idade de "+nome+" :");
                idade = Integer.parseInt(ler.nextLine());
                
                if(idade>-1 && idade<=10){
                    System.out.println( nome +" deverá pagar R$ 160,00");
                }
                else if(idade>10 && idade<=29){
                    System.out.println( nome +" deverá pagar R$ 180,00");
                }
                else if(idade>29 && idade<=45){
                    System.out.println( nome +" deverá pagar R$ 220,00");
                }
                else if(idade>45 && idade<=59){
                    System.out.println( nome +" deverá pagar R$ 380,00");
                }
                else if(idade>59 && idade<=65){
                    System.out.println( nome +" deverá pagar R$ 450,00");
                }
                if(idade>65){
                    System.out.println( nome +" deverá pagar R$ 550,00");
                }
            }
	}

}
