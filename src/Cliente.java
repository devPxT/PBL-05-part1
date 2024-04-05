public class Cliente extends Pessoa {
    private String cep;
    private int numeroCasa;

    public String getCep() {
        return cep;
    }
    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public Cliente(String nome, int idade, String cpf, double saldo, String cep, int numeroCasa) {
        super(nome, idade, cpf, saldo);
        this.cep = cep;
        this.numeroCasa = numeroCasa;
    }

    public void adicionarSaldo(double valor) {
        double saldoNovo = getSaldo() + valor;
        setSaldo(saldoNovo);
        this.imprimirSaldo();
    }
    public void diminuirSaldo(double valor) {
        double saldoNovo = getSaldo() - valor;
        setSaldo(saldoNovo);
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
                        "cep: " + getCep() + " nº " + getNumeroCasa() + "\n" + //
                        "saldo disponivel: " + getSaldo() + " R$");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println();
    }

    public void imprimirEndereco() {
        System.out.println();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Entregar automovel no cep: " + this.getCep() + " numero da casa: " + this.getNumeroCasa() + " dono da casa -> " + getNome());
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
}
