package packages.estruturarepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        Locale locale = new Locale("pt");

        boolean isValid = true;
        boolean invalid = false;
        boolean valid = true;
        String nome;
        int idade;
        double salario;
        char sexo;
        char civil;

        do{
            System.out.print("Digite seu nome: ");
            nome = scann.next();
            if(nome.length() < 3){
                System.out.println("Para um nome válido, digite mais de dois caracteres");
                isValid = invalid;
            }
            else {
                isValid = valid;
            }
        } while (isValid == invalid);


        do{
            System.out.print("Digite sua idade: ");
            idade = scann.nextInt();
            if(idade < 1 || idade > 149){
                System.out.println("Você não acha que está muito velho não? Digite novamente: ");
                isValid = false;
            } else {
                isValid = true;
            }
        } while (isValid == false);
            
            
        do{
            System.out.print("Digite seu salário: ");
            salario = scann.useLocale(locale).nextDouble();
            if(salario < 1){
                System.out.print("Você tem que receber pelo menos algumas coisa!!");
                isValid = true;
            } else {
                isValid = false;
            }
        } while (isValid);

        do{
            System.out.print("Digite seu sexo: ");
            sexo = scann.next().charAt(0);
            if(sexo != 'f' || sexo != 'm'){
                System.out.println("Sexo inválido!");
                isValid = true;
            } else {
                isValid = false;
            }
        } while (isValid);

        do{
            System.out.print("Digite seu estado civil: ");
            civil = scann.next().charAt(0);
            if(civil != 's' || civil != 'c' || civil != 'v' || civil != 'd'){
                System.out.println("Opção inválida");
                isValid = true;
            } else {
                isValid = false;
            }
        } while (isValid);



            
            
    }
}
