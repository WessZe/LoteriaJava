//Clase hija de Evento
package apploteria;
import java.util.Random;

public class pegaTres extends Evento {

    private int ganador[] = new int[3];
    private int premios[]={100,1000,10000};
    private int numeroSorteo;

    public pegaTres(String fecha, int numeroSorteo) {
        super(fecha);
        this.numeroSorteo = numeroSorteo;

    }

    public void realizarSorteo() {
//pendiente construccion
Random rand = new Random();
int numeroMax = 100;

        for (int cont = 0; cont < 3; cont++) {
            ganador[cont] = rand.nextInt(numeroMax);
            System.out.println("Numero Ganador: " + ganador[cont]);
        }
//int int_random = rand.nextInt(numeroMax);

    }

    public void buscarGanadores() {
//pendiente construccion
    }

}
