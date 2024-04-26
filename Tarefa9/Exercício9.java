package Tarefa9;

public class Exercício9 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maiorNumero = Integer.MIN_VALUE;
		int menorNumero = Integer.MAX_VALUE;

		System.out.println("Digite um número inteiro positivo (ou um número negativo para sair):");
	

		while (true) {
			int numeroInteiro = sc.nextInt();

			if (numeroInteiro < 0) {
				break;

			}

			if (numeroInteiro > maiorNumero) {
				maiorNumero = numeroInteiro;
			}

			if (numeroInteiro < menorNumero) {
				menorNumero = numeroInteiro;
			}
		}
		
			System.out.println("Maior valor informado: " + maiorNumero);
			System.out.println("Menor valor informado: " + menorNumero);
			
			sc.close();
		}

	
}
