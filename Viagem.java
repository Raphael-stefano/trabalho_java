import java.util.ArrayList;
//import java.util.Collections;

public class Viagem implements Comparable<Viagem>{
    protected int idViagem = 24;
    protected Rota rota;
    protected Horario horario;
    protected Motorista motorista;
    protected Onibus onibus;
    protected ArrayList<Passageiro> passageiros = new ArrayList<>();
    protected Boolean executada = false;
    public Viagem(Rota rota, Horario horario, Motorista motorista, Onibus onibus) {
        this.rota = rota;
        this.horario = horario;
        this.motorista = motorista;
        this.onibus = onibus;
    }
    public Rota getRota() {
        return rota;
    }
    public Horario getHorario() {
        return horario;
    }
    public Motorista getMotorista() {
        return motorista;
    }
    public Onibus getOnibus() {
        return onibus;
    }
    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }
    public Boolean getExecutada() {
        return executada;
    }
    public void setRota(Rota rota) {
        this.rota = rota;
    }
    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }
    public void executarViagem(){
        this.executada = true;
    }
    @Override
    public int compareTo(Viagem outra) {
        return this.horario.compareTo(outra.horario); // Compara os horários de saída
    }
    public void adicionarPassageiro(Passageiro passageiro){
        this.passageiros.add(passageiro);
    }
}
