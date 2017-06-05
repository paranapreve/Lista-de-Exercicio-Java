/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;
import java.util.Scanner;


public class Questao9{

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String empresa;
		double indice;
		
		System.out.println("Nome da empresa: ");
		empresa = ler.nextLine();
		System.out.println("Índice de poluição: ");
		indice = Double.parseDouble(ler.nextLine());
		if (indice <= 0.25)
			System.out.println("Índice dentro dos padrões aceitáveis");
		else if(indice > 0.25 && indice <= 0.3)
			System.out.println("NOTIFICAÇÃO PARA  1º GRUPO para a empresa " + empresa);
		else if(indice > 0.3 && indice <= 0.4)
			System.out.println("NOTIFICAÇÃO DE 1º e 2º GRUPO para a empresa " + empresa);
		else
			System.out.println("NOTIFICAÇÃO DE 1º, 2º e 3º GRUPO para a empresa " + empresa);

	}

}

