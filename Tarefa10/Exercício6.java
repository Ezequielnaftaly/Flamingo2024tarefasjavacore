package Tarefa10;

public class Exercício6 {
	
	public static void main(String[] args) {

		System.out.print("Numeros divisíveis por 4 na faixa de 1 a 200: ");

		for (int i = 1; i <= 200; i++) {

			if (i % 4 == 0) {
				System.out.print(" " + i);
			}
		}

	}

}
