// 6) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius.//
 //  A fórmula deconversão é C=(F-32)*(5/9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. //

package Tarefa3;

import java.util.Scanner;

public class Exercicio6. {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em graus Fahreinheit: ");
		
		float grausFahreinheit = sc.nextFloat();
		float grausCelsius = ((grausFahreinheit - 32) * 5 / 9);
		
		System.out.println("O resultado dos graus Fahreinheit convertidos em Celsius é: " + grausCelsius);
		
			sc.close();
		
	}
}