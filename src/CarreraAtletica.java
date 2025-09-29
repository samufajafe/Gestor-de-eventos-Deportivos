import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CarreraAtletica extends ActividadDeportiva {

    public CarreraAtletica(String nombre, LocalDate fecha, LocalTime hora, String descripcion, Estado estado) {
        super(nombre, fecha, hora, descripcion, estado);
    }

    public static CarreraAtletica crearCarrera() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la carrera: ");
        String nombreCarrera = sc.nextLine();

        LocalDate fecha = null;

        while (fecha == null) {  // repetir hasta que sea válida
            System.out.print("Ingrese la fecha de la carrera (YYYY-MM-DD): ");
            String fechaTemp = sc.nextLine();

            try {
                fecha = LocalDate.parse(fechaTemp); // intenta convertir lo ingresado a formato (HH:MM)
            } catch (DateTimeParseException e) { //e es una variable dada al tipo de excepcion
                System.out.println("Formato inválido. Por favor ingrese la fecha en formato YYYY-MM-DD.");
            }
        }

        LocalTime hora = null;

        while (hora == null) {
            System.out.print("Ingrese la hora de la carrera (HH:MM): ");
            String horaTemp = sc.nextLine();

            try {
                hora = LocalTime.parse(horaTemp);
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido. Por favor ingrese la hora en formato HH:MM.");
            }
        }

        System.out.print("Por favor, describa la carrera: ");
        String descripcion = sc.nextLine();

        System.out.println("Estados de las Carrareas: ");
        int i = 1;
        for (Estado estado1 : Estado.values()) {

            System.out.println(i + ". "+ estado1.name());
            i++;
        }
        System.out.print("Por favor, ingrese el estado: ");

        Estado estado = null;
        while (true) {
            int estadotemp = sc.nextInt();
            if (estadotemp < 1 || estadotemp > Estado.values().length) {
                System.out.println("El estado no es valido");
            }
            else  {
                estado = Estado.values()[estadotemp - 1];
                break;
            }

        }




        return new CarreraAtletica(nombreCarrera, fecha, hora, descripcion, estado);
    }


}

