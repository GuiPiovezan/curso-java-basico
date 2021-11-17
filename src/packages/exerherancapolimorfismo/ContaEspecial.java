package packages.exerherancapolimorfismo;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(){
       
    }

    public ContaEspecial(double limite){
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor){
        if (valor > 0 && valor < this.limite){
            double saldo = this.getSaldo();
            saldo -= valor;
            this.setSaldo(saldo);
        }
        System.out.println("Valor não confere com o limite");
    }

    @Override
    public String toString(){
        return super.toString() + "\nLimite " + getLimite();
    }


}
