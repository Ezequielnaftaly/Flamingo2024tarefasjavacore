///
///5) Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em real.
/// O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível com o usuário,
/// para que seja apresentado o valor em moeda americana
///


package Tarefa4;

public class Exercicio5 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor em reais que deseja converter em dolár: ");
		float reaisParaSerConvertido = sc.nextFloat();
		
		System.out.println("insira o valor da cotação em dolár no dia : ");
		float cotacaoDolar = sc.nextFloat();
		
		float conversaoREaisEmDolar = cotacaoDolar * reaisParaSerConvertido;
		
			System.out.println("O valor do dolár americano é:  US$ " + conversaoREaisEmDolar);
			
				sc.close();

}
