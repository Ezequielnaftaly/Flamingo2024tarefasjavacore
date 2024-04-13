///
///3) Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo segundo.
///

package Tarefa4;

public class Exercicio3 {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);	

	System.out.println("insira o valor para calcular o Quadrado para acharmos a Diferença");

	System.out.print("Insira o valor para calcular ai vamos chamar de A ");
	int A = scanner.nextInt();
	        
	System.out.print("Insira o valor para calcular ai vamos chamar de B: ");
	int B = scanner.nextInt();

	int resultado = (A - B) * (A - B);
	 
	System.out.println("O resultado calculado entre a diferença do primeiro para o segundo é: " + resultado);
	        
	        
	scanner.close();
	
}
