package Tarefa8;

public class Exercício9 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float somaDosValores = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("informe o " + i + "º número: ");
			float numero = sc.nextFloat();

			somaDosValores += numero;
		}

		float media = somaDosValores / 10;

		System.out.println("O total da soma dos valores informados é de: " + somaDosValores);
		System.out.println("A média aritmética dos valores informados é de: " + media);

		sc.close();

	}

}
