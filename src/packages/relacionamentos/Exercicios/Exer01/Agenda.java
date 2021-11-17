package packages.relacionamentos.Exercicios.Exer01;

public class Agenda {
    private String nomeAgenda;
    private Contato[] contatos;

    
    public String getNomeAgenda() {
        return nomeAgenda;
    }
    public void setNomeAgenda(String nome) {
        this.nomeAgenda = nome;
    }
    public Contato[] getContatos() {
        return contatos;
    }
    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    String getAllContatos(){
        String info = "\nAgenda: " + this.nomeAgenda;

        if(contatos != null){
            for(Contato contato : contatos){
                info += contato.getContato() + "\n";
            }
        }

        return info;
    }
   
}
