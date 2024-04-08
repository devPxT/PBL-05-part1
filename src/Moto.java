public class Moto extends Automovel {
    private int cilindradas;
    private String tipo;

    public Moto(String marca, String modelo, int ano, double preco, int quilometragem,
                String placa, String combustivel, String cor, String cambio,
                int peso, int cilindradas, String tipo) {
        super(marca, modelo, ano, preco, quilometragem, placa, combustivel, cor, cambio, peso);
        this.cilindradas = cilindradas;
        this.tipo = tipo;
    }

    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void imprimirInfo(int index) {
        System.out.println("=== Moto "+ index + " ===");
        System.out.println(getMarca() + " " + getModelo() + "\n" + //
                        "ano: " + getAno() + "\n" + //
                        "preço: " + getPreco() + " R$ ->" + isNew(getNovo()) + "\n" + //
                        "quilometragem: " + getQuilometragem() + " Km" + "\n" + //
                        "placa: " + getPlaca() + "\n" + //
                        "combustível: " + getCombustivel() + "\n" + //
                        "cor: " + getCor() + "\n" + //
                        "peso: " + getPeso() + " Kg" + "\n" + //
                        "cilindradas: " + this.getCilindradas() + "\n" + //
                        "tipo: " + this.getTipo());
        System.out.println("=== Moto "+ index + " ===");
        System.out.println();
    }

    public boolean comprarMoto(Vendedor vendedor, Cliente cliente) {
        if (cliente.getSaldo() < getPreco()) {
            System.out.println();
            System.out.println("Cliente não tem saldo suficiente para comprar a moto: " + getMarca() + " -> " + getModelo());
            return false;
        }
        System.out.println();
        System.out.println(getMarca() + " -> " + getModelo() + " comprado com sucesso!");
        cliente.diminuirSaldo(getPreco());
        vendedor.adicionarDinheiroFaturado(getPreco());
        cliente.imprimirEndereco();
        return true;
    }
}
