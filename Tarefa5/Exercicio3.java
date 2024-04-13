///3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12.
///// Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.


package Tarefa5;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de maçãs compradas: ");
		float macas = sc.nextFloat();
		
		float precoMacas;
		
		if (macas < 12) {
			precoMacas = 1.30f;
			System.out.println("O custo  total da compra é: R$ " + macas * precoMacas);
		} else {
			precoMacas = 1.00f;
			System.out.println("O custo total da compra é: R$ " + macas * precoMacas);
		}
		
			sc.close();
}
