package ex1040;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ". Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno.

Entrada

A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.

Saída

Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens devem ser impressas conforme a descrição do problema. Não esqueça de imprimir o enter após o final de cada linha, caso contrário obterá "Presentation Error".

https://www.urionlinejudge.com.br/judge/pt/problems/view/1040
*/
public class Ex1040 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0");

        float N1 = input.nextFloat();
        float N2 = input.nextFloat();
        float N3 = input.nextFloat();
        float N4 = input.nextFloat();

        float peso1 = N1 * 2;
        float peso2 = N2 * 3;
        float peso3 = N3 * 4;
        float peso4 = N4 * 1;

        float media = (peso1 + peso2 + peso3 + peso4) / 10;

        if (media >= 7.0) {
            System.out.println("Media: " + df.format(media));
            System.out.print("Aluno aprovado.");
            System.out.println("");
        } else if (media < 5.0) {
            System.out.println("Media: " + df.format(media));
            System.out.print("Aluno reprovado.");
            System.out.println("");
        } else if (media >= 5.0 || media <= 6.9) {
            float N5 = input.nextFloat();
            System.out.println("Media: " + df.format(media));
            System.out.print("Aluno em exame.");
            System.out.println("");
            System.out.println("Nota do exame: " + N5);
            float media2 = (N5 + media) / 2;
            if (media2 >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.print("Media final: " + df.format(media2));
                System.out.println("");
            } else {
                System.out.println("Aluno reprovado.");
                System.out.print("Media final: " + df.format(media2));
                System.out.println("");

            }
        }
    }

}
