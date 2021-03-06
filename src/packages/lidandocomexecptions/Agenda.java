package packages.lidandocomexecptions;

public class Agenda {
    private Contato[] contatos;

    public Agenda(){
        contatos = new Contato[5];
    }

    public void adicionarContato(Contato contato) throws AgendaCheiaException{

        boolean cheia = true;

        for(int i=0; i < contatos.length; i++){
            if(contatos[i] != null){
                contatos[i] = contato;
                cheia = false;
            }
        }

        if(cheia){
            throw new AgendaCheiaException();
        }
    }

    public int consultaContato(String nome) throws ContatoNaoExiste{
        for(int i = 0; i < contatos.length; i++){
            if(contatos[i] != null){
                if(contatos[i].getNome().equalsIgnoreCase(nome)){
                    return i;
                }
            }
        }
        throw new ContatoNaoExiste(nome);
    }

    @Override
    public String toString() {
        String s = "";
        for (Contato contato : contatos) {
            s += contato.toString() + "\n";
        }

        return s;
    }
    
}
