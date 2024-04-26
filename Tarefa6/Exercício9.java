package Tarefa6;

public class Exercício9 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String resposta = "sim";
		
		try {
			while (resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("s") || resposta.equals("ss")) {

		
		System.out.println("Digite um número inteiro, para saber se é par ou impar:");
		int numero = sc.nextInt();
		
		 int calculoPar = numero % 2;
		
		if (calculoPar == 0) {
			System.out.println("O número " + numero + ", é par.");
		} else {
			System.out.println("O número " + numero + ", é impar.");
		}
		
		System.out.println("Deseja reiniciar o programa?");
		resposta = sc.next();
		
			}
			
		} catch (Exception e) {
			System.out.println("A proposta do programa é somente com números inteiros... Rode o programa novamente.");
		}
				
		sc.close();

	}

}
