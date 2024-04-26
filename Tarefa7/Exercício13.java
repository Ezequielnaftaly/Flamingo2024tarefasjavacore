package Tarefa7;

public class Exercício13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String resposta = "sim";

		while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {

			System.out.println("Informe o nome do produto: ");
			String nomeProduto = sc.next();

			System.out.println("Informe a quantidade adquirida do produto:");
			int quantidadeDoProduto = sc.nextInt();

			System.out.println("Digite o preço unitário do produto:");
			float precoUnitario = sc.nextFloat();

			float total = quantidadeDoProduto * precoUnitario;

			if (quantidadeDoProduto <= 5) {
				float totalAPagar = total - 0.02f;
				System.out.println("O total a pagar do produto: " + nomeProduto + ", com desconto de 2%, é de "
						+ totalAPagar + " reais");
			} else if (quantidadeDoProduto > 5 && quantidadeDoProduto <= 10) {
				float totalAPagar = total - 0.03f;
				System.out.println("O total a pagar do produto: " + nomeProduto + ", com desconto de 3%, é de "
						+ totalAPagar + " reais");
			} else if (quantidadeDoProduto > 10) {
				float totalAPagar = total - 0.05f;
				System.out.println("O total a pagar do produto: " + nomeProduto + ", com desconto de 5%, é de "
						+ totalAPagar + " reais");
			}

			System.out.println("Deseja comprar mais um produto?");
			resposta = sc.next();

		}

		sc.close();

	}
	
}
