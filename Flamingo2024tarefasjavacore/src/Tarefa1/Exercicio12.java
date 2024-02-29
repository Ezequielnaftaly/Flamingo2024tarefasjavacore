package Tarefa1;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Digite o raio do círculo: ");
	        
	        double raio = scanner.nextDouble();

	       
	        double pi = (double) Math.PI;

	     
	        double area = pi * raio * raio;

	      
	        System.out.println("A área do círculo com raio " + raio + " é: " + area);

	        
	        scanner.close();
	}
	
}