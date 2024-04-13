////
///9) Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e também o valor do percentual de reajuste (variável PR) a ser atribuído.
///Apresentar o valor do novo salário (variável NS).
///

package Tarefa4;

public class Exercicio9 {
	
}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("insira o valor do seu sálario mensal: ");
		float salariomensal = sc.nextFloat();
		
		System.out.println("insira o  valor do percentual de reajuste: ");
		float reajuste = sc.nextFloat();
		
		float valorReajuste = salariomensal * (reajuste / 100);
		
		float salarioComReajuste = salariomensal + valorReajuste;
		
		System.out.println("Meu Novo salário é: R$ " + salarioComReajuste);
		
			sc.close();

}
