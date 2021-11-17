package packages.estruturacondicao;

import java.util.Locale;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        Locale locale = new Locale("pt");
        System.out.println("Digite seu sexo, sendo [f - Feminino] e [m - Masculino]: ");
        char sexoDigitado = scann.next().charAt(0);

        switch(sexoDigitado){
            case 'f':
            case 'F': 
                System.out.println("Femino");
                break;
            case 'm':
            case 'M':
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
