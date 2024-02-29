package Tarefa1;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	    
	        System.out.print("Digite a diagonal maior do losango: ");
	       
	        float diagonalMaior = scanner.nextFloat();

	      
	        System.out.print("Digite a diagonal menor do losango: ");
	   
	        float diagonalMenor = scanner.nextFloat();

	     
	        float area = (diagonalMaior * diagonalMenor) / 2;

	        
	        System.out.println("A área do losango com diagonal maior " + diagonalMaior +
	                " e diagonal menor " + diagonalMenor + " é: " + area);

	    
	        scanner.close();
	}

}