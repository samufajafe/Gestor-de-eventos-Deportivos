import java.time.LocalDate;

public class Corredor extends Persona{
    public Corredor(String nombre, int edad, String correo, int telefono, LocalDate fechaNacimiento, char sexo, String tipoDeSangre, int contactoEmergencia) {
        super(nombre, edad, correo, telefono, fechaNacimiento, sexo, tipoDeSangre, contactoEmergencia);
    }
}
