package ex1019;

import java.util.Scanner;

/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada

O arquivo de entrada contém um valor inteiro N.

Saída

Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
https://www.urionlinejudge.com.br/judge/pt/problems/view/1019 
*/

public class Ex1019 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int horas = N / 3600;  //N divide por 3600 = 1 HORA
        int minutos = (N % 3600) / 60;  // Resto da divisão de N por 1 hora divide por 60 = 1 minuto
        int segundos = (N % 60) % 60; // Resto da divisão de N por 1 minuto. O valor pega o resto por 60 = 1 segundo

        System.out.println(horas + ":" + minutos + ":" + segundos);

    }

}
