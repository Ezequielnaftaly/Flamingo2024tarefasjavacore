//10) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.
 //// Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor,
 /////calcular e escrever o seu salário total.


package Tarefa5;

public class Exercicio10 {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor de salário fixo atual do vendedor: ");
	    float salarioFixo = sc.nextFloat();

	    System.out.println("Insira o valor das vendas efetuadas: ");
	    float vendas = sc.nextFloat();

	    float comissao;
	    
	    if (vendas <= 1500) {
	    	comissao = vendas * 0.03f;
	    } else {
	        comissao = (1500 * 0.03f) + ((vendas - 1500) * 0.05f);
	    }

	    float salarioTotal = salarioFixo + comissao;

	    System.out.println("O salário total do vendedor será é de: R$" + salarioTotal);

	    	sc.close();

	}

}
	
}
