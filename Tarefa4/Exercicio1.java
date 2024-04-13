///
/// 1) Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na utilização do conceito da propriedade distributiva. 
/// Ou seja, se forem lidas as variáveis A, B, C, e D, devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim C com D.
///  Perceba que será necessário efetuar seis operações de adição e seis operações de multiplicação e apresentar doze resultados de saída.
///
package Tarefa4;

import java.util.Scanner;

public class Exercicio1. {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro para variável \"A\": ");
		int variavelA = sc.nextInt();
		
		System.out.println("Insira um número inteiro para variável \"B\": ");
		int variavelB = sc.nextInt();
		
		System.out.println("Insira um número inteiro para variável \"C\": ");
		int variavelC = sc.nextInt();
		
		System.out.println("Insira um número inteiro para variável \"D\": ");
		int variavelD = sc.nextInt();
		
			//SOMA
			int somaAB = variavelA + variavelB;
			int somaAC = variavelA + variavelC;
			int somaAD = variavelA + variavelD;
			int somaBC = variavelB + variavelC;
			int somaBD = variavelB + variavelD;
			int somaCD = variavelC + variavelD;
			
			//MULTIPLICAÇÃO
			int multiplicacaoAB = variavelA * variavelB;
			int multiplicacaoAC = variavelA * variavelC;
			int multiplicacaoAD = variavelA * variavelD;
			int multiplicacaoBC = variavelB * variavelC;
			int multiplicacaoBD = variavelB * variavelD;
			int multiplicacaoCD = variavelC * variavelD;
			
		System.out.println("somando as variáveis \"A\" e \"B\" o resultado é: " + somaAB);
		System.out.println("somando as variáveis \"A\" e \"C\" o resultado é: " + somaAC);
		System.out.println("somando as variáveis \"A\" e \"D\" o resultado é: " + somaAD);
		System.out.println("somando as variáveis \"B\" e \"C\" o resultado é: " + somaBC);
		System.out.println("somando as variáveis \"B\" e \"D\" o resultado é: " + somaBD);
		System.out.println("somando as variáveis \"C\" e \"D\" o resultado é: " + somaCD);
		
		System.out.println();
		
		System.out.println("multiplique as variáveis \"A\" e \"B\" o resultado é: " + multiplicacaoAB);
		System.out.println("multiplique as variáveis \"A\" e \"C\" o resultado é: " + multiplicacaoAC);
		System.out.println("multiplique as variáveis \"A\" e \"D\" o resultado é: " + multiplicacaoAD);
		System.out.println("multiplique as variáveis \"B\" e \"C\" o resultado é: " + multiplicacaoBC);
		System.out.println("multiplique as variáveis \"B\" e \"D\" o resultado é: " + multiplicacaoBD);
		System.out.println("multiplique as variáveis \"C\" e \"D\" o resultado é: " + multiplicacaoCD);
			
			sc.close();

	}

}