package packages.programacaobasica;

import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class AreaCirculo {
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = new Locale("pt");
        DecimalFormat numeroFormatado = new DecimalFormat("#.##");


        System.out.println("Digite o raio da circunferência: ");
        double raioCircunferencia = scan.useLocale(locale).nextDouble();
        double areaCircunferencia = Math.PI * Math.pow(raioCircunferencia, 2);

        System.out.println("A área do círculo: " + numeroFormatado.format(areaCircunferencia));
    }
}
