//Crie em uma Classe externa com a abstração de um bicicleta com todos os seus atributos e exiba os seus atributos.

package Tarefa_Criação_Classes_Objetos_Atributos;

public class Exercicio06 {

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

	    public void exibirAtributos() {
	        System.out.println("Marca: " + marca);
	        System.out.println("Modelo: " + modelo);
	        System.out.println("Número de marchas: " + numeroMarchas);
	        System.out.println("Possui freio a disco? " + (possuiFreioDisco ? "Sim" : "Não"));
	        System.out.println("Cor: " + cor);
	    }

	    public static void main(String[] args) {
	        Bicicleta minhaBicicleta = new Bicicleta("CALOI", "IDEXADO", 21, true, "PRETA");
	        minhaBicicleta.exibirAtributos();
	    }
}
