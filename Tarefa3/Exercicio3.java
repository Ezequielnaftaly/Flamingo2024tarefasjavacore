/// 3) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.///
 /// Calcular e escrever o valor do novo salário. ///

package Tarefa3;

import java.util.Scanner;

public class Exercicio3. {
	
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insira o  salário atual do funcionário:");
		float salarioAtual = sc.nextFloat();
		
		System.out.println("Insira o percentual do reajuste:");
		float percentual = sc.nextFloat();
		
		float salarioNovo = salarioAtual + (salarioAtual * (percentual / 100));
		
		System.out.println("O salário atual do funcionário é : " + salarioAtual + "R$" + " para: " + salarioNovo + "R$");
		
		sc.close();
		} catch (Exception e) {
			System.out.println("mostre apenas números inteiros... rode novamente o programa do inicio.");
		}
	}

}