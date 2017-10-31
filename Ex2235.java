package ex2235;

import java.util.Scanner;

/*
Imagine que você tenha uma máquina do tempo que pode ser usada no máximo três vezes, e a cada uso da máquina você pode escolher voltar para o passado ou ir para o futuro. A máquina possui três créditos fixos; cada crédito representa uma certa quantidade de anos, e pode ser usado para ir essa quantidade de anos para o passado ou para o futuro. Você pode fazer uma, duas ou três viagens, e cada um desses três créditos pode ser usado uma vez apenas. Por exemplo, se os créditos forem 5, 12 e 9, você poderia decidir fazer duas viagens: ir 5 anos para o futuro e, depois, voltar 9 anos para o passado. Dessa forma, você terminaria quatro anos no passado, em 2012. Também poderia fazer três viagens, todas indo para o futuro, usando os créditos em qualquer ordem, terminando em 2042.

Neste problema, dados os valores dos três créditos da máquina, seu programa deve dizer se é ou não possível viajar no tempo e voltar para o presente, fazendo pelo menos uma viagem e, no máximo, três viagens; sempre usando cada um dos três créditos no máximo uma vez.

Entrada

A entrada consiste de uma linha contendo os valores dos três créditos A, B e C (1 ≤ A, B, C ≤ 1000).

Saída

Seu programa deve imprimir uma linha contendo o caracter “S” se é poss ível viajar e voltar para o presente, ou “N” caso contrário.
 
https://www.urionlinejudge.com.br/judge/pt/problems/view/2335

*/

public class Ex2235 {

    public static void main(String[] args) {
        String possivel = "";
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        int c = sc1.nextInt();

        if ((a <= 1 || a <= 1000) && (b <= 1 || b <= 1000) && (c <= 1 || c <= 1000)) {

            if (a + b == c || b + c == a || a + c == b) {
                possivel = "S";
            } else if (a - b == c || b - c == a || a - c == b) {
                possivel = "S";
            } else if (a == b || b == c || a == c) {
                possivel = "S";
            } else {
                possivel = "N";
            }
        }
        System.out.println(possivel);
    }

}
