public class Main {

    public static void main(String[] args) {
        Cliente Marcos = new Cliente();
        Marcos.setNome("Marcos");

        ContaCorrente cc = new ContaCorrente(Marcos);
        ContaPoupanca poupanca = new ContaPoupanca(Marcos);
        
        cc.depositar(100);        
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        
        
        }
    
}
