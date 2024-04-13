/// 9) Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO). ///

package Tarefa3;

import java.util.Scanner;

public class Exercicio9. {
	
	public static void main(String[] args) {
	try {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Insira o valor da prestação:");
	float valor = sc.nextFloat();
	
	System.out.println("Insira  a taxa aplicada na prestação:");
	float taxa = sc.nextFloat();
	
	System.out.println("Insira  o tempo e meses na  prestação:");
	int tempo = sc.nextInt();
	
	float prestacao = valor + (valor * taxa / 100) * tempo;
	
	System.out.println("O valor final da prestação de " + valor + "R$, mais a taxa de "  + taxa + "% ,pelo tempo de " + tempo + " meses, é:" + prestacao + "R$");
			
	sc.close();
	
	} catch (Exception e) {
		System.out.println("mostre apenas números inteiros... rode novamente o programa do inicio.");
	}
	
	}
}