package packages.matrizes;

import java.text.DecimalFormat;
import java.util.Random;

public class Exer02 {
    public static void main(String[] args) {
        Random random = new Random();
        DecimalFormat numeroFormatado = new DecimalFormat("#.#");

        double[][] numerosAleatorios = new double[10][10];
        int i, j;
        double[] maiores = new double[2];
        double[] menores = new double[2];

        menores[0] = 9.9;
        menores[1] = 9.9;

        int linha5 = 5;
        int coluna7 = 7;


        for(i=0; i<numerosAleatorios.length; i++){
            for(j=0; j<numerosAleatorios.length; j++){
                numerosAleatorios[i][j] = random.nextDouble() * 9;
            }
        }

        for(i=0; i<numerosAleatorios.length; i++){
            System.out.println("\nLinha " + i);
            for(j=0; j<numerosAleatorios.length; j++){
                System.out.println("Coluna " + j + " conteúdo " + numeroFormatado.format(numerosAleatorios[i][j]));
            }
        }

        for(i=5; i <= linha5; i++){
            for(j=0; j<numerosAleatorios.length; j++){
               if(maiores[0] < numerosAleatorios[i][j]){
                    maiores[0] = numerosAleatorios[i][j];
               }
               if(menores[0] > numerosAleatorios[i][j]){
                   menores[0] = numerosAleatorios[i][j];
               }
            }
        }  

        for(i=0; i < numerosAleatorios.length; i++){
            for(j=coluna7; j<= coluna7; j++){
               if(maiores[1] < numerosAleatorios[i][j]){
                    maiores[1] = numerosAleatorios[i][j];
               }
               if(menores[1] > numerosAleatorios[i][j]){
                   menores[1] = numerosAleatorios[i][j];
               }
            }
        }  

        System.out.println(
            "\nNa linha 5, o maior valor é "+numeroFormatado.format(maiores[0])+ " e o menor é " + numeroFormatado.format(menores[0]) + 
            "\nNa coluna 7, o maior valor é "+numeroFormatado.format(maiores[1])+ " e o menor é " + numeroFormatado.format(menores[1])
        );

    }
}
