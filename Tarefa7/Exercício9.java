package Tarefa7;

public class Exercício9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String resposta = "sim";
		
		while (resposta.equals(resposta) || resposta.equals("Sim") || resposta.equals("s")) {


		System.out.println("Digite o numero de litros vendidos:");
		int litrosVendidos = sc.nextInt();

		System.out.println("Digite o tipo de combustivel:\n A - Álcool\n G - Gasolina");
		String tipoDeCombustivel = sc.next();
		
		float precoLitroGasolina = 3.30f;
		float precoLitroAlcool = 2.90f;
		float calculoValorAlcool = litrosVendidos * precoLitroAlcool;
		float calculoValorGasolina = litrosVendidos * precoLitroGasolina;

		if (tipoDeCombustivel.equals("A") || tipoDeCombustivel.equals("a") && litrosVendidos <= 20) {
			float valorFinalAlcool = calculoValorAlcool - (calculoValorAlcool * 0.03f) ;
			System.out.println(
					"O valor final do Álcool a ser pago pelo cliente, com desconto de 3% é: ");
			System.out.print(
					new DecimalFormat(".##").format(valorFinalAlcool));
			System.out.println(" reais");

		} else if (tipoDeCombustivel.equals("A") || tipoDeCombustivel.equals("a") && litrosVendidos > 20) {
			float valorFinalAlcool2 = calculoValorAlcool - (calculoValorAlcool * 0.05f) ;
			System.out.println(
					"O valor final do Álcool a ser pago pelo cliente, com desconto de 5% é: ");
			System.out.print(
					new DecimalFormat(".##").format(valorFinalAlcool2));
			System.out.println(" reais");

		} else if (tipoDeCombustivel.equals("G") || tipoDeCombustivel.equals("g") && litrosVendidos <= 20) {
			float valorFinalGasolina = calculoValorGasolina - (calculoValorGasolina * 0.04f) ;
			System.out.println(
					"O valor final da gasolina a ser pago pelo cliente, com desconto de 4% é: ");
			System.out.print(
					new DecimalFormat(".##").format(valorFinalGasolina));
			System.out.println(" reais");
			

		} else if (tipoDeCombustivel.equals("G") || tipoDeCombustivel.equals("g") && litrosVendidos > 20) {
			float valorFinalGasolina2 = calculoValorGasolina - (calculoValorGasolina * 0.06f) ;
			System.out.println("O valor final da gasolina a ser pago pelo cliente, com desconto de 6% é: ");
			System.out.print(
					new DecimalFormat(".##").format(valorFinalGasolina2));
			System.out.println(" reais");
		} else {
			System.out.println("O tipo de combustível só pode ser álcool ou gasolina.");
		}

		System.out.println("Reinicie o programa?");
		resposta = sc.next();
		
		}
		sc.close();

	}
	
	
	
}
