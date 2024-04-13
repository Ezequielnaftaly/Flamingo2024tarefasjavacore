/// 12) Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque de um produto.
/////// Calcular e escrever a quantidade média ((quantidademédia = quantidade máxima + quantidade mínima)/2).
/////// Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra',
 ////// senão escrever a mensagem 'Efetuar compra'.


package Tarefa5;

public class Exercicio12 {
	
	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade do estoque atual do produto: ");
		float QdtEstoque = sc.nextFloat();

		System.out.println("Informe a quantidade Maxima do Estoque: ");
		float MaxEstoque = sc.nextFloat();

		System.out.println("Informe a quantidade Minima do Estoque: ");
		float MinEstoque = sc.nextFloat();

		float Media = (MaxEstoque + MinEstoque) / 2;

		if (QdtEstoque >= Media) {
			System.out.println("Não podemos Efetuar Compra");
		} else {
			System.out.println("Ebaaa podemos Efetuar Compra");
		}

		sc.close();
	}

}
