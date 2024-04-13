package Tarefa1;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	     
	        System.out.print("Digite a base do triângulo: ");
	      
	        float base = scanner.nextFloat();

	     
	        System.out.print("Digite a altura do triângulo: ");
	      
	        float altura = scanner.nextFloat();

	        
	        float area = (base * altura) / 2;

	       
	        System.out.println("A área do triângulo com base " + base + " e altura " + altura + " é: " + area);

	        
	        scanner.close();
	}
	
}