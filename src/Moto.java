public class Moto extends Automovel {
    private int cilindradas;
    private String tipo;

    public Moto(String marca, String modelo, int ano, double preco, boolean novo, 
                int quilometragem, String placa, String combustivel, String cor, 
                String cambio, int peso, int cilindradas, String tipo) {
        super(marca, modelo, ano, preco, novo, quilometragem, placa, combustivel, cor, cambio, peso);
        this.cilindradas = cilindradas;
        this.tipo = tipo;
    }
}
