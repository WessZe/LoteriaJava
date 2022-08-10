package apploteria;

public class AppLoteria {

    public static void main(String[] args) {

        /* Evento nuevoEvento = new Evento("08/08/2022");
        nuevoEvento.cambiarEstado(); */ // como se cambio a abstracta ya no puede ser llamada en el principal solo por la herencia
        pegaTres nuevoSorteo = new pegaTres("08/08/2022", 1001);
        nuevoSorteo.getFecha();
        System.out.println("Estado: " + nuevoSorteo.getEstado());
        nuevoSorteo.cambiarEstado();
        nuevoSorteo.realizarSorteo();

        premiaDos nuevoSorteo2 = new premiaDos("08/09/2022", 1002);
        nuevoSorteo2.getFecha();
        System.out.println("Estado: " + nuevoSorteo2.getEstado());
        nuevoSorteo2.cambiarEstado();
        nuevoSorteo2.realizarSorteo();

    }

}
