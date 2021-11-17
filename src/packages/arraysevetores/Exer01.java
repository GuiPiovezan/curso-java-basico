package packages.arraysevetores;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        int vetorA[] = new int[5];
        int vetorB[] = new int[5];
        int i;

        for(i = 0; i <= (vetorA.length - 1); i++){
            System.out.print("Digite o " + (i+1) + "º do arranjo: ");
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i];
        }

        for(i = 0; i<= vetorA.length - 1; i++){
            System.out.print("Conteúdo do primeiro vetor "+vetorA[i]+" igual ao segundo "+vetorB[i]+"\n");
        }

        
    }
}
