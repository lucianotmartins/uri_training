package ex1010;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada

O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída

A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
https://www.urionlinejudge.com.br/judge/pt/problems/view/1010 
*/

public class Ex1010 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        int cod1 = ler.nextInt();
        int num1 = ler.nextInt();
        float vlr1 = ler.nextFloat();

        int cod2 = ler.nextInt();
        int num2 = ler.nextInt();
        float vlr2 = ler.nextFloat();

        float tot1 = num1 * vlr1;
        float tot2 = num2 * vlr2;

        float TOTAL = tot1 + tot2;

        System.out.println("VALOR A PAGAR: R$ " + df.format(TOTAL));
    }

}
