package Tarefa7;

public class Exercício12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
			while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

				int codigo = 1234;
				int senha = 9999;

				System.out.println("Digite o código de usuário:");
				int codigoUsuario = sc.nextInt();

				if (codigoUsuario != codigo) {
					System.out.println("Usuário inválido!");
				} else {
					System.out.println("Digite a senha:");
					int senhaUsuario = sc.nextInt();

					if (senhaUsuario != senha) {
						System.out.println("Senha incorreta");
					} else {
						System.out.println("Acesso permitido");
					}
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
