package Tarefa13;

public class Exercício1 {
	

	static boolean parOuImpar(int numInteiro) {

		if (numInteiro % 2 == 0) {
			return true;
		} else {

			return false;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite um número para saber se é par ou impar: ");
				int numeroSolicitado = sc.nextInt();

				if (parOuImpar(numeroSolicitado)) {
					System.out.println(numeroSolicitado + " é um número par.");
				} else {
					System.out.println(numeroSolicitado + " é um número ímpar.");
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
