public class Cliente extends Pessoa {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente(String nome, int idade, String cpf, double saldo) {
        super(nome, idade, cpf);
        this.saldo = saldo;
    }

    public void adicionarSaldo(double valor) {
        double saldoNovo = this.saldo + valor;
        this.setSaldo(saldoNovo);
        this.imprimirSaldo();
    }
    public void diminuirSaldo(double valor) {
        double saldoNovo = this.saldo - valor;
        this.setSaldo(saldoNovo);
        this.imprimirSaldo();
    }

    public void imprimirSaldo() {
        System.out.println("Saldo novo do " + getNome() + " -> " + getSaldo());
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }

    public void imprimirInfo() {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println(getNome() + " - " + getIdade() + " anos\n" + //
                        "cpf: " + getCpf() + "\n" + //
                        "saldo disponivel: " + getSaldo() + " R$");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println();
    }
}
