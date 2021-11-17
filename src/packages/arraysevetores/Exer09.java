package packages.arraysevetores;

import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorB.length];
        int i;

        for(i = 0; i <= (vetorA.length - 1); i++){
            System.out.print("Digite a " + (i+1) + "º posição do vetorA: ");
            vetorA[i] = scanner.nextInt();
        }

        for(i = 0; i <= (vetorB.length - 1); i++){
            System.out.print("Digite a " + (i+1) + "º posição do vetorB: ");
            vetorB[i] = scanner.nextInt();
        }

        for(i=0; i <= (vetorC.length - 1); i++){
            vetorC[i] = vetorA[i] / vetorB[i];
        }

        for ( i = 0; i <= (vetorC.length - 1); i++) {
            System.out.println("Na posição "+ (i+1));
            System.out.println("O conteúdo do vetorA é: "+vetorA[i]);
            System.out.println("O conteúdo do vetorB é: "+vetorB[i]);
            System.out.println("E o conteúdo do vetorC é a divisão de "+vetorA[i]+" / "+vetorB[i]+" = "+vetorC[i]+"\n");
        }
    }
}
