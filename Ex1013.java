/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

MaiorAB = (a+b+abs(a-b)) / 2

Entrada

O arquivo de entrada contém três valores inteiros.

Saída

Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
https://www.urionlinejudge.com.br/judge/pt/problems/view/1013 
*/
package ex1013;

import java.util.Scanner;

public class Ex1013 {
    
    

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int A = ler.nextInt();
        int B = ler.nextInt();
        int C = ler.nextInt();

        int maiorAB = ((A + B + Math.abs(A - B)) / 2);
        int maiorAC = ((A + C + Math.abs(A - C)) / 2);
        int maiorBC = ((B + C + Math.abs(B - C)) / 2);

        if (maiorAB > maiorAC) {
            System.out.println(+maiorAB + " eh o maior"); // MEIO
        } else if (maiorAC > maiorAB) {
            System.out.println(+maiorAC + " eh o maior"); // FIM
        } else if (maiorAB > maiorBC) {
            System.out.println(+maiorAB + " eh o maior"); // INICIO
        }
    }
    
}
