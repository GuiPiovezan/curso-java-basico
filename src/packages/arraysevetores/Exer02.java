package packages.arraysevetores;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int vetorA[] = new int[8];
        int vetorB[] = new int[8];
        int i;

        for(i = 0; i <= (vetorA.length - 1); i++){
            System.out.print("Digite a " + (i+1) + "º posição do arranjo: ");
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }
        System.out.println("\n");
        for(i = 0; i<= vetorA.length - 1; i++){
            System.out.print("Conteúdo do segundo vetor "+vetorB[i]+" é o dobro do primeiro "+vetorA[i]+" na"+ (i+1) +"º posição\n");
        }
    }
}
