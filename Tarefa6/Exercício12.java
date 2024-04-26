
****
 * 12. Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando com saída uma das seguintes mensagens: 
 * "Ilmo Sr.", se o sexo informado como masculino, ou a mensagem "Ilma Sra.", 
 * para o sexo informado como feminino. Apresente também junto da mensagem de saudação o nome previamente informado.
*****

package Tarefa6;

public class Exercício12 {
	
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite o nome: ");
	        String nome = scanner.nextLine();
	        
	        System.out.println("Digite o sexo (M/F): ");
	        char sexo = scanner.next().charAt(0);
	        
	        if (sexo == 'M' || sexo == 'm') {
	            System.out.println("Ilmo Sr. " + nome);
	        } else if (sexo == 'F' || sexo == 'f') {
	            System.out.println("Ilma Sra. " + nome);
	        } else {
	            System.out.println("Sexo inválido.");
	        }
	        
	        scanner.close();
	    }
	

}
