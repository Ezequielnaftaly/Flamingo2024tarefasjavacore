package Tarefa12;

public class Exercício9 {
	static boolean verificarSeFormaUmTriangulo(int ladoA, int ladoB, int ladoC) {
		if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
			return false;
		}

		if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
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

				System.out.println("Digite um número inteiro, para formar um lado de um triângulo:");
				int lado1 = sc.nextInt();

				System.out.println("Digite um número inteiro, para formar um lado de um triângulo:");
				int lado2 = sc.nextInt();

				System.out.println("Digite um número inteiro, para formar um lado de um triângulo:");
				int lado3 = sc.nextInt();

				if (verificarSeFormaUmTriangulo(lado1, lado2, lado3)) {
					System.out.println("Os comprimentos informados podem formar um triângulo.");
				} else {
					System.out.println("Os comprimentos informados NÃO podem formar um triângulo.");
				}

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();
			}

		} catch (Exception e) {
			System.out
					.println("Este programa foi elaborado para rodar numeros, vamos mais uma vez.");
		}

		sc.close();

	}

}
