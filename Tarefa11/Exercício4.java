package Tarefa11;

public class Exercício4 {
	
public static void main(String[] args) {
		
		String vetorInvertido[] = {"invertido", "vetor","um", "é", "Este"};
		
		System.out.println("Este é o vetor original: ");
		
		for (String vetorOriginal: vetorInvertido) {
			System.out.println(vetorOriginal);
		}
		
		System.out.println( "\n " + "Este é o vetor invertido: \n");
		
		for (int contador = vetorInvertido.length -1;contador >= 0 ;contador--) {

			System.out.println(vetorInvertido[contador]);
		}
		

	}

}
