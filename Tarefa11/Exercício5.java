package Tarefa11;

public class Exercício5 {

public static void main(String[] args) {
	
		
		int vetorInteiros[] = {1,2,4,6,8};
		
		int acumuladora = 0;
		
		for (int i = 0; i < vetorInteiros.length; i++) {
			
			int calculoPares = vetorInteiros[i] % 2;
			
			if (calculoPares == 0) {
				acumuladora = acumuladora + 1;
			}
			
		}
		
		System.out.println("A quantidade de números pares dentro do vetor é: " + acumuladora);
	}
}
