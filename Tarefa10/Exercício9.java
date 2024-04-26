package Tarefa10;

public class Exercício9 {
	
	public static void main(String[] args) {

		int primeiroTermoFibonacci = 1;
		int segundoTermoFibonacci = 1;

		System.out.print("Série de Fibonacci até o décimo quinto termo: ");

		System.out.print(primeiroTermoFibonacci + " ");
		System.out.print(segundoTermoFibonacci + " ");

		for (int i = 2; i < 15; i++) {
			int termoSeguinte = primeiroTermoFibonacci + segundoTermoFibonacci;

			System.out.print(termoSeguinte + " ");
			primeiroTermoFibonacci = segundoTermoFibonacci;
			segundoTermoFibonacci = termoSeguinte;

		}

	}


}
