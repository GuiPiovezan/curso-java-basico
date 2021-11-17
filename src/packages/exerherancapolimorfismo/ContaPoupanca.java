package packages.exerherancapolimorfismo;

import java.util.Calendar;

public class ContaPoupanca  extends ContaBancaria{
    private int diaRendimento;

    public ContaPoupanca() {
        
    }

    public ContaPoupanca(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public boolean calculaNovoSaldo(double taxaRendimento){
        Calendar hoje = Calendar.getInstance();

        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH))
        {
            //this.saldo += this.saldo * taxaRendimento;
            setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString(){
        return super.toString() + "\nDia rendimento: " + getDiaRendimento();
    }

}
