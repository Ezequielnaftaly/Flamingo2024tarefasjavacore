package Tarefa9;

public class Exercício8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float valorTotalAcumulado = 0;

		String resposta = "sim";

		while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s") || resposta.equals("ss")) {

			System.out.println("Informe o nome do cômodo que deseja calcular a área:");
			String nomeComodo = sc.next();

			System.out.println("Informe a largura do cômodo que deseja calcular a área:");
			float larguraComodo = sc.nextFloat();

			System.out.println("Informe o comprimento do cômodo que deseja calcular a área:");
			float comprimentoComodo = sc.nextFloat();

			float calculoDaArea = larguraComodo * comprimentoComodo;

			System.out.println("A área total do cômodo " + nomeComodo + " é de: " + calculoDaArea + " mt²");

			valorTotalAcumulado += calculoDaArea;

			System.out.println("Continuar calculando novos comodos?");
			resposta = sc.next();

			if (resposta.equals("Não") || resposta.equals("não") || resposta.equals("n") || resposta.equals("nn")) {
				System.out.println("O valor total acumulado da área residencial é de: " + valorTotalAcumulado + " mt²");
				System.exit(0);
			}

		}

		sc.close();
	}
}
