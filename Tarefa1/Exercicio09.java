package Tarefa1;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

     
        System.out.print("Digite o lado do quadrado: ");
       
        double lado = scanner.nextInt();

        double area = lado * lado;

        
        System.out.println("A área do quadrado com lado " + lado + " é: " + area);

        scanner.close();
		
	}
}