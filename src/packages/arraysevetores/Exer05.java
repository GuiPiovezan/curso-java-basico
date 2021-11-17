package packages.arraysevetores;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int i;

        for(i = 0; i <= (vetorA.length - 1); i++){
            System.out.print("Digite a " + (i+1) + "º posição do arranjo: ");
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i] * i;
        }
        System.out.println("\n");
        for(i = 0; i<= vetorA.length - 1; i++){
            System.out.print("Na "+ (i+1) +"º posição o conteúdo do primeiro vetor "+vetorA[i]+" é o produto de " + i + " sendo "+vetorB[i]+"\n");
        }
    }
}
