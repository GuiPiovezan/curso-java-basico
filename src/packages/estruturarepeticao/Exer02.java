package packages.estruturarepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        Locale locale = new Locale("pt");

        boolean isValid = false;
        String usuario;
        String senha;

        do{
            System.out.print("Digite seu usuário: ");
            usuario = scann.next();
            System.out.print("Digite sua senha: ");
            senha = scann.next();

            if(usuario.equalsIgnoreCase(senha)){
                System.out.println("A senha não pode ser igual ao valor informado em usuário. \nDigite uma nova senha");
            } else {
                isValid = true;
            }

        } while (!isValid);
    }
}
