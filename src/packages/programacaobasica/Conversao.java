package packages.programacaobasica;

import java.util.Locale;
import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = new Locale("pt");


        System.out.println("Digite o valor mensurado em metros: ");
        double valorMetros = scan.useLocale(locale).nextDouble();
        double valorCentimetros = valorMetros * 100;

        System.out.println("A conversão de " + valorMetros + "m para centimetros: " + valorCentimetros + "cm");

    }
}
