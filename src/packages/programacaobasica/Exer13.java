package packages.programacaobasica;

import java.util.Locale;
import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = new Locale("pt");


        System.out.println("Digite o valor que você ganha por horas trabalhadas: ");
        double valorHorasTrabalhadas = scan.useLocale(locale).nextDouble();
        System.out.println("Digite a quantidade de horas trabalhas no mês: ");
        double qtdeHorasTrabalhadas = scan.useLocale(locale).nextDouble();

        double salarioBruto = valorHorasTrabalhadas *qtdeHorasTrabalhadas;
        double descontoIR = ( salarioBruto * 1.11) - salarioBruto;
        double descontoINSS = ( salarioBruto * 1.08) - salarioBruto;
        double descontoSindicato = (salarioBruto * 1.05) - salarioBruto;
        double salarioLiquido = (salarioBruto - descontoINSS - descontoSindicato - descontoIR);

        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Desconto do IR: " + descontoIR);
        System.out.println("Desconto do INSS: " + descontoINSS);
        System.out.println("Desconto Sindicato: " + descontoSindicato);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}
