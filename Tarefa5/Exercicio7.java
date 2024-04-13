////7) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.////


package Tarefa5;

public class Exercicio7 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o Primeiro Valor: ");
		int valor1 = sc.nextInt();

		System.out.println("Insira o segundo Valor: ");
		int valor2 = sc.nextInt();

		if (valor1 > valor2) {
			System.out.println("os valores de ordem Crescente são: " + valor2 + (",") + valor1);
		} else {
			System.out.println("os valores de ondem Crescente são: " + valor1 + (",") + valor2);
		}

		sc.close();
	}

	
	
}
