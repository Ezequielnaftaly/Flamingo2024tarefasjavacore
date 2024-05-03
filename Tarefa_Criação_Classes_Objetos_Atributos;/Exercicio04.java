//Crie em uma Classe externa com a abstração de um computador com todos os seus atributos e exiba os seus atributos.

package Tarefa_Criação_Classes_Objetos_Atributos;

public class Exercicio04 {

	   String marca;
	   String modelo;
	   String capacidadeRAM;
	   String capacidadeArmazenamento;
	   String possuiSSD;

	    public Notbook(String marca, String modelo, int capacidadeRAM, int capacidadeArmazenamento, boolean possuiSSD) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.capacidadeRAM = capacidadeRAM;
	        this.capacidadeArmazenamento = capacidadeArmazenamento;
	        this.possuiSSD = possuiSSD;
	    }

	    public void exibirAtributos() {
	        System.out.println("Marca: " + marca);
	        System.out.println("Modelo: " + modelo);
	        System.out.println("Capacidade de RAM: " + capacidadeRAM + " GB");
	        System.out.println("Capacidade de Armazenamento: " + capacidadeArmazenamento + " GB");
	        System.out.println("Possui SSD? " + (possuiSSD ? "Sim" : "Não"));
	    }

	    public abstract void ligar();
	    public abstract void desligar();
	}

	class Notbook extends Computador {
	    public Notbook (String marca, String modelo, int capacidadeRAM, int capacidadeArmazenamento, boolean possuiSSD) {
	        super(marca, modelo, capacidadeRAM, capacidadeArmazenamento, possuiSSD);
	    }

	    @Override
	    public void ligar() {
	        System.out.println("Ligando o desktop...");
	    }

	    @Override
	    public void desligar() {
	        System.out.println("Desligando o desktop...");
	    }

	    public static void main(String[] args) {
	        Desktop meuNotbook = new Notbook("Dell", "Intell", 11, 4000, true);
	        meuDesktop.exibirAtributos();
	        meuDesktop.ligar();
	        meuDesktop.desligar();
	    }
}
