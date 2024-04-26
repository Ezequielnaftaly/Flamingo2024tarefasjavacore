package Tarefa7;

public class Exercício5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite o valor do lado A, para saber se formam um triângulo:");
				int ladoA = sc.nextInt();

				System.out.println("Digite o valor do lado B, para saber se formam um triângulo:");
				int ladoB = sc.nextInt();

				System.out.println("Digite o valor do lado C, para saber se formam um triângulo:");
				int ladoC = sc.nextInt();

				if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
					System.out.println("Os valores digitados formam um triângulo.");
				} else {
					System.out.println("Os valores digitados não formam um triângulo.");
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
