import java.util.ArrayList;

public class Banco {

    private static ArrayList<Formas> formas = new ArrayList<>();

    public static ArrayList<Formas> getFormas() {
        return formas;
    }

    public static void setFormas(ArrayList<Formas> formas) {
        Banco.formas = formas;
    }

    static void addForma(Formas formas){
        Banco.formas.add(formas);
    }
}
