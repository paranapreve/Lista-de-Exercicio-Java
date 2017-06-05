/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Scanner;

public class Questao3
{
    
public static void main(String[] args)
{        Scanner entrada = new Scanner(System.in); 
        int destino, tipo;
        double preco = 0;

        System.out.println("Informe a região de destino digitando o número correspondente:");
        System.out.println("1 - Norte | 2 - Nordeste | 3 - Centro-Oeste | 4 - Sul");
        destino = entrada.nextInt();

        System.out.println("Informe o tipo da viagem digitando o número correspondente:");
        System.out.println("1 - IDA | 2 - IDA e VOLTA");
        tipo = entrada.nextInt();

        switch(destino){
            case 1:
                if(tipo == 1)
                    preco = 500;
                else
                    preco = 900;
            break;
            case 2:
                if(tipo == 1)
                    preco = 350;
                else
                    preco = 650;
            break;
            case 3:
                if(tipo == 1)
                    preco = 400;
                else
                    preco = 750;
            break;
            case 4:
                if(tipo == 1)
                    preco = 300;
                else
                    preco = 550;
            break;
            default:
                System.out.println("Destino inválido.");
        }

        System.out.println("Preço total da viagem: R$ " + preco);

    }
}
