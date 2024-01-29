public class Main {
    public static void main(String[] args) {

        Cliente vito = new Cliente();
        vito.setNome("Vitor Aguiar");

        // Criando conta corrente e depositando valor
        ContaCorrente cc = new ContaCorrente(vito);
        cc.depositar(3200);
        cc.ImprimirExtrato();

        // Criando conta poupança

        ContaPoupanca pp = new ContaPoupanca(vito);

        // Depositando valor da conta corrente na poupança e imprimindo valores

        cc.transferir(320, pp);
        pp.ImprimirExtrato();
    }
}