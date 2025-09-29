import java.time.LocalDate;
import java.time.LocalTime;
import java.util.InputMismatchException;
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


        int edad;
        while (true){
            try {
                System.out.print("\nIngrese su edad: ");


            int edadtemp = sc.nextInt();
            if (edadtemp < 0 || edadtemp > 100){
                System.out.println("Ingrese una edad valida");
            }
            else{
                edad = edadtemp;
                break;
            }
        } catch (InputMismatchException e){
                System.out.println("ERROR Coloque una número entero para la edad");
                sc.nextLine();}
        }
        sc.nextLine();


        System.out.print("Ingrese el correo: ");
        String correo = sc.nextLine();


        int telefono;
        while (true){
            try{
                System.out.print("Ingrese el teléfono: ");
                int telefonotemp = sc.nextInt();
                if (telefonotemp < 0){
                    System.out.println("Coloque un número positivo");
                }
                else{
                    telefono = telefonotemp;
                    break;
                }

            }catch (InputMismatchException e){
                System.out.println("ERROR Coloque números enteros para su número de telefeno");
                sc.nextLine();
            }
        }

        sc.nextLine();
        LocalDate fechaNacimiento = null;
        while(fechaNacimiento == null){
            try{
                System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
                fechaNacimiento = LocalDate.parse(sc.nextLine());

            }catch (InputMismatchException e){
                System.out.println("ERROR coloque una fecha valida en el formato (YYYY-MM-DD)");
                sc.nextLine();
            }
        }

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
