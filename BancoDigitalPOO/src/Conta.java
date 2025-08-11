public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 0;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = ++SEQUENCIAL;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferencia(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    protected void imprimirDados() {
        System.out.printf("Agencia: %d\n", this.agencia);
        System.out.printf("Numero: %d\n", this.numero);
        System.out.printf("Saldo: %.2f\n", this.saldo);
    }
}
