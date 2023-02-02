

public class Cuenta {
    //Atributos - caracteristicas

    private String nombreDelTitular;
    private double saldoDeCuenta;
    private long numeroDeCuenta;

    //Constructor
    public Cuenta(String nombreDelTitular, double saldoDeCuenta, long numeroDeCuenta){
        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    //METODOS -- > setters y getters.

    public void setIngreso(double saldoDeCuenta){
        this.saldoDeCuenta = saldoDeCuenta;
    }
    public void setRetiro(double saldoDeCuenta){
        this.saldoDeCuenta = saldoDeCuenta;
    }

    public double getSaldoCuenta(){return this.saldoDeCuenta;
    }

    public void getDatosCuenta(){
        System.out.println("El nombre del titular es: " + nombreDelTitular + ", con numero de cuenta numero: " + numeroDeCuenta + " y el saldo de la cuenta es: " + saldoDeCuenta) ;


    }

    public long getNumeroDeCuenta(){
        return this.numeroDeCuenta;
    }
    public String getNombreDelTitular(){
        return this.nombreDelTitular;
    }


    //agregar nuevo metodos agregarNuevoSaldo & validarMonto

    public double agregarNuevoSaldo(double saldoActual){

        saldoDeCuenta += saldoActual;

        return saldoDeCuenta;
    }

    public double validarMonto(double monto){

        if (saldoDeCuenta - monto > 0){
            saldoDeCuenta -= monto;
        }
    return saldoDeCuenta;
    }

}
