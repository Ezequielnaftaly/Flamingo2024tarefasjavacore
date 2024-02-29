package Tarefa1;


import java.util.Scanner;


public class Exercicio02 {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Digite um número: ");

     
        int numero = sc.nextInt();

       
        int sucessor = numero - 1;

        
        System.out.println("O número sucessor de " + numero + " é: " + sucessor);

        
        sc.close();
    }
	
}