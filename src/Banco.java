public class Banco {
     //Agregamos objeto creado en la clase Cuenta, usados como atributos privados en la clase Banco.

     private Cuenta cuentaEnrique;
     private Cuenta cuentaMaria;

     public Banco (Cuenta cuentaEnrique, Cuenta cuentaMaria){
          this.cuentaEnrique = cuentaEnrique;
          this.cuentaMaria = cuentaMaria;
     }

     //Getters y setters.


     public double transferir(Cuenta cuentaEnrique, Cuenta cuentaMaria, double monto){
          cuentaEnrique.validarMonto(monto);
          double infoTransferencia = cuentaMaria.agregarNuevoSaldo(monto);
          System.out.println("La transferencia a la cuenta: " + cuentaMaria.getNombreDelTitular() + " por un monto de: " + monto + " fue exitosa" );
          return infoTransferencia;


     };

     public void imprimirNumeroCuentas(){
          System.out.println("Numero de cuenta : " + cuentaEnrique.getNumeroDeCuenta());
          System.out.println("Numero de cuenta : " + cuentaMaria.getNumeroDeCuenta());

    }
}
