package Tarefa10;

public class Exercício2 {

	public class Atividade02 {

		public static void main(String[] args) {
			
			for (int i = 1; i <= 10; i++) {
				System.out.println("Tabuada do " + i + " : ");
				
				for (int j = 1; j <= 10; j++) {
					System.out.println(i + " X " + j + " = " + (j*i));
				}
				
				System.out.println("----||------||------||----");
			}

		}

}
