```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao;
        do {
            System.out.println("\n      Menu:       ");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Remover Contato");
            System.out.println("3. Buscar Contato");
            System.out.println("4. Listar Contatos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada
            switch (opcao) {
                case 1:
                    System.out.println("Adicionar Contato:");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Tipo (P - Pessoal, Pr - Profissional, C - Contato normal): ");
                    String tipo = scanner.nextLine();
                    Contato novoContato;
                    if (tipo.equalsIgnoreCase("P")) {
                        System.out.print("Endereço: ");
                        String endereco = scanner.nextLine();
                        System.out.print("Data de Aniversário: ");
                        String dataAniversario = scanner.nextLine();
                        novoContato = new ContatoPessoal(nome, email, telefone, endereco, dataAniversario);
                    } else if (tipo.equalsIgnoreCase("Pr")) {
                        System.out.print("Empresa: ");
                        String empresa = scanner.nextLine();
                        System.out.print("Cargo: ");
                        String cargo = scanner.nextLine();
                        novoContato = new ContatoProfissional(nome, email, telefone, empresa, cargo);
                    } else {
                        novoContato = new Contato(nome, email, telefone);
                    }
                    agenda.addContato(novoContato);
                    System.out.println("Contato adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Remover Contato:");
                    System.out.print("Informe o nome, telefone ou email do contato: ");
                    String chaveRemover = scanner.nextLine();
                    boolean removido = agenda.removerContato(chaveRemover);
                    if (removido) {
                        System.out.println("Contato removido com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Buscar Contato:");
                    System.out.print("Informe o nome, telefone ou email do contato: ");
                    String chaveBuscar = scanner.nextLine();
                    Contato contatoBusca = agenda.buscarContato(chaveBuscar);
                    if (contatoBusca != null) {
                        System.out.println("Contato encontrado:");
                        if (contatoBusca instanceof ContatoProfissional) {
                            ContatoProfissional contatoProfissional = (ContatoProfissional) contatoBusca;
                            System.out.println("Nome: " + contatoProfissional.getName() + " Email: " + contatoProfissional.getEmail() + " Telefone: " + contatoProfissional.getTelefone() + " Cargo: " + contatoProfissional.getCargo() + " Empresa: " + contatoProfissional.getEmpresa());
                        } else if (contatoBusca instanceof ContatoPessoal) {
                            ContatoPessoal contatoPessoal = (ContatoPessoal) contatoBusca;
                            System.out.println("Nome: " + contatoPessoal.getName() + " Email: " + contatoPessoal.getEmail() + " Telefone: " + contatoPessoal.getTelefone() + " Endereço: " + contatoPessoal.getEndereco() + " Data de Aniversário: " + contatoPessoal.getDataAniversario());
                        } else {
                            System.out.println("Nome: " + contatoBusca.getName() + " Email: " + contatoBusca.getEmail() + " Telefone: " + contatoBusca.getTelefone());
                        }
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Listar Contatos:");
                    if(agenda.listaC.size() > 0){
                        agenda.listarContatos();
                    }
                    else{
                        System.out.println("Não tem contatos para listar.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 5);
        scanner.close();
    }
}
```