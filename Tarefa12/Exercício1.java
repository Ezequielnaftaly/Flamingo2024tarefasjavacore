package Tarefa12;

public class Exercício1 {
	
	static boolean verificarNumeroPrimo(int numeroInteiro) {

		if (numeroInteiro <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(numeroInteiro); i++) {
			if (numeroInteiro % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite um número para saber se é primo:");
				int numeroSolicitado = sc.nextInt();

				if (verificarNumeroPrimo(numeroSolicitado)) {
					System.out.println("O número " + numeroSolicitado + ", é primo");
				} else {
					System.out.println("O número " + numeroSolicitado + ", não é primo");
				}

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();

			}

		} catch (Exception e) {
			System.out.println("Este programa foi elaborado para rodar numeros, vamos mais uma vez.");
		}

		sc.close();

	}


}
