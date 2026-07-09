package model;

public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Tipo de embarcación: " + tipoEmbarcacion);

    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo de embarcación: " + tipoEmbarcacion;
    }
}