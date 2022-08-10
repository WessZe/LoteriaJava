package apploteria;
import java.util.Random;
public class premiaDos extends Evento {

    private int ganador[]= new int[2];
    private int premios[];
    private int numeroSorteo;

    public premiaDos(String fecha, int numeroSorteo) {
        super(fecha);
        this.numeroSorteo = numeroSorteo;
    }

    public void realizarSorteo() {
//pendiente construccion
Random rand = new Random();
int numeroMax=100;

        for (int cont = 0; cont < 2; cont++) {
            ganador[cont]= rand.nextInt(numeroMax);
            System.out.println("Numero Ganador: " + ganador[cont]);
        }

    }

    public void buscarGanadores() {
// pendiente construccion
    }
}
