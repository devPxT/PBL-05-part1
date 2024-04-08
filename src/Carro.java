public class Carro extends Automovel {
    private int portas;

    public Carro(String marca, String modelo, int ano, double preco, int quilometragem, 
                String placa, String combustivel, String cor, String cambio,
                int peso, int portas) {
        super(marca, modelo, ano, preco, quilometragem, placa, combustivel, cor, cambio, peso);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void imprimirInfo(int index) {
        System.out.println("=== Carro "+ index + " ===");
        System.out.println(getMarca() + " " + getModelo() + "\n" + //
                        "ano: " + getAno() + "\n" + //
                        "preço: " + getPreco() + " R$ ->" + isNew(getNovo()) + "\n" + //
                        "quilometragem: " + getQuilometragem() + " Km" + "\n" + //
                        "placa: " + getPlaca() + "\n" + //
                        "combustível: " + getCombustivel() + "\n" + //
                        "cor: " + getCor() + "\n" + //
                        "peso: " + getPeso() + " Kg" + "\n" + //
                        "número de portas: " + this.getPortas());
                        System.out.println("=== Carro "+ index + " ===");
        System.out.println();
    }

    public boolean comprarCarro(Vendedor vendedor, Cliente cliente) {
        if (cliente.getSaldo() < getPreco()) {
            System.out.println();
            System.out.println("Cliente não tem saldo suficiente para comprar o carro: " + getMarca() + " -> " + getModelo());
            return false;
        }
        System.out.println(getMarca() + " -> " + getModelo() + " comprado com sucesso!");
        cliente.diminuirSaldo(getPreco());
        vendedor.adicionarDinheiroFaturado(getPreco());
        return true;
    }
}
