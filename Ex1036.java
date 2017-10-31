package ex1036;

import java.text.DecimalFormat;
import java.util.Scanner;


/*
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada

Leia três valores de ponto flutuante (double) A, B e C.

Saída

Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
https://www.urionlinejudge.com.br/judge/pt/problems/view/1036 
*/
public class Ex1036 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#0.00000");

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double delta = B * B - 4 * A * C;

        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");

        } else {
            double r1 = (-B + Math.sqrt(delta)) / (2 * A);
            double r2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.println("R1 = " + df.format(r1));
            System.out.println("R2 = " + df.format(r2));
        }
    }

}
