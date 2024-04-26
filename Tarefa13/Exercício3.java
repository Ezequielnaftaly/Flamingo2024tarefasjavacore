package Tarefa13;

public class Exercício3 {
	
static void verificarNumero(int numero) {
		
		if (numero > 0) {
			System.out.println("O número " + numero + ", é positivo");
		} else if (numero < 0) {
			System.out.println("O numero " + numero + ", é negativo");
		} else {
			System.out.println("O número " + numero + ", é zero");
		}
	}

	public static void main(String[] args) {
		
		verificarNumero(0);

	}

}
