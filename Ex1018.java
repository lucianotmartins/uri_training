package ex1018;

import java.util.Scanner;

/*
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada

O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída

Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
https://www.urionlinejudge.com.br/judge/pt/problems/view/1018 
*/
public class Ex1018 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int valor = N;

        int n100 = N / 100;
        N %= 100;
        int n50 = N / 50;
        N %= 50;
        int n20 = N / 20;
        N %= 20;
        int n10 = N / 10;
        N %= 10;
        int n5 = N / 5;
        N %= 5;
        int n2 = N / 2;
        N %= 2;
        int n1 = N;

        System.out.println(valor);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
    }

}
