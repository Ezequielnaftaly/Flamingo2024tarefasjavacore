///8) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) 
 ///  e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e
////  terminar no dia seguinte.///
 


package Tarefa5;

public class Exercicio8 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira a hora de inicio: ");
		int hrInicio = sc.nextInt();

		System.out.println("Insira a hora do fim: ");
		int hrFim = sc.nextInt();

		int tempo = hrFim - hrInicio;

		if (tempo > 0) {
			System.out.println("A partida teve duração  " + tempo + " horas ");
		} else {
			int tempo2 = tempo > 24;
			System.out.println("A partida teve duração " + tempo2 + " horas ");
		}

		sc.close();
	}
}
