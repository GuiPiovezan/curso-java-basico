package packages.relacionamentos.Exercicios.Exer01;

import java.io.IOException;
import java.util.Scanner;

public class Testes {
    public static void main(String[] args) throws IOException, InterruptedException {

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        
        Contato[] contatos = new Contato[3];

        String nome, email, telefone;

        System.out.print("Digite o nome da agenda: ");
        agenda.setNomeAgenda(scanner.nextLine());

        for(int i = 0; i<contatos.length; i++){
            Contato contato = new Contato();
            System.out.println("\nInformações do "+(i+1)+"º contato");
            System.out.print("Digite seu nome: ");
            nome = scanner.nextLine();
            contato.setNome(nome);
            System.out.print("Digite seu e-mail: ");
            email = scanner.nextLine();
            contato.setEmail(email);
            System.out.print("Digite seu telefone: ");
            telefone = scanner.nextLine();
            contato.setTelefone(telefone);
            contatos[i] = contato;
        }

        agenda.setContatos(contatos);


        if(agenda != null){
           System.out.println(agenda.getAllContatos());
        }


    }
}
