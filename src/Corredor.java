import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Corredor extends Persona{
     LocalTime tiempo;
     int posicion;

    public Corredor(String nombre, int edad, String correo, int telefono, LocalDate fechaNacimiento, char sexo, String tipoDeSangre, int contactoEmergencia,LocalTime tiempo, int posicion) {
        super(nombre, edad, correo, telefono, fechaNacimiento, sexo, tipoDeSangre, contactoEmergencia);
        this.tiempo = tiempo;
        this.posicion = posicion;
    }

    public static Corredor generarCorredor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("\nIngrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese el correo: ");
        String correo = sc.nextLine();

        System.out.print("Ingrese el teléfono: ");
        int telefono = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine());

        System.out.print("Ingrese el sexo (M/F): ");
        char sexo = sc.nextLine().charAt(0);

        System.out.print("Ingrese el tipo de sangre: ");
        String tipoDeSangre = sc.nextLine();

        System.out.print("Ingrese el número de contacto de emergencia: ");
        int contactoEmergencia = sc.nextInt();

        LocalTime tiempo = LocalTime.of(0,0);

        int posicion = 0;

        return new Corredor(nombre,edad,correo,telefono,fechaNacimiento,sexo,tipoDeSangre,contactoEmergencia,tiempo,posicion);
    }

    public LocalTime getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalTime tiempo) {
        this.tiempo = tiempo;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Corredor{" +
                "tiempo=" + tiempo +
                ", posicion:" + posicion +
                "} " + super.toString();
    }
}
