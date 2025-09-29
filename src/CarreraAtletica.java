import java.time.LocalDate;
import java.time.LocalTime;

public class CarreraAtletica extends ActividadDeportiva {
    int cantidad;

    public CarreraAtletica(String nombre, LocalDate fecha, LocalTime hora, String descripcion, ActividadDeportiva.Estado estado, int cantidad) {
        super(nombre, fecha, hora, descripcion, estado);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

