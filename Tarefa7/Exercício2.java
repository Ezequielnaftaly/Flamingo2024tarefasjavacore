package Tarefa7;

public class Exercício2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				System.out.println("Digite  o primeiro número inteiro:");
				int numero1 = sc.nextInt();

				System.out.println("Digite o segundo número inteiro:");
				int numero2 = sc.nextInt();

				System.out.println("Digite o terceiro número inteiro:");
				int numero3 = sc.nextInt();

				int maiorNumero = numero1;

				if (numero2 > maiorNumero) {
					maiorNumero = numero2;
				}

				if (numero3 > maiorNumero) {
					maiorNumero = numero3;
				}

				System.out.println("Informe o maior número entre os números informados é: " + maiorNumero);

				System.out.println("Deseja reiniciar o programa?");
				resposta = sc.next();
			}

		} catch (Exception e) {
			System.out.println("Este programa foi elaborado para rodar numeros, vamos mais uma vez.");
		}

		sc.close();
	}

	
}
