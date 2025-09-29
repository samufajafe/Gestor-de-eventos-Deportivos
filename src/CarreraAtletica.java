import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class CarreraAtletica extends ActividadDeportiva {

    public CarreraAtletica(String nombre, LocalDate fecha, LocalTime hora, String descripcion, Estado estado) {
        super(nombre, fecha, hora, descripcion, estado);
    }

    public static CarreraAtletica crearCarrera() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la carrera: ");
        String nombreCarrera = sc.nextLine();

        System.out.print("\nIngrese la fecha de la carrera (YYYY-MM-DD): ");
        LocalDate fecha = LocalDate.parse(sc.nextLine());
        sc.nextLine();

        System.out.print("Ingrese la hora de la carrera (HH:MM): ");
        LocalTime hora = LocalTime.parse(sc.nextLine());

        System.out.print("Por favor, describa la carrera: ");
        String descripcion = sc.nextLine();
        sc.nextLine();

        System.out.print("Por favor, ingrese el estado: ");
        Estado estado = sc.nextLine();
        sc.nextLine();

        return new CarreraAtletica(nombreCarrera, fecha, hora, descripcion, estado);
    }
}

