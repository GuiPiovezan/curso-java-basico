package packages.estruturarepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        Locale locale = new Locale("pt");

        boolean isValid = false;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            double nota = scann.useLocale(locale).nextDouble();
            if(nota < 0 || nota > 10){
                System.out.println("Nota incorreta! Digite novamente");
            } else {
                isValid = true;
            }
        } while(!isValid);

    }
}
