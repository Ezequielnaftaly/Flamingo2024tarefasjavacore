package Tarefa11;

public class Exercício1 {
	
	public static void main(String[] args) {
        
		int vetorSoma[] = {2,5,9,4,6};
		
		int soma = 0;
		
		for (int contador = 0; contador < vetorSoma.length; contador++) {
			
			soma += vetorSoma[contador];
			
		}
		System.out.println("A soma dos elementos dentro do vetor é de: " + soma);

	}

}
