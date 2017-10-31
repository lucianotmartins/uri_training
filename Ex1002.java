package ex1002;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de Raio ao quadrado e multiplicando por π.

Entrada

A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

Saída

Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

https://www.urionlinejudge.com.br/judge/pt/problems/view/1002
*/
public class Ex1002 {

    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#0.0000");
        double raio = sc1.nextDouble();
        double pi = 3.14159;
        
        
        double area = Math.pow(raio, 2) * pi;
        
        System.out.print("A=" + decimal.format(area));
        System.out.println("");
    }
    
}
