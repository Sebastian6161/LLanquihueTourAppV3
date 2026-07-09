package model;

public class ColaboradorExterno extends RecursoAgencia {

    private String empresa;
    private String servicio;

    public ColaboradorExterno(String nombre, String identificador, String empresa, String servicio) {
        super(nombre, identificador);
        this.empresa = empresa;
        this.servicio = servicio;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getServicio() {
        return servicio;
    }

    @Override
    public String mostrarResumen() {
        return "Colaborador externo: " + nombre +
                "\nIdentificador: " + identificador +
                "\nEmpresa: " + empresa +
                "\nServicio: " + servicio;
    }
}
