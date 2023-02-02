import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        long randomLong = random.nextLong();
        Cuenta cuentaMaria = new Cuenta("Maria", 50, 64852);
        Cuenta cuentaEnrique = new Cuenta("Enrique", 100, 419512);

        Banco banco = new Banco(cuentaEnrique, cuentaMaria);


        //Traemos la informacion del numero de cuentas a traves del metodo creado en la clase Cuenta, en el cual retornamos el numeroDeCuenta y lo invocamos a traves del metodo imprimirNumeroCuentas.

        banco.imprimirNumeroCuentas();

        //Comprobamos metodo de transferir.

        System.out.println(" =====  BEFORE OF THE TRANSACTION =====");

        System.out.println("El saldo actual del titular: " + cuentaEnrique.getNombreDelTitular() + " es: " + cuentaEnrique.getSaldoCuenta());
        System.out.println("El saldo actual del titular: " + cuentaMaria.getNombreDelTitular() + " es: " + cuentaMaria.getSaldoCuenta());

        System.out.println("===== LOADING TRANSACTION===");

        System.out.println(banco.transferir(cuentaEnrique, cuentaMaria, 30));


        System.out.println(" =====  AFTER OF THE TRANSACTION =====");

        System.out.println("El saldo actual del titular: " + cuentaEnrique.getNombreDelTitular() + " es: " + cuentaEnrique.getSaldoCuenta());
        System.out.println("El saldo actual del titular: " + cuentaMaria.getNombreDelTitular() + " es: " + cuentaMaria.getSaldoCuenta());





    }
}
