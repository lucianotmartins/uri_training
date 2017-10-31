package ex1021;

import java.util.Scanner;

/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada

O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída

Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
https://www.urionlinejudge.com.br/judge/pt/problems/view/1021 
*/
public class Ex1021 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double N = input.nextDouble();

        //NOTAS
        int n100 = (int) N / 100;
        N %= 100;
        int n50 = (int) N / 50;
        N %= 50;
        int n20 = (int) N / 20;
        N %= 20;
        int n10 = (int) N / 10;
        N %= 10;
        int n5 = (int) N / 5;
        N %= 5;
        int n2 = (int) N / 2;
        N %= 2;
        int n1 = (int) N / 1;
        N %= 1;
        //MOEDAS
        double centavos = N * 100;
        centavos %= 100;
        int m050 = (int) centavos / 50;
        centavos %= 50;
        int m025 = (int) centavos / 25;
        centavos %= 25;
        int m010 = (int) centavos / 10;
        centavos %= 10;
        int m005 = (int) centavos / 5;
        centavos %= 5;
        int m001 = (int) centavos / 1;
        centavos %= 1;

        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de R$ 100.00");
        System.out.println(n50 + " nota(s) de R$ 50.00");
        System.out.println(n20 + " nota(s) de R$ 20.00");
        System.out.println(n10 + " nota(s) de R$ 10.00");
        System.out.println(n5 + " nota(s) de R$ 5.00");
        System.out.println(n2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(n1 + " moeda(s) de R$ 1.00");
        System.out.println(m050 + " moeda(s) de R$ 0.50");
        System.out.println(m025 + " moeda(s) de R$ 0.25");
        System.out.println(m010 + " moeda(s) de R$ 0.10");
        System.out.println(m005 + " moeda(s) de R$ 0.05");
        System.out.println(m001 + " moeda(s) de R$ 0.01");
    }

}
