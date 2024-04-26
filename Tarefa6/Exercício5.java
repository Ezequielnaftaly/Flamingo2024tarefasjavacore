****
 * 5. Efetuar a leitura de três valores (variáveis A, B e C) e efetuar o cálculo da equação completa de segundo grau, apresentando as duas raízes, 
 * se para os valores informados for possível efetuar o referido cálculo.
 *  Lembre-se de que a variável A deve ser diferente de zero.
****** Tarefa6;

public class Exercício5 {

	public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();
        

        if (a == 0) {
            System.out.println("O valor de A deve ser diferente de zero.");
            return; 
        }
        
        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();
        
        System.out.print("Digite o valor de C: ");
        double c = sc.nextDouble();
        

        double delta = b * b - 4 * a * c;
        

        if (delta >= 0) {

            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            System.out.println("As raízes da equação são:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        } else {
            System.out.println("Não existem raízes reais para essa equação.");
        }
        
        sc.close();
        
	
	
}
