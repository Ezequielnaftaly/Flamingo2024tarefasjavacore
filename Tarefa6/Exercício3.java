******
**** 3. Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, 
 ****** se o valor da média escolar for maior ou igual a 5. Se o aluno não foi aprovado, indicar uma mensagem informando esta condição.
***** * Apresentar junto das mensagens o valor da média do aluno para qualquer condição.


package Tarefa6;



public class Exercício3 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá iremos cálcular a sua nota e ver se você foi aprovado(a)!");
		System.out.println("Insira a primeira nota: ");
		int nota1 = sc.nextInt();
		System.out.println("Insira a segunda nota: ");
		int nota2 = sc.nextInt();
		System.out.println("Insira a terceira nota: ");
		int nota3 = sc.nextInt();
		System.out.println("Insira a quarta nota: ");
		int nota4 = sc.nextInt();
		
		int calculodasNotas = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (calculodasNotas >= 5) {
			System.out.println("Aprovado! Sua nota é: " + calculodasNotas);
		} else {
			System.out.println("Reprovado. Sua nota é: " + calculodasNotas);
		}
	}
}
