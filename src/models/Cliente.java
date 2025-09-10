package models;

import java.util.ArrayList;
import java.util.List;

//===================
// Clase Cliente
//====================

public class Cliente {

    private String nombre;
    private String cedula;
    private String direccion;
    private List<Cuenta> cuentas = new ArrayList<>(); // Inicialización de la lista cuentas

    public Cliente(String nombre, String cedula, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public void abrirCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

}
