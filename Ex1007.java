package ex1007;

import java.util.Scanner;

/*
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada

O arquivo de entrada contém 4 valores inteiros.

Saída

Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
https://www.urionlinejudge.com.br/judge/pt/problems/view/1007 
*/
public class Ex1007 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        int A = sc1.nextInt();
        int B = sc1.nextInt();
        int C = sc1.nextInt();
        int D = sc1.nextInt();

        int DIFERENCA = ((A * B) - (C * D));

        System.out.println("DIFERENCA = " + DIFERENCA);
    }

}
