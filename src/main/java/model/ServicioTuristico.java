package model;

public class ServicioTuristico {

    private String nombre;
    private int duracionHoras;

    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Duración: " + duracionHoras + " horas");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nDuración: " + duracionHoras + " horas";
    }
}
