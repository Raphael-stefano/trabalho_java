import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.time.LocalDateTime;

public class Testes {
    public static void main(String[] args){
        Horario horarioTeste = new Horario(LocalDateTime.of(2024, 10, 5, 16, 30), LocalDateTime.of(2024, 10, 5, 19, 45));
        //System.out.println(horarioTeste.printHorarios());
        //System.out.println(horarioTeste.calcularDuracao().toString());
        //System.out.println(horarioTeste.verificarConflito(new Horario(LocalDateTime.of(2024, 10, 5, 14, 30), LocalDateTime.of(2024, 10, 5, 21, 45))));

        String terminal1 = "Campos dos Goytacazes";
        String terminal2 = "Macaé";
        String terminal3 = "Cabo Frio";
        String terminal4 = "Niterói";
        String terminal5 = "Rio de Janeiro";
        ArrayList<String> caminhoCamposRio = new ArrayList<>(Arrays.asList(terminal2, terminal3, terminal4));
        Rota camposRio = new Rota(terminal1, terminal5, caminhoCamposRio);
        //System.out.println(camposRio.getTerminalSaida() + " - " + camposRio.getTerminalChegada());
        //System.out.println(camposRio.printTerminalCaminho());
        /*camposRio.adicionarParadaCaminho("Petrópolis", 2);
        System.out.println(camposRio.printTerminalCaminho());*/

        Passageiro pass = new Passageiro("Pedro", "123.456.789-10");
        Motorista moto = new Motorista("Vitor", "987.654.321-01");
        Onibus buzao = new Onibus("ava-0101", "monster truck", 50);
        Viagem travel = new Viagem(camposRio, horarioTeste, moto, buzao);
        pass.marcarViagem(travel);

        //System.out.println(pass.obterProximaViagem().getRota().getTerminalChegada());

        
    }
}
