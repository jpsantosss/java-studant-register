package cadastroestudante;

public class Estudante {
    private String matricula;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    
    public Estudante(String matricula, String nome, String email, String telefone, String endereco){
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    /*------------------------------------------*/
    
    public String obterMatricula(){
        return matricula;
    }
    
    public String obterNome(){
        return nome;
    }
    
    public String obterEmail(){
        return email;
    }
    
    public String obterTelefone(){
        return telefone;
    }
    
    public String obterEndereco(){
        return endereco;
    }
    
    /*------------------------------------------*/
    
    public void atualizarMatricula(){
        this.matricula = matricula;
    }
    
    public void atualizarNome(){
        this.nome = nome;
    }
    
    public void atualizarEmail(){
        this.email = email;
    }
    
    public void atualizarTelefone(){
        this.telefone = telefone;
    }
    public void atualizarEndereco(){
        this.endereco = endereco;
    }
}