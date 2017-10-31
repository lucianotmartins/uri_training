package ex1012;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B. 

Entrada

O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída

O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.

https://www.urionlinejudge.com.br/judge/pt/problems/view/1012
 */
public class Ex1012 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.000");

        double A = ler.nextFloat();
        double B = ler.nextFloat();
        double C = ler.nextFloat();
        double pi = 3.14159;

        double triangulo = (A * C) / 2;
        double circulo = (C * C) * pi;
        double trapezio = ((A * C) + (B * C)) / 2;
        double quadrado = Math.pow(B, 2);
        double retangulo = A * B;

        System.out.println("TRIANGULO: " + df.format(triangulo));
        System.out.println("CIRCULO: " + df.format(circulo));
        System.out.println("TRAPEZIO: " + df.format(trapezio));
        System.out.println("QUADRADO: " + df.format(quadrado));
        System.out.println("RETANGULO: " + df.format(retangulo));
    }

}
