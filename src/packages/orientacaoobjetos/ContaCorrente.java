package packages.orientacaoobjetos;

public class ContaCorrente {
    String numeroConta;
    double saldo;
    int status;
    double limite;

    
    // public ContaCorrente(String numeroConta, double saldo) {
    //     this("301225", 100.00, 1, 150.00);
    // }

    // public ContaCorrente(String numeroConta, double saldo, int status, double limite) {
    //     this.numeroConta = numeroConta;
    //     this.saldo = saldo;
    //     this.status = status;
    //     this.limite = limite;
    // }

    




    void sacar(double valor){
        if(valor > saldo)
            System.out.println("Saldo indisponível");
        else
            System.out.println("Saque de R$" + valor);
    }

    void depositar(double valor){
        if(valor > 0){
            this.saldo = this.saldo + valor;
        } else {
            System.out.println("Faça operações com valores maior que R$0,00");
        }
    }
}
