public class Caminhao extends Automovel {
    private int eixos;
    private float cargaMaxima;

    public Caminhao(String marca, String modelo, int ano, double preco, boolean novo, 
                    int quilometragem, String placa, String combustivel, String cor, 
                    String cambio, int peso, int eixos, float cargaMaxima) {
        super(marca, modelo, ano, preco, novo, quilometragem, placa, combustivel, cor, cambio, peso);
        this.eixos = eixos;
        this.cargaMaxima = cargaMaxima;
    }
}