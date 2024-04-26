package Tarefa7;

public class Exercício15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		try {
		while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

			System.out.println("Informe o número do código do empregado:");
			int codigoEmpregado = sc.nextInt();

			System.out.println("Informe o ano de seu nascimento:");
			int anoNascimento = sc.nextInt();

			System.out.println("Informe o ano que ingressou na empresa:");
			int anoIngressoEmpresa = sc.nextInt();

			int idade = 2024 - anoNascimento;
			int tempoDeTrabalho = 2024 - anoIngressoEmpresa;

			if (idade >= 65 || tempoDeTrabalho >= 30 || (idade >= 60 && tempoDeTrabalho >= 25)) {
				System.out.println("O funcionário de código: " + codigoEmpregado);
				System.out.println("Idade: " + idade);
				System.out.println("Tempo de trabalho: " + tempoDeTrabalho);
				System.out.println("Requerer aposentadoria");
			} else {
				System.out.println("O funcionário de código: " + codigoEmpregado);
				System.out.println("Idade: " + idade);
				System.out.println("Tempo de trabalho: " + tempoDeTrabalho);
				System.out.println("Não requerer aposentadoria");
			}

			System.out.println("Deseja consultar mais um funcionário?");
			resposta = sc.next();

		}
		
		} catch (Exception e) {
			System.out.println("Este programa foi elaborado para rodar numeros, vamos mais uma vez.");
		}

		sc.close();

	}

	
}
