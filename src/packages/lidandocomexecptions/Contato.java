package packages.lidandocomexecptions;

public class Contato {
    private static int contador = 0;

    private String nome;
    private String telefone;
    private String email;
    private int identificador;

    public Contato(){
        contador++;
        identificador = contador;
    }



    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public int getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        String s = "[";
        s += "Id: " + getIdentificador();
            s += ", Nome: " + getNome();
                s += ", Telefone: " + getTelefone();
                    s += ", E-mail: " + getEmail();
                        s += "]";
        return s;
    }

    
    
}
