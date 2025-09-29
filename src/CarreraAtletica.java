import java.time.LocalDate;
import java.time.LocalTime;

public class CarreraAtletica extends ActividadDeportiva {
    String lugar;

    public CarreraAtletica(String nombre, LocalDate fecha, LocalTime hora, String descripcion, Estado estado, String lugar) {
        super(nombre, fecha, hora, descripcion, estado);
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}

