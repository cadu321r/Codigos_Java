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
