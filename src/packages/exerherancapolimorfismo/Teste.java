package packages.exerherancapolimorfismo;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale locale = new Locale("pt");
        ContaEspecial contaEspecial = new ContaEspecial();
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        String resposta;
        double valor = 0;
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite a conta: ");
        String conta = scanner.nextLine();
        boolean isContinus = false;
        
        contaPoupanca.setNomeCliente(nomeCliente);
        contaPoupanca.setNumConta(conta);
        contaPoupanca.setSaldo(0);
        contaPoupanca.setDiaRendimento(16);
        contaEspecial.setLimite(1000.00);

        do{
            
            System.out.print("Digite 1 para saque \nDigite 2 para depósito \nDigite 3 para conta \nDigite 4 para rendimento \nDigite: ");
            String resultado = scanner.next();

            switch(resultado){
                case "1": 
                    System.out.print("Digite o valor desejado para saque: ");
                    valor = scanner.useLocale(locale).nextDouble();
                    contaPoupanca.sacar(valor);
                    break;
                case "2": 
                    System.out.print("Digite um valor para depósito: ");
                    valor = scanner.useLocale(locale).nextDouble();
                    contaPoupanca.depositar(valor);
                    break;
                case "3":
                    System.out.println(contaPoupanca.toString());
                    break;
                case "4":
                    if(contaPoupanca.calculaNovoSaldo(0.5)){
                        System.out.println("Rendimento 0,5% com novo saldo de " + contaPoupanca.getSaldo());
                    } else {
                        System.out.println("Hoje não é dia de rendimento");
                    }
                    break;
                default: 
                    System.out.println("Opção inválida!!");

            }

            System.out.print("\nDeseja realizar outra operação?\nDigite sua resposta: ");
            resposta = scanner.next();
            if(!resposta.equalsIgnoreCase("s")){
                isContinus = true;
            } 

        } while (!isContinus);


    }
}
