///
/// 4) Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em dólar.
/// O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário,
///  para que seja apresentado o valor em moeda brasileira.
///

package Tarefa4;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor em dolár que deseja converter em real: ");
		float dolaresParaSerConvertido = sc.nextFloat();
		
		System.out.println("Insira o  valor da cotação em dolár no dia: ");
		float cotacaoDolar = sc.nextFloat();
		
		float conversaoDolarEmReais = cotacaoDolar * dolaresParaSerConvertido;
		
			System.out.println("O valor em reais brasileiros é de: R$ " + conversaoDolarEmReais);
			
				sc.close();
}
