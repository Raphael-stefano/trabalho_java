import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class Horario implements Comparable<Horario>{
    private LocalDateTime saida;
    private LocalDateTime chegada;

    public Horario(LocalDateTime saida, LocalDateTime chegada) {
        this.saida = saida;
        this.chegada = chegada;
        if (!this.validarHorario()) {
            throw new IllegalArgumentException("Horário inválido: saída deve ser antes da chegada.");
        }
    }
    
    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }

    public LocalDateTime getChegada() {
        return chegada;
    }

    public void setChegada(LocalDateTime chegada) {
        this.chegada = chegada;
    }

    public Duration calcularDuracao() {
        return Duration.between(saida, chegada);
    }

    public String formatarDataHora(LocalDateTime dataHora) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return dataHora.format(formatter);
    }

    public String printHorarios() {
        return "Saída: " + formatarDataHora(saida) + "\nChegada: " + formatarDataHora(chegada);
    }

    public boolean validarHorario() {
        return chegada.isAfter(saida);
    }

    public boolean verificarConflito(Horario outroHorario) {
        if (this.saida.isAfter(outroHorario.chegada) || this.chegada.isBefore(outroHorario.saida)) {
            return false;
        }
        return true;
    }
    @Override
    public int compareTo(Horario outro) {
        return this.saida.compareTo(outro.saida); // Compara os horários de saída
    }


}
