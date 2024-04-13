/// 2) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos.///
 /// Calcular e escrever o percentual que cada um representa em relação ao total de eleitores. ///

package Tarefa3;

import java.util.Scanner;

public class Exercicio2. {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Total de eleitores do município:");
		int totalEleitores = sc.nextInt();
		
		System.out.println("Total de votos brancos:");
		int votosBrancos = sc.nextInt();
		
		System.out.println("Total de votos nulos:");
		int votosNulos = sc.nextInt();
		
		System.out.println("Total de votos válídos:");
		int votosValidos = sc.nextInt();
		
		int percentualBrancos = totalEleitores * votosBrancos / 100;
		int percentualNulos = totalEleitores * votosNulos / 100;
		int percentualValidos = totalEleitores * votosValidos / 100;
		
		System.out.println("A porcentagem de votos brancos. " + totalEleitores + " eleitores, é: "+ percentualBrancos + "%");
		System.out.println("A porcentagem de votos nulos. " + totalEleitores + " eleitores, é: "+ percentualNulos + "%");
		System.out.println("A porcentagem de votos válidos." + totalEleitores + " eleitores, é: "+ percentualValidos + "%");
		
		sc.close();
		} catch (Exception e) {
			System.out.println("mostre apenas números inteiros... rode novamente o programa do inicio.");
		}
	}
}