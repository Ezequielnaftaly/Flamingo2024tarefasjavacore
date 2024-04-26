	package Tarefa7;

public class Exercício14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

			System.out.println("Informe o valor da 1º nota do aluno(a):");
			float primeiraNota = sc.nextInt();

			System.out.println("Informe o valor da 2º nota do aluno(a):");
			float segundaNota = sc.nextInt();

			System.out.println("Informe o valor da 3º nota do aluno(a):");
			float terceiraNota = sc.nextInt();

			float mediaExercicios = primeiraNota + segundaNota + terceiraNota / 3;

			float mediaDeAproveitamento = (primeiraNota + segundaNota * 2 + terceiraNota * 3 + mediaExercicios) / 7;

			if (mediaDeAproveitamento >= 9) {
				System.out.println("A média de aproveitamento do aluno foi de: ");
				System.out.println(new DecimalFormat(".#").format(mediaDeAproveitamento));
				System.out.println("Conceito A");

			} else if (mediaDeAproveitamento >= 7.5 && mediaDeAproveitamento < 9) {
				System.out.println("A média de aproveitamento do aluno foi de: ");
				System.out.println(new DecimalFormat(".#").format(mediaDeAproveitamento));
				System.out.println("Conceito B");

			} else if (mediaDeAproveitamento >= 6 && mediaDeAproveitamento <= 7.5) {
				System.out.println("A média de aproveitamento do aluno foi de: ");
				System.out.println(new DecimalFormat(".#").format(mediaDeAproveitamento));
				System.out.println("Conceito C");
			} else {
				System.out.println("A média de aproveitamento do aluno foi de: ");
				System.out.println(new DecimalFormat(".#").format(mediaDeAproveitamento));
				System.out.println("Conceito D");
			}

			System.out.println("Deseja consultar mais uma média?");
			resposta = sc.next();

		}

		sc.close();

	}
	
}
