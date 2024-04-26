package Tarefa7;

public class Exercício1 {
	
	public class Atividade01 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			String resposta = "sim";
			
			try {
			while (resposta.equals(resposta)|| resposta.equals("Sim")|| resposta.equals("s")) {
			
			System.out.println("Digite um número: ");
			float numero = sc.nextFloat();
			
			if (numero > 0) {
				System.out.println("O número " + numero + " é positivo.");
			} else if (numero == 0) {
				System.out.println("O número informado é zero.");
			} else {
				System.out.println("O número " + numero + " é negativo");
			}
			System.out.println("Deseja reiniciar o programa?");
			resposta = sc.next();
			
			}
			} catch (Exception e) {
				System.out.println("Este programa foi elaborado para rodar numeros, vamos mais uma vez.");
			}
			
			sc.close();

		}

}
