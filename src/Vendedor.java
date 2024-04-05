public class Vendedor extends Pessoa {
    private String Cnpj;

    public String getCnpj() {
        return Cnpj;
    }

    public Vendedor(String nome, int idade, String cpf, double saldo, String Cnpj) {
        super(nome, idade, cpf, saldo);
        this.Cnpj = Cnpj;
    }

    public void adicionarDinheiroFaturado(double valor) {
        double saldoNovo = getSaldo() + valor;
        setSaldo(saldoNovo);
        this.imprimirSaldo();
    }
    public void diminuirDinheiroFaturado(double valor) {
        double dinheroNovo = getSaldo() - valor;
        setSaldo(dinheroNovo);
        this.imprimirSaldo();
    }

    public void imprimirSaldo() {
        System.out.println("Dinheiro novo faturado do " + getNome() + " -> " + getSaldo());
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }

    public void imprimirInfo() {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println(getNome() + " - " + getIdade() + " anos\n" + //
                        "cpf: " + getCpf() + "\n" + //
                        "cnpj: " + getCnpj() + "\n" + //
                        "saldo faturado: " + getSaldo() + " R$");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println();
    }
}
