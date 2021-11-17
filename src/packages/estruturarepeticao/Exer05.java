package packages.estruturarepeticao;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale locale = new Locale("pt");
        DecimalFormat numDecimalFormat = new DecimalFormat("#.##");

        char resposta;
        boolean isContinue = false;
        double paisA; 
        double paisB;
        double taxaCrescimentoPaisA;
        double taxaCrescimentoPaisB;
        int anos = 0;


        do {
            System.out.print("Digite o tamanho da população do país A: ");
            paisA = scanner.useLocale(locale).nextDouble();
            System.out.print("E sua taxa de crescimento: ");
            taxaCrescimentoPaisA = scanner.useLocale(locale).nextDouble();
            System.out.print("Digite o tamanho da população do país B: ");
            paisB = scanner.useLocale(locale).nextDouble();
            System.out.print("E sua taxa de crescimento: ");
            taxaCrescimentoPaisB = scanner.useLocale(locale).nextDouble();
            
            
            while(paisA <= paisB){
                paisA += (( paisA * taxaCrescimentoPaisA) / 100);
                paisB += ((paisB * taxaCrescimentoPaisB) / 100);
                anos++;
                System.out.println("paisA " + numDecimalFormat.format(paisA) + "\npaisB " + numDecimalFormat.format(paisB) + "\n");
            }
    
            System.out.println(anos + " anos para a população do país A ultrapassar ou se igualar à população do país B");
            System.out.println("Deseja repitir a operação?");
            resposta = scanner.next().charAt(0);
            if(resposta != 's'){
                isContinue = true;
            }
            
        
        } while(!isContinue);

        

    }
}
