
*** 8. Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores.
**


package Tarefa6;

public class Exercício8 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digite o 1º número inteiro: ");
        int numero = scanner.nextInt();
        
  
        int maior = numero;
        int menor = numero;
        
 
        for (int i = 1; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numero = scanner.nextInt();
            

            if (numero > maior) {
                maior = numero;
            }
            
 
            if (numero < menor) {
                menor = numero;
            }
        }
        

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        
        scanner.close();
    }
	
}
