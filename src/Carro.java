public class Carro extends Automovel {
    private int portas;

    public Carro(String marca, String modelo, int ano, double preco, boolean novo, 
                int quilometragem, String placa, String combustivel, String cor,
                String cambio, int peso, int portas) {
        super(marca, modelo, ano, preco, novo, quilometragem, placa, combustivel, cor, cambio, peso);
        this.portas = portas;
    }
}
