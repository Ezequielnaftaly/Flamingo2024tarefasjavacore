package Tarefa9;

public class Exercício6 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int totalSomatorio = 0;
		int quantidadeDeNumerosFornecidos = 0;

		System.out.println("Digite um número inteiro positivo (ou um número negativo para sair):");

		int numeroInteiro = sc.nextInt();

		while (numeroInteiro >= 0) {
			totalSomatorio += numeroInteiro;
			quantidadeDeNumerosFornecidos++;

			System.out.println("Digite um número positivo (ou um número negativo para sair):");
			numeroInteiro = sc.nextInt();
		}

		if (quantidadeDeNumerosFornecidos > 0) {
			double media = (double) totalSomatorio / quantidadeDeNumerosFornecidos;
			System.out.println("Total do somatório: " + totalSomatorio);
			System.out.print("Média aritmética: ");
			System.out.println(new DecimalFormat(".#").format(media));
			System.out.println("Total de valores lidos: " + quantidadeDeNumerosFornecidos);
		} else {
			System.out.println("Nenhum número foi fornecido.");
		}

		sc.close();
	}


}
