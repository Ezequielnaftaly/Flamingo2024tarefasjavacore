/// 4) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos///
///  (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,///
 ///   escrever um algoritmo para ler o custo de fábrica de um carro, ///
 /// calcular e escrever o custo final ao consumidor. ///

package Tarefa3;

import java.util.Scanner;

public class Exercicio4. {
	
	public static void main (String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o custo de fábrica do carro ja com os impostos:");
		float custoFabrica = sc.nextFloat();
		
		double percentualDistribuidor = 0.28;
		double impostos = 0.45;
		
		double valorFinal =  custoFabrica + (custoFabrica * percentualDistribuidor) + (custoFabrica * impostos);
		
		System.out.println("O valor custo do carro no final é de: "+ valorFinal + "R$");
		
		
		sc.close();
		} catch (Exception e) {
			System.out.println("mostre apenas números inteiros... rode novamente o programa do inicio.");
		}
	}

}