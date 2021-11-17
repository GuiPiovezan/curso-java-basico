package packages.programacaobasica;

import java.util.Locale;
import java.util.Scanner;

public class MediaNotas
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = new Locale("pt");


        System.out.println("Digite as notas do aluno (4 notas): ");
        double nota1 = scan.useLocale(locale).nextDouble();
        double nota2 = scan.useLocale(locale).nextDouble();
        double nota3 = scan.useLocale(locale).nextDouble();
        double nota4 = scan.useLocale(locale).nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Média: " + media);
    }
}