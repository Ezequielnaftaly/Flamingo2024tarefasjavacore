***
 * 11. Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua
  apresentação, caso o valor não seja maior que três.
****


package Tarefa6;

public class Exercício11 {
	
	public static void main (String[]args) {
	    Scanner scanner = new Scanner(System.in);
	    

	    System.out.print("Digite um valor inteiro: ");
	    int valor = scanner.nextInt();
	    

	    if (valor <= 3) {

	        System.out.println("O valor é: " + valor);
	    }
	    
	    scanner.close();
	}

}
