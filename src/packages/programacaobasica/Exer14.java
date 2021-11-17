package packages.programacaobasica;

import java.util.Locale;
import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = new Locale("pt");

        System.out.println("Digite o tamanho do arquivo em MB: ");
        double tamanhoArquivo = scan.useLocale(locale).nextDouble();
        System.out.println("Digite a velocidade da sua internet em mbps: ");
        double velocidadeInternet = scan.useLocale(locale).nextDouble();

        double velocidadeDownload = (tamanhoArquivo / velocidadeInternet) * 60;

        System.out.println("Levará "+ velocidadeDownload + " minuto para baixar o arquivo");
    }
}
