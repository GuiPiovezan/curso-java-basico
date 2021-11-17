import java.util.Scanner;
import java.util.Locale;

public class LeituraDadosTeclado{
    public static void main(String[] args) {

        Locale locale = new Locale("pt");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println(nomeCompleto);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite o valor do produto: ");
        double valorProduto = scanner.useLocale(locale).nextDouble();
        System.out.println("Valor do produto" + valorProduto);



    }
}

