package packages.arraysevetores;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int vetorA[] = new int[15];
        int vetorB[] = new int[15];
        int i;

        for(i = 0; i <= (vetorA.length - 1); i++){
            System.out.print("Digite a " + (i+1) + "º posição do arranjo: ");
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i] * vetorA[i];
        }
        System.out.println("\n");
        for(i = 0; i<= vetorA.length - 1; i++){
            System.out.print("Na "+ (i+1) +"º posição o conteúdo do segundo vetor "+vetorB[i]+" é o quadrado do primeiro "+vetorA[i]+"\n");
        }
    }
}
