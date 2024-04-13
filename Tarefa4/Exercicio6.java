////
// 6) Elaborar um programa que efetue a leitura de três valores (A, B e C)
/// e apresente como resultado final à soma dos quadrados dos três valores lidos.
///

package Tarefa4;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número para uma variável \"A\" para descobrir o valor da soma dos quadrados: ");
		int variavelA = sc.nextInt();
		
		System.out.println("insira um número para uma variável \"B\": ");
		int variavelB = sc.nextInt();
		
		System.out.println("Inira um número para uma variável \"C\": ");
		int variavelC = sc.nextInt();
		
		int quadradoVariavelA = variavelA * variavelA;
		int quadradoVariavelB = variavelB * variavelB;
		int quadradoVariavelC = variavelC * variavelC;
		
		int somaDosQuadrados = quadradoVariavelA + quadradoVariavelB + quadradoVariavelC;
		
		System.out.println("somando os três valores do quadrado temos:" + somaDosQuadrados);
		
			sc.close();
	
}
