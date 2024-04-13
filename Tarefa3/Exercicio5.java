// 5) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
 //  A fórmula de conversão é F = (9*C + 160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. //

package Tarefa3;

import java.util.Scanner;

public class Exercicio5. {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em celsius para converter em fahrenheit:");
		float celsius = sc.nextFloat();
		
		float fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.println("A temperatura " + celsius + "ºC " + ",convertida para fahrenheit é de: "+ fahrenheit + "ºF");
		
		sc.close();
		
		} catch (Exception e) {
			System.out.println("mostre apenas números inteiros... rode novamente o programa do inicio.");
		}
	}
}