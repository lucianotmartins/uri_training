package ex1014;

import java.text.DecimalFormat;
import java.util.Scanner;


/*
 Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

Entrada

O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

Saída

Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".
https://www.urionlinejudge.com.br/judge/pt/problems/view/1014 
*/
public class Ex1014 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.000");

        int X = ler.nextInt();
        float Y = ler.nextFloat();

        float consumo = X / Y;

        System.out.println(df.format(consumo) + " km/l");
    }

}
