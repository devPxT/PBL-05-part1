public class Automovel {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    private boolean novo;
    private int quilometragem;

    private String placa;
    private String combustivel;
    private String cor;
    private String cambio;

    private int peso;

    public Automovel(String marca, String modelo, int ano, double preco, boolean novo, int quilometragem, String placa, String combustivel, String cor, String cambio, int peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.novo = novo;
        if (novo) {
            this.quilometragem = 0;
        } else {
            this.quilometragem = quilometragem;
        }
        this.placa = placa;
        this.combustivel = combustivel;
        this.cor = cor;
        this.cambio = cambio;
        this.peso = peso;
    }
}