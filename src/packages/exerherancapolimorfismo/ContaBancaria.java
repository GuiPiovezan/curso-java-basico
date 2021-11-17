package packages.exerherancapolimorfismo;

public abstract class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria() {}

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if(valor < 1 || valor > this.saldo){
            System.out.println("Não é possível sacar");
        } else {
            this.saldo -= valor;
            System.out.println("Saque de: R$ "+ valor);
        }

    }

    public void depositar(double valor){
        if(valor < 1){
            System.out.println("Deposite um valor válido acima de R$0,00");
        }

        this.saldo += valor;

        System.out.println("Depósito de R$" + valor);
    }

    public String toString(){
        return "\nCliente " + getNomeCliente() +
                "\nConta " + getNumConta() +  
                "\nSaldo R$" + getSaldo(); 
    }
   
}
