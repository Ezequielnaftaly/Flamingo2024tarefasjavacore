//Crie em uma Classe externa com a abstração de um celular com todos os seus atributos e exiba os seus atributos.

package Tarefa_Criação_Classes_Objetos_Atributos;

public class Exercicio03 {
	
	 public Celular(String marca, String modelo, int capacidadeBateria, String sistemaOperacional, boolean temCamera) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.capacidadeBateria = capacidadeBateria;
	        this.sistemaOperacional = sistemaOperacional;
	        this.temCamera = temCamera;
	    }

	    public void exibirAtributos() {
	        System.out.println("Marca: " + marca);
	        System.out.println("Modelo: " + modelo);
	        System.out.println("Capacidade da bateria: " + capacidadeBateria + " mAh");
	        System.out.println("Sistema Operacional: " + sistemaOperacional);
	        System.out.println("Tem câmera? " + (temCamera ? "Sim" : "Não"));
	    }

	    public abstract void Chamada(String numero);
	    public abstract void Mensagem(String numero, String mensagem);
	}

	class Smartphone extends Celular {
	    public Smartphone(String marca, String modelo, int capacidadeBateria, String sistemaOperacional, boolean temCamera) {
	        super(marca, modelo, capacidadeBateria, sistemaOperacional, temCamera);
	    }

	    @Override
	    public void Chamada(String numero) {
	        System.out.println("Chamando " + numero + "...");
	    }

	    @Override
	    public void Mensagem(String numero, String mensagem) {
	        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
	    }

	    public static void main(String[] args) {
	        Smartphone meuSmartphone = new Smartphone("apple", "Iphone15", 7000, "IOS", true);
	        meuSmartphone.exibirAtributos();
	        meuSmartphone.Chamada("942165293");
	        meuSmartphone.Mensagem("36213674", "Tudo bem! Espero que sim!");
	    }
}
