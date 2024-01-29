public class Conta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {

        if (valor > saldo) {
            System.out.println("Você não possui saldo suificiente! ");
        } else {
            saldo -= valor;
            System.out.println("Ação efetuada com sucesso");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void ImprimirExtrato() {
        System.out.println("Extrato da conta");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Agencia: " + agencia);
        System.out.println("Conta: " + numero);
        System.out.println("Saldo: " + saldo);
    }
}
