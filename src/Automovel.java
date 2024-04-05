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

    public Automovel(String marca, String modelo, int ano, double preco, int quilometragem, String placa, String combustivel, String cor, String cambio, int peso) {
        if (!isNewPlaca(placa)) {
            throw new IllegalArgumentException("Formato de placa incorreto. O formato correto é ABC-1234.");
        }

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.quilometragem = quilometragem;
        if (quilometragem > 0) {
            this.novo = false;
        } else {
            this.novo = true;
        }
        this.placa = placa;
        this.combustivel = combustivel;
        this.cor = cor;
        this.cambio = cambio;
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public double getPreco() {
        return preco;
    }
    public boolean getNovo() {
        return novo;
    }
    public int getQuilometragem() {
        return quilometragem;
    }
    public String getPlaca() {
        return placa;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public String getCor() {
        return cor;
    }
    public String getCambio() {
        return cambio;
    }
    public int getPeso() {
        return peso;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
        this.novo = false;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    private boolean isNewPlaca(String placa) {
        return placa.matches("[A-Z]{3}-\\d{4}");
    }
    public String isNew(boolean novo) {
        if (novo) {
            return " Automovel novo! ";
        }
        return " Automovel seminovo! ";
    }
}