package packages.programacaobasica;

import java.util.Locale;
import java.util.Scanner;

public class CalculaSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = new Locale("pt");


        System.out.println("Digite o valor que você ganha por horas trabalhadas: ");
        double valorHorasTrabalhadas = scan.useLocale(locale).nextDouble();
        System.out.println("Digite a quantidade de horas trabalhas no mês: ");
        double qtdeHorasTrabalhadas = scan.useLocale(locale).nextDouble();

        System.out.println("Seu salário: R$" + valorHorasTrabalhadas * qtdeHorasTrabalhadas);
    }
}
