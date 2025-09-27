import java.time.LocalDate;

public class Administrador extends Persona{
    public Administrador(String nombre, int edad, String correo, int telefono, LocalDate fechaNacimiento, char sexo, String tipoDeSangre, int contactoEmergencia) {
        super(nombre, edad, correo, telefono, fechaNacimiento, sexo, tipoDeSangre, contactoEmergencia);
    }
}
