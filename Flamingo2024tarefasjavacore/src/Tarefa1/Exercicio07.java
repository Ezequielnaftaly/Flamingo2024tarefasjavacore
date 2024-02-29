package Tarefa1;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Digite a base do retângulo: ");
	        
	        float base = scanner.nextFloat();

	       
	        System.out.print("Digite a altura do retângulo: ");
	       
	        float altura = scanner.nextFloat();

	      
	        float area = base * altura;

	        
	        System.out.println("A área do retângulo com base " + base + " e altura " + altura + " é: " + area);

	      
	        scanner.close();
	}
	
}