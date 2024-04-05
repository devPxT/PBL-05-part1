public class Vendedor extends Pessoa {
    private String Cnpj;
    private double dinheiroFaturado;

    public String getCnpj() {
        return Cnpj;
    }
    public double getDinheiroFaturado() {
        return dinheiroFaturado;
    }

    public void setDinheiroFaturado(double dinheiroFaturado) {
        this.dinheiroFaturado = dinheiroFaturado;
    }

    public Vendedor(String nome, int idade, String cpf, double dinheiroFaturado, String Cnpj) {
        super(nome, idade, cpf);
        this.Cnpj = Cnpj;
        this.dinheiroFaturado = dinheiroFaturado;
    }

    public void adicionarDinheiroFaturado(double valor) {
        double dinheroNovo = this.dinheiroFaturado + valor;
        this.setDinheiroFaturado(dinheroNovo);
        this.imprimirSaldo();
    }
    public void diminuirDinheiroFaturado(double valor) {
        double dinheroNovo = this.dinheiroFaturado - valor;
        this.setDinheiroFaturado(dinheroNovo);
        this.imprimirSaldo();
    }

    public void imprimirSaldo() {
        System.out.println("Dinheiro novo faturado do " + getNome() + " -> " + getDinheiroFaturado());
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }

    public void imprimirInfo() {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println(getNome() + " - " + getIdade() + " anos\n" + //
                        "cpf: " + getCpf() + "\n" + //
                        "cnpj: " + getCnpj() + "\n" + //
                        "saldo faturado: " + getDinheiroFaturado() + " R$");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println();
    }
}
