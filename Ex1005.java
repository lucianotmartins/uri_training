package ex1005;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada

O arquivo de entrada contém 2 valores com uma casa decimal cada um.

Saída

Calcule e imprima a variável MEDIA conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
https://www.urionlinejudge.com.br/judge/pt/problems/view/1005 
*/
public class Ex1005 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00000");
        double A = sc1.nextDouble();
        double B = sc1.nextDouble();

        if (A >= 0 && A <= 10 && B >= 0 && B <= 10) {
            double notaA = (3.5 * A);
            double notaB = (7.5 * B);
            double MEDIA = (notaA + notaB) / 11.0;
            System.out.print("MEDIA = " + df.format(MEDIA));
            System.out.println("");
        }

    }
}
