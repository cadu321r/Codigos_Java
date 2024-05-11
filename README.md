## 📖 Gerenciador de Contatos em Java


![Badge](https://img.shields.io/badge/Version-0.1.0-%237159c1?style=for-the-badge&logo=github) 

## 👀 Desenvolvedores
<table>
  <tr>
    <td align="center"><a href="[https://github.com/natorjunior](https://github.com/cadu321r)"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/154270394?v=4" width="100px;" alt=""/><br /><sub><b>Carlos Eduardo</b></sub></a><br /><a href="[https://github.com/natorjunior](https://github.com/cadu321r)" title="Carlos Eduardo">👨‍🚀</a></td>
</table>
<br>

Este projeto consiste no desenvolvimento de um **Gerenciador de Contatos** simplificado, utilizando a linguagem de programação **Java**. Ideal para quem busca eficiência e organização, este sistema permite a gestão de contatos profissionais e pessoais com facilidade e praticidade.

### 🌟 Funcionalidades Principais

- **👤 Adicionar Contato:** Facilita a inserção de novos contatos, expandindo sua rede.
- **🗑 Remover Contato:** Remove contatos existentes, mantendo sua lista atualizada.
- **🔍 Buscar Contato:** Busca rápida por nome, telefone ou email.
- **📋 Listar Contatos:** Visualiza todos os contatos salvos, oferecendo uma visão completa.

### 🛠️ Estrutura do Código

#### 📁 Classe `Contato`
> Representa a base de um contato, implementando a interface `Interligar` para proporcionar informações gerais sobre o contato.

```java
class Contato implements Interligar {
    private String name;
    private String email;
    private String telefone;

    // Construtor
    Contato(String name, String email, String telefone){
        this.name = name;
        this.email = email;
        this.telefone = telefone;
    }

    // Métodos de acesso
    String getName() {
        return name;
    }

    String getEmail() {
        return email;
    }

    String getTelefone() {
        return telefone;
    }

    // Método implementado da interface
    @Override
    public void informacao() {
        System.out.println("Contatos Gerais");
    }
}
```
#
#### 📁 Classe `Contato Profissional`
> Representa a base de um Contato Profissional, herdando a classe `Contato` as características de um contato básico e ter adicionais.

```java
class ContatoProfissional extends Contato{
    private String empresa;
    private String cargo;
    
    // Construtor
    ContatoProfissional(String name, String email, String telefone, String empresa, String cargo){
        super(name, email, telefone);
        this.empresa = empresa;
        this.cargo = cargo;
    }
    
    String getEmpresa(){
        return empresa;
    }
    
    String getCargo(){
        return cargo;
    }
    
    // Método implementado da interface
    @Override
    public void informacao(){
        System.out.println("Contatos Profissionais");
    }
}
```
#
#### - 📁 Classe `Contato Pessoal`
> Representa a base de um Contato Pessoal, herdando da base `Contato` as características básica de um contato comum, e tendo adicionais de um contato pessoal. 

```java
class ContatoPessoal extends Contato{
    private String endereco;
    private String dataAniversario;
    
    // construtor
    ContatoPessoal(String name, String email, String telefone, String endereco, String dataAniversario){
        super(name, email, telefone);
        this.endereco = endereco;
        this.dataAniversario = dataAniversario;
    }
    
    String getEndereco(){
        return endereco;
    }
    
    String getDataAniversario(){
        return dataAniversario;
    }
    
    // Método implementado da interface
    @Override
    public void informacao(){
        System.out.println("Contatos Pessoais");
    }
}
```
#
#### - 📁 Classe `Agenda`
> Representa a `estrutura` das fucionalidades principais do projeto.

```java
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
```
#
#### - 📁 Classe `Interligar`
> Interface para proporcionar informações gerais sobre o contato.

```java
interface Interligar{
    void informacao();
}
```
#
#### - 📁 Classe `Main`
> Classe principal, que contém o método `Main` que execulta o código por completo.

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
