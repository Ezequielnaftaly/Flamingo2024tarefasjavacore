package Tarefa1;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	       
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite o primeiro número: ");
       
      int primeiroNumero = scanner.nextInt();

    
        System.out.print("Digite o segundo número: ");
    
        int segundoNumero = scanner.nextInt();


        int soma = primeiroNumero * segundoNumero;

        
        System.out.println("A Multiplicação de " + primeiroNumero + " e " + segundoNumero + " é: " + soma);

        
        scanner.close();
    }
	
}