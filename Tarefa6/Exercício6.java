****
 ****** 6. Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los dispostos em ordem crescente.
*****


package Tarefa6;

public class Exercício6 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();
        
        System.out.print("Digite o valor de C: ");
        int c = sc.nextInt();
        
       
        if (a > b) { a = a + b; b = a - b; a = a - b; }
        if (b > c) { b = b + c; c = b - c; b = b - c; }
        if (a > b) { a = a + b; b = a - b; a = a - b; }
        
       
        System.out.println("Os valores em ordem crescente são:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        
        sc.close();
    }
	

}
