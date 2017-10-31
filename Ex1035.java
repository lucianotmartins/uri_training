package ex1035;

import java.util.Scanner;

/*
 Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

Entrada

Quatro números inteiros A, B, C e D.

Saída

Mostre a respectiva mensagem após a validação dos valores.
https://www.urionlinejudge.com.br/judge/pt/problems/view/1035 
*/
public class Ex1035 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        if ((B > C) && (D > A)) {
            if ((C + D) > (A + B)) {
                if ((C >= 0) && (D >= 0) && (A % 2 == 0)) {
                    System.out.println("Valores aceitos");
                } else {
                    System.out.println("Valores nao aceitos");
                }
            } else {
                System.out.println("Valores nao aceitos");
            }
        } else {
            System.out.println("Valores nao aceitos");
        }
    }

}
