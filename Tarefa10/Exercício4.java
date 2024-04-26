package Tarefa10;

public class Exercício4 {
	
	public class Atividade04 {

		public static void main(String[] args) {

			int somaDosPares = 0;

			for (int i = 1; i < 500; i++) {

				if (i % 2 == 0) {
					somaDosPares += i;
				}
			}

			System.out.println("A soma dos valores pares na faixa de 1 a 500 é de: " + somaDosPares);

		}

}
