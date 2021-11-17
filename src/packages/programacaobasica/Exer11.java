package packages.programacaobasica;

import java.util.Locale;
import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        Locale locale = new Locale("pt");

        System.out.println("Entre com dois número inteiros ( ..., -2, -1, 0, 1, 2, ...) \ne com um número real");
        int primeiroNumero = scann.nextInt();
        int segundoNumero = scann.nextInt();
        double terceiroNumero = scann.useLocale(locale).nextDouble();

        System.out.println("A - " + (primeiroNumero * 2) * (segundoNumero / 2));
        System.out.println("B - " + ((primeiroNumero * 3) + terceiroNumero));
        System.out.println("C - " + Math.pow(terceiroNumero, 3));
    }
}
