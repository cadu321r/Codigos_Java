## 📖 Gerenciador de Contatos em Java

Este projeto consiste no desenvolvimento de um **Gerenciador de Contatos** simplificado, utilizando a linguagem de programação **Java**. Ideal para quem busca eficiência e organização, este sistema permite a gestão de contatos profissionais e pessoais com facilidade e praticidade.

### 🌟 Funcionalidades Principais

- **👤 Adicionar Contato:** Facilita a inserção de novos contatos, expandindo sua rede.
- **🗑 Remover Contato:** Remove contatos existentes, mantendo sua lista atualizada.
- **🔍 Buscar Contato:** Busca rápida por nome, telefone ou email.
- **📋 Listar Contatos:** Visualiza todos os contatos salvos, oferecendo uma visão completa.

### 🛠️ Estrutura do Código

#### 📁 Classe `Contato`
Representa a base de um contato, implementando a interface `Interligar` para proporcionar informações gerais sobre o contato.

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
