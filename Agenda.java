import java.util.ArrayList;
import java.util.List;

class Agenda{
    List <Contato> listaC;
    Agenda(){
        listaC = new ArrayList<>();
    }
    
    void addContato(Contato contato){
        listaC.add(contato);
    }
    
    boolean removerContato(String name){
        for(Contato contato : listaC){
            if(contato.getName().equals(name)){
                System.out.println(contato.getName() + " " + contato.getTelefone() + " " + contato.getEmail());
                listaC.remove(contato);
                return true;
            }
        }
        return false;
    }
    
    Contato buscarContato(String x){
        for(Contato contato : listaC){
            if(contato.getName().equalsIgnoreCase(x) || contato.getTelefone().equals(x) || contato.getEmail().equals(x)){
                return contato;
            }
        }
        return null;
    }
    
    void listarContatos() {
        for (Contato item : listaC) {
            if (item instanceof ContatoProfissional) {
                ContatoProfissional contatoProfissional = (ContatoProfissional) item;
                System.out.println("Nome: " + contatoProfissional.getName() + " Email: " + contatoProfissional.getEmail() + " Telefone: " + contatoProfissional.getTelefone() + " Cargo: " + contatoProfissional.getCargo() + " Empresa: " + contatoProfissional.getEmpresa());
            } else if (item instanceof ContatoPessoal) {
                ContatoPessoal contatoPessoal = (ContatoPessoal) item;
                System.out.println("Nome: " + contatoPessoal.getName() + " Email: " + contatoPessoal.getEmail() + " Telefone: " + contatoPessoal.getTelefone() + " Endereço: " + contatoPessoal.getEndereco() + " Data de Aniversário: " + contatoPessoal.getDataAniversario());
            } else {
                System.out.println("Nome: " + item.getName() + " Email: " + item.getEmail() + " Telefone: " + item.getTelefone());
            }
        }
    }
}