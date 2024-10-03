import java.util.ArrayList;
import java.util.Collections;

public class Viajante {
    protected ArrayList<Viagem> viagensMarcadas, viagensRealizadas;
    protected ArrayList<Horario> horariosViagensMarcadas, horariosviagensRealizadas;
    public Viajante(){
        this.viagensMarcadas = new ArrayList<>();
        this.viagensRealizadas = new ArrayList<>();
        Collections.sort(viagensMarcadas);
        Collections.sort(viagensRealizadas);
    }

    public void marcarViagem(Viagem viagem){
        viagensMarcadas.add(viagem);
        //Collections.sort(viagensMarcadas.getHorario());
    }

    public void cancelarViagem(Viagem viagem){
        viagensMarcadas.remove(viagem);
    }

    public ArrayList<Horario> obterHorariosViagensMarcadas(){
        ArrayList<Horario> retorno = new ArrayList<>();
        for(int i = 0; i < this.viagensMarcadas.size(); i++){
            retorno.add(this.viagensMarcadas.get(i).getHorario());
        }
        return retorno;
    }

    public Viagem obterProximaViagem(){
        return viagensMarcadas.get(0);
    }
}
