/////5) Ler o ano atual e o ano de nascimento de uma pessoa. 
//////Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
 ///


package Tarefa5;

public class Exercicio5 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("insira o Ano atual: ");
		int Ano = sc.nextInt();

		System.out.println("Insira o Ano do seu Nascimento: ");
		int Nascimento = sc.nextInt();

		int Idade = Ano - Nascimento;

		if (Idade >= 18) {
			System.out.println("Parabens Você pode votar");
		} else {
			System.out.println("Não fique triste,Você ainda não pode votar");
		}
		System.out.println("Você tem " + Idade + " Anos");
		sc.close();
	}
}
