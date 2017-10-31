package ex1015;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = √(x2-x1)² + (y2-y1)²

Entrada

O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída

Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
https://www.urionlinejudge.com.br/judge/pt/problems/view/1015 
*/

public class Ex1015 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0000");

        float x1 = ler.nextFloat();
        float y1 = ler.nextFloat();
        float x2 = ler.nextFloat();
        float y2 = ler.nextFloat();

        float resulX = (x2 - x1);
        float resultY = (y2 - y1);

        double distancia = Math.sqrt(Math.pow(resulX, 2) + Math.pow(resultY, 2));

        System.out.println(df.format(distancia));
    }

}
