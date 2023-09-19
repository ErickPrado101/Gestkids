import java.util.ArrayList;
import java.util.Date;

public class Banco {
    /*Atributos*/
    public static ArrayList<Gasto> listaGastos = new ArrayList<>();
    public static ArrayList<Ganho> listaGanhos = new ArrayList<>();


    public static void addGastos(Gasto Gasto) {
        listaGastos.add(Gasto);
    }

    public static void  addGanhos(Ganho Ganho) {
        listaGanhos.add(Ganho);
    }
}
