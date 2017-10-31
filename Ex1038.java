package ex1038;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

CODIGO      ESPECIFICACAO       PRECO
1           Cachorro Quente     R$ 4.00
2           X-Salda             R$ 4.50
3           X-Bacon             R$ 5.00
4           Torrada simples     R$ 2.00 
5           Refrigerante        R$ 1.50

Entrada

O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída

O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
 
https://www.urionlinejudge.com.br/judge/pt/problems/view/1038
*/
public class Ex1038 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        int cod = input.nextInt();
        float qtd = input.nextFloat();

        switch (cod) {
            case 1:
                qtd *= 4.00;

                break;
            case 2:
                qtd *= 4.50;

                break;
            case 3:
                qtd *= 5.00;

                break;
            case 4:
                qtd *= 2.00;

                break;
            case 5:
                qtd *= 1.50;

                break;
        }
        System.out.println("Total: R$ " + df.format(qtd));
    }

}
