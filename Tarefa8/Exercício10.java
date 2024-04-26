package Tarefa8;

public class Exercício10 {
	
public static void main(String[] args) {
		
		int somaDosValores = 0;
		int contadorPares = 0;
		
		for (int contador = 50; contador <= 70; contador++) {
	           somaDosValores += contador;
			
			
			 if (contador % 2 == 0) { 
	                contadorPares++; 
	            }
		}
		
		int media = somaDosValores / contadorPares;
		
		System.out.println("A soma dos valores na faixa de 50 a 70 é de: "+ somaDosValores);
		System.out.println("A média dos valores na faixa de 50 a 70 é de: "+ media);

	}

}
