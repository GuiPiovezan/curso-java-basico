package packages.matrizes;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale locale = new Locale("pt");

        double[][] matriz = new double[3][3];
        int i, j;
        int quantidadePares = 0, quantidadeImpares = 0;

        for(i=0; i < matriz.length; i++){
            System.out.println("\nLinha "+i);
            for(j = 0; j < matriz.length; j++){

                System.out.println("Digite o valor da coluna "+j);
                matriz[i][j] = scanner.useLocale(locale).nextDouble();
            }
        }

        for(i=0; i < matriz.length; i++){
            System.out.println("\nLinha "+i);
            for(j = 0; j < matriz.length; j++){
                System.out.println("Coluna "+i+" conteúdo "+matriz[i][j]);
            }
        }

        for(i=0; i < matriz.length; i++){
            for(j = 0; j < matriz.length; j++){
                if(matriz[i][j] % 2 == 0)
                    quantidadePares++;
                else
                    quantidadeImpares++;
            }
        }

        System.out.println("\nQuantidade de pares: "+quantidadePares+ "\nQuantidade de ímpares: "+quantidadeImpares);

    }
}
