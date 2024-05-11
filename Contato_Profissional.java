<<<<<<< HEAD
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
=======
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
>>>>>>> 2181dbb68489f82342a41a2e757b8ec49f33a5fc
