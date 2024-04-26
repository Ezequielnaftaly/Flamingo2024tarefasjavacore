package Tarefa8;

public class Exercício3 {

	public class Atividade03 {

		public static void main(String[] args) {
			
			int somaDosPares = 0;
		
			for (int i = 1; i <= 500; i++) {
				
				if (i % 2 == 0) {
					somaDosPares += i;
				} 
				
			}
			
			System.out.println("A soma dos valores pares de 1 á 500 é de: " + somaDosPares);

		}
	
	
	
}
