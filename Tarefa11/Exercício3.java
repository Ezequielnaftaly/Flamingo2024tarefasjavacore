package Tarefa11;

public class Exercício3 {

	
public static void main(String[] args) {
		
		int soma = 0;
		
		int vetor[] = {50,-5,10,23,-15,-9};
		
		for (int contador = 0; contador < vetor.length; contador++) {
			
			soma += vetor[contador];
		}
		
		 int media = soma / 6;
		
		System.out.println("A média dos elementos do vetor é: " + media);
	}
}
