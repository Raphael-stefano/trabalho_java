import entity.Passageiro;
import DAO.PassageiroDAO;

public class App {
    public static void main(String args[]){
        Passageiro pass = new Passageiro("Leonardo", "222.333.444-55", 1, 'm', "(22) 99856-0409", "leozinhodamassa@gmail.com.br", "GaaraVSLeeAoSomDeLinkinPark");

        PassageiroDAO passDao = new PassageiroDAO();

        passDao.cadastrarPassageiro(pass);

    }
}

