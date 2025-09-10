package models;

import java.util.ArrayList;
import java.util.List;

public class Class {

    // ===================
    // Clase banco
    // ====================
    public class Banco {
        private String nombre;
        private String direccion;
        private String codigo;
        private List<Cliente> clientes = new ArrayList<>(); // Inicialización directa de la lista

        public Banco(String nombre, String direccion, String codigo) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.codigo = codigo;
        }

        public void agregarCliente(Cliente cliente) {
            clientes.add(cliente);
        }

        public List<Cliente> getClientes() {
            return clientes;
        }
    }

    // ===================
    // Clase Cliente
    // ===================
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
    // ==========================
    // Clase cuenta
    // ======================

    public class Cuenta {
        private String numeroCuenta;
        private double saldo;
        private String tipo;
        private Cliente propietario;

        public void Cuenta(String numeroCuenta, Cliente propietario) {
            this.numeroCuenta = numeroCuenta;
            this.propietario = propietario;
            this.saldo = 0.0;
        }

    }

    public class Main {

    }
}
