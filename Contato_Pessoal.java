<<<<<<< HEAD
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
=======
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
>>>>>>> 2181dbb68489f82342a41a2e757b8ec49f33a5fc
