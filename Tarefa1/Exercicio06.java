package Tarefa1;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
	       
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite o primeiro número: ");
       
        float primeiroNumero = scanner.nextFloat();

    
        System.out.print("Digite o segundo número: ");
    
        float segundoNumero = scanner.nextFloat();


        float soma = primeiroNumero / segundoNumero;

        
        System.out.println("A Divisão de " + primeiroNumero + " e " + segundoNumero + " é: " + soma);

        
        scanner.close();
    }
}