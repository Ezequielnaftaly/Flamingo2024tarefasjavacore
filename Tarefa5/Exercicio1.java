///1) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!///


package Tarefa5;

public class Exercicio1 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o Valor : ");
		int valor1 = sc.nextInt();

		if (valor1 > 10) {
			System.out.println("tem que ser  maior que 10");
		} else {
			System.out.println("tem que ser menor que 10");
		}

		sc.close();
	}
}
	

