/// 1) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias.///
 ///  Considerar ano com 365 dias e mês com 30 dias. ///

package Tarefa3;

import java.util.Scanner;

public class Excercicio1. {

	public static void main (String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a idade em anos completos atual:");
		int idadeAnos = sc.nextInt();
		
		System.out.println("Digite sua idade em meses, do seu ultimo aniversário:");
		int idadeMeses = sc.nextInt();
		
		System.out.println("Digite a quantidade de dias do seu ultimo mêsversário:");
		int idadeDias = sc.nextInt();
		
		int quantidadeDiasVividos = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;
		
		System.out.println("Seus dias é de: "+ quantidadeDiasVividos + " dias");
		
		sc.close();
		} catch (Exception e) {
			System.out.println("mostre apenas números inteiros... rode novamente o programa do inicio.");
		}
	}
}