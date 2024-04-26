package Tarefa7;

public class Exercício7 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Informe o primeiro número inteiro:");
				int primeiroNumero = sc.nextInt();

				System.out.println("Informe o segundo número inteiro:");
				int segundoNumero = sc.nextInt();

				if (primeiroNumero == segundoNumero) {
					System.out.println("Os números " + primeiroNumero + " e " + segundoNumero + " são números iguais");
				} else if (primeiroNumero > segundoNumero) {
					System.out.println("O primeiro número é maior");
				} else {
					System.out.println("O segundo número é maior");
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
