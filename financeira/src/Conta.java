public class Conta {
    private double saldo;
    private int numeroConta;
    private String titularConta;

    public Conta(int numeroConta, String titularConta, double saldo) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldo = saldo;
    }

    public Conta() {

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public void deposito(double valor) {
        this.setSaldo(getSaldo() + valor);
    }

    public void saque(double valor) {
        this.setSaldo(getSaldo() - valor);
    }

    public void consulta() {
        System.out.println("Número da conta: " +
                this.getNumeroConta());
        System.out.println(" Nome do títular da conta: " +
                this.getTitularConta());
        System.out.println(" Seu saldo: " +
                this.getSaldo());
    }

}
