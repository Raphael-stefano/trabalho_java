public class Passageiro extends Viajante{
    protected String nome, cpf;
    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }

}
