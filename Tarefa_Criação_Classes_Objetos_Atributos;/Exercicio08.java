// Crie em uma Classe externa com a abstração de uma cadeira gamer com todos os seus atributos e exiba os seus atributos.

package Tarefa_Criação_Classes_Objetos_Atributos;

public class Exercicio08 {

	 String marca;
	 String modelo;
	 String alturaAjustavel;
	 String possuiApoioLombar;
	 String possuiApoioCabeca;

	    public CadeiraGamer(String marca, String modelo, int alturaAjustavel, boolean apoioLombar, boolean apoioCabeca) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.alturaAjustavel = alturaAjustavel;
	        this.possuiApoioLombar = apoioLombar;
	        this.possuiApoioCabeca = apoioCabeca;
	    }

	    public void exibirAtributos() {
	        System.out.println("Marca: " + marca);
	        System.out.println("Modelo: " + modelo);
	        System.out.println("Altura Ajustável: " + alturaAjustavel + " cm");
	        System.out.println("Possui Apoio Lombar: " + (possuiApoioLombar ? "Sim" : "Não"));
	        System.out.println("Possui Apoio de Cabeça: " + (possuiApoioCabeca ? "Sim" : "Não"));
	    }

	    public static void main(String[] args) {
	        CadeiraGamer minhaCadeira = new CadeiraGamer("GAMER RACER", "RACING", 520, true, true);
	        minhaCadeira.exibirAtributos();
	    }
	
}
