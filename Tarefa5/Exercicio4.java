////4) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado 
/// (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.

package Tarefa5;

public class Exercicio4 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("insira a nota da primeira avaliação: ");
		float nota1 = sc.nextFloat();

		System.out.println("insira a nota da segunda avaliação: ");
		float nota2 = sc.nextFloat();

		float Media = (nota1 + nota2) / 2;

		if (Media >= 6) {
			System.out.println("Aluno foi  aprovado, com a media: " + Media);
		} else {
			System.out.println("Aluno infelizmente foi reprovado, com a media: " + Media);
		}

		sc.close();
	}
	
}
