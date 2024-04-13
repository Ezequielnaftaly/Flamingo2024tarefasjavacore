///10) Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C). 
///////Durante a apuração dos votos foram computados votos nulos e votos em branco, além dos votos válidos para cada candidato.
///////Deve ser criado um programa de computador que efetue a leitura da quantidade de votos válidos para cada candidato, além de efetuar também
///////a leitura da quantidade de votos nulos e votos em branco.
///////Ao final o programa deve apresentar o número total de eleitores, considerando votos válidos, nulos e em branco;
///////o percentual correspondente de votos válidos do candidato A em relação à quantidade de eleitores;
///////o percentual correspondente de votos válidos do candidato B em relação à quantidade de eleitores;
///////o percentual correspondente de votos válidos do candidato C em relação à quantidade de eleitores;
///////o percentual correspondente de votos nulos em relação à quantidade de eleitores;
///////e por último o percentual correspondente de votos em branco em relação à quantidade de eleitores.
///


package Tarefa4;

public class Exercicio10 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
        System.out.print("insira a  quantidade de votos válidos para o candidato 1 para  Governador: ");
        int votosCandidato1 = sc.nextInt();

        System.out.print("insira a  quantidade de votos válidos para o candidato 2 para  Governador: ");
        int votosCandidato2 = sc.nextInt();

        System.out.print("insira a quantidade de votos válidos para o candidato 3 para Governador: ");
        int votosCandidato3 = sc.nextInt();

        System.out.print("insira a quantidade de votos nulos: ");
        int votosNulos = sc.nextInt();

        System.out.print("Insira a quantidade de votos em branco: ");
        int votosEmBranco = sc.nextInt();

        int totalEleitores = votosCandidato1 + votosCandidato2 + votosCandidato3 + votosNulos + votosEmBranco;

	        double percentualVotosValidos = (double) (votosCandidato1 + votosCandidato2 + votosCandidato3) / totalEleitores * 100;
	        double percentualVotosCandidato1 = (double) votosCandidato1 / totalEleitores * 100;
	        double percentualVotosCandidato2 = (double) votosCandidato2 / totalEleitores * 100;
	        double percentualVotosCandidato3 = (double) votosCandidato3 / totalEleitores * 100;
	        double percentualVotosNulos = (double) votosNulos / totalEleitores * 100;
	        double percentualVotosEmBranco = (double) votosEmBranco / totalEleitores * 100;

        System.out.println("O número total de eleitores são de: " + totalEleitores);
        System.out.println("A porcentagem de votos válidos são de: " + percentualVotosValidos + "%");
        System.out.println("A porcentagem de votos válidos para o candidato 1 para Governador são de: " + percentualVotosCandidato1 + "%");
        System.out.println("A porcentagem de votos válidos para o candidato 2 para  Governador são de: " + percentualVotosCandidato2 + "%");
        System.out.println("A porcentagem de votos válidos para o candidato 3 para  Governador são de: " + percentualVotosCandidato3 + "%");
        System.out.println("A porcentagem de votos nulos são de: " + percentualVotosNulos + "%");
        System.out.println("A porcentagem de votos em branco são de: " + percentualVotosEmBranco + "%");

        	sc.close();


}
