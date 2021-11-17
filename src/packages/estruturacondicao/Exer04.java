package packages.estruturacondicao;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        Locale locale = new Locale("pt");
        System.out.println("Digite uma letra, e será classificada como volga ou consoante:  ");
        char letraDigitada = scann.next().charAt(0);
        if(letraDigitada == 'a' || letraDigitada == 'e' || letraDigitada == 'i' || letraDigitada == 'o' || letraDigitada == 'u') {
            System.out.println(letraDigitada + " é uma volgal");
        } else {
            System.out.println(letraDigitada + " é uma consoante");
        }
    }
}
