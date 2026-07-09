package model;

public abstract class RecursoAgencia implements Registrable {

    protected String nombre;
    protected String identificador;

    public RecursoAgencia(String nombre, String identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificador() {
        return identificador;
    }
}
