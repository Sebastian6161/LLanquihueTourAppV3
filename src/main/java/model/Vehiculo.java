package model;

public class Vehiculo extends RecursoAgencia {

    private String tipo;
    private int capacidad;

    public Vehiculo(String nombre, String identificador, String tipo, int capacidad) {
        super(nombre, identificador);
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String mostrarResumen() {
        return "Vehículo: " + nombre +
                "\nIdentificador: " + identificador +
                "\nTipo: " + tipo +
                "\nCapacidad: " + capacidad + " pasajeros";
    }
}