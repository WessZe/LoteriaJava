package apploteria;
//Clase Padre
// Clase Abstracta definir/declarar funciones sin tener contenido
// las clases abstractas no se pueden llamar al main, sino que tienen que ser por medio de las hijas

import java.util.Scanner;

public abstract class Evento {

    private String fecha;
    private boolean esRealizado;
    Scanner opcion = new Scanner(System.in);

    Evento(String fecha) {
// this guarda la posicion actual de un elemento, hace referencia a la posicion donde estoy ubicado.
        this.fecha = fecha;
        this.esRealizado = false;
    }

    protected void cambiarEvento(String Evento) {
        this.fecha = fecha;
    }

    protected void cambiarEstado() {
//toggle =! negacion para cambiar el estado si esta falso pasa a verdadero o viceversa

        esRealizado = !esRealizado;
        String msj = esRealizado ? "Realizado" : "No Realizado"; // se usa "?" como if, If Ternario.
        System.out.println("Estado Actualizado: " + msj);

    }

    protected void getFecha() {
        System.out.println("--------------");
        System.out.println("Fecha" + this.fecha);
    }

    protected boolean getEstado() { //en la funcion hija se hace el retorno otra forma de hacer el get
        return this.esRealizado;
    }

    protected abstract void realizarSorteo(); //son como ordenes para las clases hijas

    protected abstract void buscarGanadores(); //tiene que llevar estos metodos.

}
