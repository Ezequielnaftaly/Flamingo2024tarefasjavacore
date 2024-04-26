package Tarefa9;

public class Exercício4 {
	
	public class Atividade04 {

		public static void main(String[] args) {
			
			float somatorioDegraos = 0;
	        float graosNoPrimeiroQuadro = 1;

	        for (int i = 1; i <= 64; i++) {
	            somatorioDegraos += graosNoPrimeiroQuadro;
	            graosNoPrimeiroQuadro *= 2;
	        }

	        System.out.println("O total de grãos de trigo no tabuleiro de xadrez é: " + somatorioDegraos);
	    }


}
