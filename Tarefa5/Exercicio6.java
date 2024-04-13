///6) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.///

package Tarefa5;

public class Exercicio6 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o Primeiro Valor: ");
		int valor1 = sc.nextInt();

		System.out.println("Insira o Segundo Valor: ");
		int valor2 = sc.nextInt();

		if (valor1 > valor2) {
			System.out.println("O maior Valor será : "+valor1);
		}else {
			System.out.println("O maior valor será : "+valor2);
		}
		
		sc.close();
	}
	
}
