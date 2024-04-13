///// 7) Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final o quadrado da soma dos três valores lidos.
//////

package Tarefa4;

public class Exercicio7 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número para uma variável \"A\" para descobrir o valor do quadrado da soma: ");
		int variavelA = sc.nextInt();
		
		System.out.println("Insira um número para uma variável \"B\": ");
		int variavelB = sc.nextInt();
		
		System.out.println("Insira um número para uma variável \"C\": ");
		int variavelC = sc.nextInt();
		
		int somaDasVariaveisABC = variavelA + variavelB + variavelC;
		
		int quadradoDaSoma = somaDasVariaveisABC * somaDasVariaveisABC;
		
		System.out.println("somando os três valores do quadrado temos: " + quadradoDaSoma);
		
			sc.close();
		
	}

}
