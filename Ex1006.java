package ex1006;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada

O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída

Imprima a variável MEDIA conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
https://www.urionlinejudge.com.br/judge/pt/problems/view/1006 
*/
public class Ex1006 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0");
        double A = sc1.nextDouble();
        double B = sc1.nextDouble();
        double C = sc1.nextDouble();

        if (A >= 0 && A <= 10 && B >= 0 && B <= 10) {
            double notaA = (2.0 * A);
            double notaB = (3.0 * B);
            double notaC = (5.0 * C);
            double MEDIA = (notaA + notaB + notaC) / 10.0;
            System.out.print("MEDIA = " + df.format(MEDIA));
            System.out.println("");

        }

    }

}
