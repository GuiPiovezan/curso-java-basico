package packages.estruturacondicao;
import java.util.Locale;
import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        Locale locale = new Locale("pt");
        System.out.println("Digite um número para descobiri se é positivo ou negativo: ");
        double numeroDigitado = scann.useLocale(locale).nextDouble();
        
        if(numeroDigitado >= 0){
            System.out.println(numeroDigitado + " é positivo!");
        } else {
            System.out.println(numeroDigitado + " é negativo");
        }
    }
}
