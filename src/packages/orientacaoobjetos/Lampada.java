package packages.orientacaoobjetos;

public class Lampada {
    String marca;
    double preco;
    int    tensao;
    double vidaUtil;
    String cor;
    String[] tipos;


    void ligar(){
        System.out.println("Lâmpada ligada");
    }

    void desligar(){
        System.out.println("Lâmpada desligada");
    }
}
