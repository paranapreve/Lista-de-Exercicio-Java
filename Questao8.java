/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Scanner;


public class Questao8 {
	public static void main(String[] args) {
            try (Scanner ler = new Scanner(System.in)) {
                double altura, formula;
                String sexo;
                System.out.println("Digite a altura (0.0): ");
                altura = Double.parseDouble(ler.nextLine());
                System.out.println("Digite o sexo: ");
                sexo = ler.nextLine();
                switch (sexo) {
                    case "masculino":
                        formula = (72.7*altura) - 58;
                        System.out.println("Seu peso ideal é: "+formula);
                        break;
                    case "feminino":
                        formula = (62.1*altura) - 44.7;
                        System.out.println("Seu peso ideal é: "+formula);
                        break;
                    default:
                        System.out.println("Sexo nao existente");
                        break;
                }
            }
	}
}
