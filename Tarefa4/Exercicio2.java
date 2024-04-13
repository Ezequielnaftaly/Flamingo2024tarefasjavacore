///
// 2) Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA.
 //


package Tarefa4;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Calculemos: Volume de caixa");
		System.out.print("Insire o comprimento da caixa: ");
		float Comprimento = scanner.nextFloat();

		System.out.print("Insira a largura da caixa: ");
		float Largura = scanner.nextFloat();

		System.out.print("Insira a altura da caixa: ");
		float Altura = scanner.nextFloat();
		float Volume = comprimento * largura * altura;

		System.out.printf("O volume da caixa retangular é: " + volume);

		scanner.close();
			}
}
