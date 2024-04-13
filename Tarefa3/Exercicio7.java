/// 7) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = π*Raio2*Altura /// 

package Tarefa3;

import java.util.Scanner;

public class Exercicio7. {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio da lata de óleo para ser feito o cálculo de seu volume: ");
		double raioDaLata = sc.nextDouble();

        System.out.println("Digite a altura da lata de óleo para ser feito o cálculo de seu volume: ");
		double alturaDaLata = sc.nextDouble();

            double calculoVolume = Math.PI * (raioDaLata * raioDaLata) * alturaDaLata;

        System.out.println("O volume da lata de óleo é de: " + calculoVolume);

                sc.close();


    }

}