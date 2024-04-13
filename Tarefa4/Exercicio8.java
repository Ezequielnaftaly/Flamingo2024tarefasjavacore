/// * 8) Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (variáveis A, B, C e D).
/// Ao final o programa deve apresentar o resultado do produto (variável P)
///do primeiro com o terceiro valor e o resultado da soma (variável S) do segundo com o quarto valor.


package Tarefa4;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero para uma variável \"A\" para descobrir o produto e a soma: ");
		int variavelA = sc.nextInt();
		
		System.out.println("Insira um numero para uma variável \"B\": ");
		int variavelB = sc.nextInt();
		
		System.out.println("Insira um numero  para uma variável \"C\": ");
		int variavelC = sc.nextInt();
		
		System.out.println("Insira um numero para uma variável \"D\": ");
		int variavelD = sc.nextInt();
		
		int produtoDeAeC = variavelA * variavelC;
		int somaDeBeD = variavelB + variavelD;
		
		System.out.println("teremos o resultado somado do produto de \"A\" e \"C\" é: " + produtoDeAeC + " e a soma de \"B\" e \"C\" é: " + somaDeBeD);
		
			sc.close();

	
}
