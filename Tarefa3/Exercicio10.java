/* 10) Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de forma que a variável A 
 * passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A.
 *  Apresentar os valores trocados. */ 

package Tarefa3;

import java.util.Scanner;

public class Exercicio10. {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor de A: ");
	    String valorA = sc.nextLine();

	    System.out.println("Insira o valor de B: ");
	    String valorB = sc.nextLine();

	    
	    String tempA = valorA;
	    valorA = valorB;
	    valorB = tempA;

	    System.out.println("Valor de A depois de trocado: " + valorA);
	    System.out.println("Valor de B depois de trocado: " + valorB);
		
		sc.close();
	}
