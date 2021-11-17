package packages.programacaobasica;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = new Locale("pt");
        DecimalFormat numeroFormatado = new DecimalFormat("#.##");

        System.out.println("Conversão Fahrenheit para Célsius");
        System.out.println("Temp. F: ");
        double farenheit = scan.useLocale(locale).nextDouble();
        double celsius = (5 * (farenheit - 32) / 9);
        System.out.println("Temp. C: " + numeroFormatado.format(celsius));

        System.out.println("Conversão Célsius para Fahrenheit");
        System.out.println("Temp. C: ");
        celsius = scan.useLocale(locale).nextDouble();
        farenheit = (celsius * 9/5) + 32;
        System.out.println("Temp. F: " + numeroFormatado.format(farenheit));
        
    }
}
