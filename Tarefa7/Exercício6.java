package Tarefa7;

public class Exercício6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

			System.out.println("Informe o nome do primeiro time:");
			String primeiroTime = sc.next();

			System.out.println("Informe o número de gols marcados na partida do time " + primeiroTime + " :");
			int numeroDeGolsPrimeiroTime = sc.nextInt();

			System.out.println("Informe o nome do segundo time:");
			String segundoTime = sc.next();

			System.out.println("Informe o número de gols marcados na partida do time " + segundoTime + " :");
			int numeroDeGolsSegundoTime = sc.nextInt();

			if (numeroDeGolsPrimeiroTime > numeroDeGolsSegundoTime) {
				System.out.println("O time " + primeiroTime + " é o vencedor da partida!");
			} else if (numeroDeGolsSegundoTime > numeroDeGolsPrimeiroTime) {
				System.out.println("O time " + segundoTime + " é o vencedor da partida!");
			} else {
				System.out.println("EMPATE");
			}

			System.out.println("Deseja reiniciar o programa?");
			resposta = sc.next();
		}

		sc.close();

	}

}
