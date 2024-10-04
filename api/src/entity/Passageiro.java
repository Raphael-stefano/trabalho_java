package entity;

public class Passageiro {
    private int id_passageiro;
    private String nome;
    private String cpf;
    private int id_cidade;
    private char sexo;
    private String telefone;
    private String email;
    private String senha;
    public Passageiro(String nome, String cpf, int id_cidade, char sexo, String telefone,
            String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.id_cidade = id_cidade;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }
    public int getId_passageiro() {
        return id_passageiro;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public int getId_cidade() {
        return id_cidade;
    }
    public char getSexo() {
        return sexo;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha(){
        return senha;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setId_cidade(int id_cidade) {
        this.id_cidade = id_cidade;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
