/// 2) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).///

package Tarefa5;

public class Exercicio2 {

	public static void main(String[]Args) {
		
		Scanner sc = new Scanner (System.in);	
			
		System.out.println("Insira um numero: ");
		int Valor = sc.nextInt();
		
		if(Valor >= 0){
			System.out.println("Ele é Positivo");
		}else {
			System.out.println("Ele é Negativo");
		}
		
		sc.close();
		}
	
}
