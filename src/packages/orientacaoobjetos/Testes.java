package packages.orientacaoobjetos;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {


        // Recursividade recursividade = new Recursividade();

        // int valor = recursividade.fatorial(5);

        // System.out.println("5! = "+valor);


        for(int i=0; i < 25; i++){
            System.out.print(Recursividade.fibonacci(i) + " " );
        }




        // Scanner scanner = new Scanner(System.in);
        // Locale locale = new Locale("pt");
        // ContaCorrente contaCorrente = new ContaCorrente();
        // System.out.print("Conta Corrente: ");
        // contaCorrente.numeroConta = scanner.next();
        // char resposta;
        // boolean isContinius = false;
        // int opcao;
        // double valor = 0;

        // do{
        //     System.out.println("Saque opção 1\nDepósito opção 2\nSelecione a operação: ");
        //     opcao = scanner.nextInt();
        //     switch(opcao){
        //         case 1:     
        //             System.out.println("Digite o valor para saque: ");
        //             valor = scanner.useLocale(locale).nextDouble();
        //             contaCorrente.sacar(valor);
        //             break;
        //         case 2:
        //             System.out.println("Digite um valor para depositar: ");
        //             valor = scanner.useLocale(locale).nextDouble();
        //             contaCorrente.depositar(valor);
        //             break;
        //         default:
        //             System.out.println("Opção inválida");

        //     }

        //     System.out.println("Deseja repitir alguma operação? Sim [s] ou Não [n]");
        //     resposta = scanner.next().charAt(0);
        //     if(resposta != 's'){
        //         isContinius = true;
        //     }

        // } while(!isContinius);
        


        // Livro livroDeLivraria = new Livro();

        // livroDeLivraria.autor = "Oscar Wilde";
        // livroDeLivraria.editora = "Scipione";
        // livroDeLivraria.categoria = "Terror/Suspense";
        // livroDeLivraria.dataLancamento = new Date(2013);
        // livroDeLivraria.nomeLivro = "O Fantasma de Canterville";
        // livroDeLivraria.quantidadePaginas = 120;
        // livroDeLivraria.preco = 50.00;

        // Livro livroDeBiblioteca = new Livro();

        // livroDeBiblioteca.autor = "Matheus Rocha";
        // livroDeBiblioteca.editora = "Planeta";
        // livroDeBiblioteca.categoria = "Crônica narrativa";
        // livroDeBiblioteca.dataLancamento = new Date(2019);
        // livroDeBiblioteca.nomeLivro = "Pressa de ser feliz";
        // livroDeBiblioteca.quantidadePaginas = 207;


    }
}
