//9)A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra,
 // cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
 // Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário,
/// que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
////


package Tarefa5;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a hora de início da partida em horas:");
		int horaInicio = sc.nextInt();
		
		System.out.println("Insira a hora do término da partida: ");
		int horasTermino = sc.nextInt();
		
		int duracaoPartida;
		 
	    if (horasTermino > horaInicio) {
	    	duracaoPartida = horasTermino - horaInicio;
	    } else {
	    	duracaoPartida = 24 - horaInicio + horasTermino;
	    }

	    System.out.println("O tempo da partida durou " + duracaoPartida + " horas!");

			sc.close();

	}

}
	
}
