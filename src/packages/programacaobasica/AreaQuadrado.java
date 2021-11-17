package packages.programacaobasica;

import java.util.Locale;
import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = new Locale("pt");
        
        System.out.println("Vamos calcular a área de um quadrado e exibir o dobro logo em seguida \nDigite o lado do quadrado: ");

        double ladoQuadrado = scan.useLocale(locale).nextDouble();

        double areaQuadrado = ladoQuadrado * ladoQuadrado;

        System.out.println("Área do quadrado: " + areaQuadrado + " e o seu dobro é " + areaQuadrado * 2);
    }
}
