package packages.programacaobasica;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = new Locale("pt");
        DecimalFormat numeroFormatado = new DecimalFormat("#.##");

        System.out.println("Digita sua altura: ");
        double altura = scan.useLocale(locale).nextDouble();

        double pesoIdeal = ((72.7 *altura) - 58);

        System.out.println("Altura de " + altura + "m\nPeso ideal: " + numeroFormatado.format(pesoIdeal) + "Kg");
    }
}
