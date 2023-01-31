import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        long randomLong = random.nextLong();
        Cuenta persona = new Cuenta("Enrique", + 200.000, + randomLong );
        persona.getDatosCuenta();


    }
}