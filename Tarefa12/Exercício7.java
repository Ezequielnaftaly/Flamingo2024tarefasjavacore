package Tarefa12;

public class Exercício7 {

	static boolean calcularAnoBissexto(int ano) {

		if (ano % 4 == 0) {
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

				System.out.println("Digite o ano para saber se ele é bissexto:");
				int anoSolicitado = sc.nextInt();

				if (calcularAnoBissexto(anoSolicitado)) {
					System.out.println("O ano informado " + anoSolicitado + ", é bissexto");
				} else {
					System.out.println("O ano informado " + anoSolicitado + ", não é bissexto");
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
