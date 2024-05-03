//Crie dentro de uma Classe a abstração de um computador com todos os seus atributos e exiba os seus atributos.

package Tarefa_Criação_Classes_Objetos_Atributos;

public class Exercicio02 {

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
	        System.out.println("Possui SSD: " + (possuiSSD ? "Sim" : "Não"));
	    }

	    public class DetalhesComputador {
	        private String sistemaOperacional;
	        private String processador;

	        public DetalhesNotbook(String sistemaOperacional, String processador) {
	            this.sistemaOperacional = sistemaOperacional;
	            this.processador = processador;
	        }

	        public String getSistemaOperacional() {
	            return sistemaOperacional;
	        }

	        public String getProcessador() {
	            return processador;
	        }
	    }

	    public static void main(String[] args) {
	        Computador meuComputador = new Computador("Dell", "Intell core", 16, 512, true);
	        meuComputador.exibirAtributos();

	        Computador.DetalhesComputador detalhes = meuComputador.new DetalhesComputador("Windows 11", "Intel Core i7");
	        System.out.println("\nDetalhes Internos:");
	        System.out.println("Sistema Operacional: " + detalhes.getSistemaOperacional());
	        System.out.println("Processador: " + detalhes.getProcessador());
	    }
	}

