package Tarefa10;

public class Exercício7 {
	
	public static void main(String[] args) {

		int base = 3;
		int resultado = 0;

		for (int i = 0; i <= 15; i++) {

			if (i == 0) {
				resultado = 1;
				System.out.println("O resultado da potência de base " + base + " variando do expoente " + i
						+ " é igual a : " + resultado);
			} else if (i == 1) {
				resultado = base;
				System.out.println("O resultado da potência de base " + base + " variando do expoente " + i
						+ " é igual a : " + resultado);
			} else {
				resultado *= base;
				System.out.println("O resultado da potência de base " + base + " variando do expoente " + i
						+ " é igual a : " + resultado);
			}
		}

	}

}
