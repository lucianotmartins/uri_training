package ex1037;

import java.util.Scanner;

/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

Entrada

O arquivo de entrada contém um número com ponto flutuante qualquer.

Saída

A saída deve ser uma mensagem conforme exemplo abaixo.
https://www.urionlinejudge.com.br/judge/pt/problems/view/1037 
*/

public class Ex1037 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A = input.nextFloat();

        if ((A >= 0) & (A <= 25)) {
            System.out.println("Intervalo [0,25]");
        } else if ((A > 25) & (A <= 50)) {
            System.out.println("Intervalo (25,50]");
        } else if ((A > 50) & (A <= 75)) {
            System.out.println("Intervalo (50,75]");
        } else if ((A > 75) & (A <= 100)) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }

}
