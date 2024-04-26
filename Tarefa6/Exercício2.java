****** ****
******* 2. Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um valor positivo, ou seja, 
******** o programa deverá apresentar o módulo de um número fornecido. 
********* * Lembre-se de verificar se o número fornecido é menor que zero; sendo, multiplique-o por -1.
********

package Tarefa6;




public class Exercício2 {

	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor inteiro positivo ou negativo:");
		int numero = sc.nextInt();
		
		int resultado1 = numero * -1;
		
		if (numero < 0) {
			System.out.println("Número negativo! " + resultado1);
		} else {
			System.out.println("Número positivo! " + numero);
		}
	}
	
	
	
	
}
