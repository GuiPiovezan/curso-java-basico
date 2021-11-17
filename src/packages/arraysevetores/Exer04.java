package packages.arraysevetores;

import java.util.Scanner;
import java.math.*;
import java.text.DecimalFormat;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        DecimalFormat numeroFormatado = new DecimalFormat("#.##");

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];
        int i;

        for(i = 0; i <= (vetorA.length - 1); i++){
            System.out.print("Digite a " + (i+1) + "º posição do arranjo: ");
            vetorA[i] = scanner.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        System.out.println("\n");
        for(i = 0; i<= vetorA.length - 1; i++){
            System.out.print("Na "+ (i+1) +"º posição o conteúdo do primeiro vetor "+vetorA[i]+" é a raíz quadrado do segundo "+numeroFormatado.format(vetorB[i])+"\n");
        }
    }
}
