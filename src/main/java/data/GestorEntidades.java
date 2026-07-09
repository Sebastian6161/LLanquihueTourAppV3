package data;

import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

import java.util.ArrayList;

public class GestorEntidades {

    private ArrayList<Registrable> entidades;

    public GestorEntidades() {
        entidades = new ArrayList<>();
        cargarDatosIniciales();
    }

    private void cargarDatosIniciales() {
        entidades.add(new GuiaTuristico("Carlos Muñoz", "G001", "Rutas culturales"));
        entidades.add(new Vehiculo("Van Ejecutiva", "ABCD-12", "Van", 12));
        entidades.add(new ColaboradorExterno("María López", "C001", "Sabores del Sur", "Gastronomía local"));
    }

    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    public ArrayList<Registrable> getEntidades() {
        return entidades;
    }

    public String mostrarTodasLasEntidades() {
        StringBuilder resumen = new StringBuilder();

        for (Registrable entidad : entidades) {
            resumen.append(entidad.mostrarResumen()).append("\n");

            if (entidad instanceof GuiaTuristico) {
                resumen.append("Tipo detectado: Guía turístico\n");
            } else if (entidad instanceof Vehiculo) {
                resumen.append("Tipo detectado: Vehículo\n");
            } else if (entidad instanceof ColaboradorExterno) {
                resumen.append("Tipo detectado: Colaborador externo\n");
            }

            resumen.append("========================================\n");
        }

        return resumen.toString();
    }
}