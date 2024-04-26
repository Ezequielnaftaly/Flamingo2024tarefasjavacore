package Tarefa13;

public class Exercício2 {

	

	static int quadradoDeUmNumero(int numeroInteiro) {
		return numeroInteiro * numeroInteiro;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite um número inteiro, para saber o valor do quadrado:");
				int numero = sc.nextInt();

				System.out.println("O quadrado do número " + numero + ", é: " + quadradoDeUmNumero(numero));

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();
			}

		} catch (Exception e) {
			System.out.println("Este programa foi elaborado para rodar numeros, vamos mais uma vez.");
		}

		sc.close();

	}

}
