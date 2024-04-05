public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private double saldo;

    public Pessoa(String nome, int idade, String cpf, double saldo) {
        if (!isValidCpf(cpf)) {
            throw new IllegalArgumentException("CPF invalido!");
        }

        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getCpf() {
        return cpf;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private boolean isValidCpf(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            return false;
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 > 9) {
            digito1 = 0;
        }

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        int digito2 = 11 - (soma % 11);
        if (digito2 > 9) {
            digito2 = 0;
        }

        return cpf.charAt(9) - '0' == digito1 && cpf.charAt(10) - '0' == digito2;
    }
}
