package model;

public class GuiaTuristico extends RecursoAgencia {

    private String especialidad;

    public GuiaTuristico(String nombre, String identificador, String especialidad) {
        super(nombre, identificador);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String mostrarResumen() {
        return "Guía turístico: " + nombre +
                "\nIdentificador: " + identificador +
                "\nEspecialidad: " + especialidad;
    }
}
