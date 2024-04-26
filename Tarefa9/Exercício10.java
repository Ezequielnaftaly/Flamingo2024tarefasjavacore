package Tarefa9;

public class Exercício10 {

	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o número do dividendo: ");
	        int solicitandoDividendo = sc.nextInt();

	        System.out.print("Digite o número do divisor: ");
	        int solicitandoDivisor = sc.nextInt();

	        int resultadoQuociente = 0;
	        
	        int resto = solicitandoDividendo;

	        while (resto >= solicitandoDivisor) {
	            resto = resto - solicitandoDivisor;
	            resultadoQuociente++;
	        }

	        System.out.println("Resultado da divisão: " + resultadoQuociente);
	        
	        sc.close();
	    }
	
	}
	
}
