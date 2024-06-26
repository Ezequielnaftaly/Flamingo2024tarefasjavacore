package Tarefa9;

public class Exercício5 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int somaDaFatorial = 0;
		
		for (int i = 0; i < 15; i++) {
			System.out.println("Informe um valor inteiro, para calcular a soma da fatorial: ");
			int numeroInteiro = sc.nextInt();
			
			somaDaFatorial += calculoDeFatorial(numeroInteiro);
		}
		
		 System.out.println("O total da  soma fatorial de cada número informado é de: " + somaDaFatorial);
		 
		sc.close();
		

	}
	
	public static int calculoDeFatorial(int numero) {
		
		if(numero == 0) {
			return 1;
		} else if(numero < 0) {
			System.out.println("Não se calcula fatorial com números negativos");
		} else {
			return numero * calculoDeFatorial(numero -1);
		}
		
		return numero;
		
		
	}

}
