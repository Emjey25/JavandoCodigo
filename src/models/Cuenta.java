package models;

public class Cuenta {

    private String numeroCuenta;
    private double saldo;
    private String tipo;
    private Cliente propietario;

    public Cuenta(String numeroCuenta, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.propietario = propietario;
        this.saldo = 0.0;
    }

}
