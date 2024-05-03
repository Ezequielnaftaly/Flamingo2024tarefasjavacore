 // Crie dentro de uma Classe a abstração de um cadeira gamer com todos os seus atributos e exiba os seus atributos.//

package Tarefa_Criação_Classes_Objetos_Atributos;

public class Exercicio07 {

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

    public class DetalhesCadeira {
        private String material;
        private String cor;

        public DetalhesCadeira(String material, String cor) {
            this.material = material;
            this.cor = cor;
        }

        public String getMaterial() {
            return material;
        }

        public String getCor() {
            return cor;
        }
    }

    public void exibirAtributos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Altura Ajustável: " + alturaAjustavel + " cm");
        System.out.println("Possui Apoio Lombar: " + (possuiApoioLombar ? "Sim" : "Não"));
        System.out.println("Possui Apoio de Cabeça: " + (possuiApoioCabeca ? "Sim" : "Não"));

        DetalhesCadeira detalhes = new DetalhesCadeira("Couro ", "Vermelho");
        System.out.println("\nDetalhes Internos:");
        System.out.println("Material: " + detalhes.getMaterial());
        System.out.println("Cor: " + detalhes.getCor());
    }

    public static void main(String[] args) {
        CadeiraGamer minhaCadeira = new CadeiraGamer("GAMER RACER", "RACING", 520, true, true);
        minhaCadeira.exibirAtributos();
    }
}
