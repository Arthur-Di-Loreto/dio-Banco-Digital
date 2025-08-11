public class Main {

    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        Conta contaPoupanca = new ContaPoupanca();

        contaCorrente.depositar(100);
        contaCorrente.transferencia(50, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }

}
