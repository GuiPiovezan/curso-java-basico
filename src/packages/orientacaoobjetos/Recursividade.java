package packages.orientacaoobjetos;

public class Recursividade {
    private int numero;

    int fatorial(int numero){

        if(numero == 0)
            return 1;

        return numero * fatorial(numero - 1);
    }

    public static int fibonacci(int numero){

        if(numero < 2){
            return 1;
        }

        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }
}
