/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Scanner;


public class Questao4 {

	public static void main(String[] args) {
            try (Scanner ler = new Scanner(System.in) //para efetuar a leitura do que foi digitado
            ) {
                String municipio;
                int eleitores, maisVotado;
                double porcentagem;
                System.out.println("Nome do municipio: ");
                municipio = ler.nextLine();
                System.out.println("Quantidade de eleitores: ");
                eleitores= Integer.parseInt (ler.nextLine()); //conversão de String para inteiro
                System.out.println("Numero de votos do candidato mais votado: ");
                maisVotado= Integer.parseInt(ler.nextLine()); //conversão de String para inteiro
                if(eleitores>20000){
                    porcentagem= (maisVotado*100)/eleitores;
                    if(porcentagem<50.0){
                        System.out.println("O municipio "+municipio+" terá segundo turno.");
                    }
                    else{
                        System.out.println("O municipio "+municipio+" não terá segundo turno.");
                    }
                } else {
                    System.out.println("O municipio "+municipio+" não terá segundo turo.");
                }
            }	
	}
}
