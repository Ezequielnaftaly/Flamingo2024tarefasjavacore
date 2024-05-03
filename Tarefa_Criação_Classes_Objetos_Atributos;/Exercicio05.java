//Crie dentro de uma Classe a abstração de uma bicicleta com todos os seus atributos e exiba os seus atributos.


package Tarefa_Criação_Classes_Objetos_Atributos;

public class Exercicio05 {
	
	 String marca;
	 String modelo;
	 String numeroMarchas;
	 String possuiFreioDisco;
	 String cor;

	    public Bicicleta(String marca, String modelo, int numeroMarchas, boolean possuiFreioDisco, String cor) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.numeroMarchas = numeroMarchas;
	        this.possuiFreioDisco = possuiFreioDisco;
	        this.cor = cor;
	    }

	    class Quadro {
	        private String material;
	        private double tamanho;

	        public Quadro(String material, double tamanho) {
	            this.material = material;
	            this.tamanho = tamanho;
	        }

	        public void exibirQuadro() {
	            System.out.println("Material do quadro: " + material);
	            System.out.println("Tamanho do quadro: " + tamanho + " polegadas");
	        }
	    }

	    public void exibirBicicleta() {
	        System.out.println("Marca: " + marca);
	        System.out.println("Modelo: " + modelo);
	        System.out.println("Número de marchas: " + numeroMarchas);
	        System.out.println("Possui freio a disco? " + (possuiFreioDisco ? "Sim" : "Não"));
	        System.out.println("Cor: " + cor);
	    }

	    public static void main(String[] args) {
	        Bicicleta minhaBicicleta = new Bicicleta("Caloi", "Explorer", 21, true, "Vermelha");
	        Bicicleta.Quadro quadro = minhaBicicleta.new Quadro("Alumínio", 18.5);
	        
	        minhaBicicleta.exibirBicicleta();
	        quadro.exibirQuadro();
	    }

}
