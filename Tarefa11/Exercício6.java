package Tarefa11;

public class Exercício6 {
	
	public class Atividade06_FrequenciaDeElementos {

		public static void main(String[] args) {
			int[] vetor = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };

			int tamanhoMaxElementoVetor = Arrays.stream(vetor).max().getAsInt();

			int[] armazenamentoDefrequencia = new int[tamanhoMaxElementoVetor + 1];
			
			
			for (int elemento : vetor) {
				armazenamentoDefrequencia[elemento]++;
			}

			
			for (int i = 0; i < armazenamentoDefrequencia.length; i++) {
				if (armazenamentoDefrequencia[i] > 0) {
					System.out.println("Elemento: " + i + " - Frequência: " + armazenamentoDefrequencia[i]);
				}
			}
		}

}
