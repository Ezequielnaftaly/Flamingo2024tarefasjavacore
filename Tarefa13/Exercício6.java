package Tarefa13;

public class Exercício6 {
	
	
static int calcularOMaximo(int num1, int num2) {
		
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static void main(String[] args) {
		
		System.out.println("O maior número entre os valores informados é: " + calcularOMaximo(20, 25));
	
	}

}
