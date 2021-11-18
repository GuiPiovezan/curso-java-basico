package packages.lidandocomexecptions;

import java.io.PrintStream;
import java.util.Scanner;

public class Teste {
    /**
     *
     */
    private static final PrintStream OUT = System.out;

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int opcao = ObterOpcaoMenu(scanner);
       operacoes(opcao, scanner);
    }

    public static String leInformacao(Scanner scanner, String msg){
        OUT.println(msg);
        String entrada = scanner.nextLine();
        return entrada;
    }

    public static int ObterOpcaoMenu(Scanner scanner){

        boolean entradaValida = false;
        int opcao = 3;

        while(!entradaValida){
            OUT.println("1- Consultar um contato\n2- Cadastrar um novo contato\n3- Sair\nDigite a opção: ");
            try {
                String entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada); 
                if(opcao == 1 || opcao == 2 || opcao == 3){
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada inválida");
                }
            } catch (Exception e) {
               OUT.println("Entrada inválida, digite novamente");
            }
        }
        
        
        return opcao;
    }

    public static void operacoes(int opcao, Scanner scanner){
        Agenda agenda = new Agenda();
        switch(opcao){
            case 1: 
                OUT.println("Consulta contato");
                String msg = "Digite o nome do Contato";
                String nome = leInformacao(scanner, msg);
                try{
                    if(agenda.consultaContato(nome) >= 0){
                        OUT.println("Contato existe");
                    }

                } catch(ContatoNaoExiste ex) {
                    ex.getMessage();
                }
                
            break;
            case 2: 
                OUT.println("Adiciona contato");
            break;
            case 3: 
                OUT.println("Saindo...");
                System.exit(0);
            break;
            default:
             OUT.println("Opção inválida!!");
        }
    }
}
