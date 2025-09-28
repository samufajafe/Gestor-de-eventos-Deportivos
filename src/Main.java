import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Corredor c = Corredor.generarCorredor();

        if (c instanceof Corredor) {
            System.out.println(c);
        }


    }
}
