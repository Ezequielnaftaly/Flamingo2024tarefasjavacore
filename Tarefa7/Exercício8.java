package Tarefa7;

public class Exercício8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro para ser o valor de x:");
		int x = sc.nextInt();
		
		System.out.println("Informe um número inteiro para ser o valor de y:");
		int y = sc.nextInt();
		
		int z = (x * y) + 5;
		
		if (z <= 0) {
			System.out.println("A");
		} else if (z <= 100) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		
		sc.close();
	}
	
}
