public class Caminhao extends Automovel {
    private int eixos;
    private float cargaMaxima;

    public Caminhao(String marca, String modelo, int ano, double preco,int quilometragem, 
                    String placa, String combustivel, String cor, String cambio,
                    int peso, int eixos, float cargaMaxima) {
        super(marca, modelo, ano, preco, quilometragem, placa, combustivel, cor, cambio, peso);
        this.eixos = eixos;
        this.cargaMaxima = cargaMaxima;
    }

    public float getCargaMaxima() {
        return cargaMaxima;
    }
    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public void imprimirInfo() {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println(getMarca() + " " + getModelo() + "\n" + //
                        "ano: " + getAno() + "\n" + //
                        "preço: " + getPreco() + " R$ ->" + isNew(getNovo()) + "\n" + //
                        "quilometragem: " + getQuilometragem() + " Km" + "\n" + //
                        "placa: " + getPlaca() + "\n" + //
                        "combustível: " + getCombustivel() + "\n" + //
                        "cor: " + getCor() + "\n" + //
                        "peso: " + getPeso() + " Kg" + "\n" + //
                        "número de eixos: " + this.getEixos() + "\n" + //
                        "carga máxima: " + this.getCargaMaxima() + " toneladas");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println();
    }

    public void comprarCaminhao(Vendedor vendedor, Cliente cliente) {
        if (cliente.getSaldo() < getPreco()) {
            System.out.println("Saldo insuficiente para comprar o caminhão da: " + getMarca() + " -> " + getModelo());
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            return;
        }
        System.out.println(getMarca() + " -> " + getModelo() + " comprado com sucesso!");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        cliente.diminuirSaldo(getPreco());
        vendedor.adicionarDinheiroFaturado(getPreco());
    }
}