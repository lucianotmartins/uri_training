package ex1020;

import java.util.Scanner;

/*
 Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada

O arquivo de entrada contém um valor inteiro.

Saída

Imprima a saída conforme exemplo fornecido.

https://www.urionlinejudge.com.br/judge/pt/problems/view/1020
 */

public class Ex1020 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int ano = N / 365;
        int mes = (N % 365) / 30;
        int dia = (N % 365) % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
    }

}
