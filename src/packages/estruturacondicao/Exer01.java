package packages.estruturacondicao;

import java.util.Locale;
import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        Locale locale = new Locale("pt");
        System.out.println("Digite o primeiro número");
        double primeiroNumero = scann.useLocale(locale).nextDouble();
        System.out.println("Digite o segundo número");
        double segundoNumero = scann.useLocale(locale).nextDouble();

        if(primeiroNumero > segundoNumero){
            System.out.println(primeiroNumero + " é maior que " + segundoNumero);
        } else {
            System.out.println(segundoNumero + " é maior que " + primeiroNumero);
        }
    }
}
