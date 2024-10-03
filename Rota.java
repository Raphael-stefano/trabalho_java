import java.util.ArrayList;

public class Rota{
    protected String terminalSaida, terminalChegada;
    ArrayList<String> terminalCaminho = new ArrayList<>();
    
    public Rota(String terminalSaida, String terminalChegada, ArrayList<String> terminalCaminho) {
        this.terminalSaida = terminalSaida;
        this.terminalChegada = terminalChegada;
        this.terminalCaminho = terminalCaminho;
    }

    public String getTerminalSaida() {
        return terminalSaida;
    }

    public void setTerminalSaida(String terminalSaida) {
        this.terminalSaida = terminalSaida;
    }

    public String getTerminalChegada() {
        return terminalChegada;
    }

    public void setTerminalChegada(String terminalChegada) {
        this.terminalChegada = terminalChegada;
    }

    public ArrayList<String> getTerminalCaminho() {
        return terminalCaminho;
    }

    public void setTerminalCaminho(ArrayList<String> terminalCaminho) {
        this.terminalCaminho = terminalCaminho;
    } 

    public String printTerminalCaminho() {
        return String.join(" - ", this.terminalCaminho);
    }
    

    public void adicionarParadaCaminho(String terminal, int posicao){
        this.terminalCaminho.add(posicao, terminal);
    }
}