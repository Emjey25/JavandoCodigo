package models;

//===================
// Clase banco
//====================

import java.util.ArrayList;
import java.util.List;

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
