package packages.matrizes;

import java.text.DecimalFormat;
import java.util.Random;

public class Exer01{
    public static void main(String[] args) {
        Random random = new Random();
        DecimalFormat numeroFormatado = new DecimalFormat("#.#");

        double[][] numerosAleatorios = new double[4][4];
        int i, j;
        double maior = 0;
        int linha = 0;
        int coluna = 0;


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

        for(i=0; i<numerosAleatorios.length; i++){
            for(j=0; j<numerosAleatorios.length; j++){
                if(maior < numerosAleatorios[i][j]){
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }  

        System.out.println("\nO maior número da matriz, que está na linha " + linha + " e coluna " + coluna + ", é " + numeroFormatado.format(maior));
    }
}