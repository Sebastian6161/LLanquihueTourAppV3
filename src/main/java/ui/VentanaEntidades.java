package ui;

import data.GestorEntidades;
import model.GuiaTuristico;
import model.Vehiculo;

import javax.swing.JOptionPane;

public class VentanaEntidades {

    private GestorEntidades gestor;

    public VentanaEntidades() {
        gestor = new GestorEntidades();
    }

    public void iniciar() {
        int opcion;

        do {
            String menu = """
                    ==========================================
                           LLANQUIHUE TOUR
                     Sistema de Gestión de Entidades
                    ==========================================

                    1. Registrar guía turístico
                    2. Registrar vehículo
                    3. Ver entidades registradas
                    4. Salir

                    Seleccione una opción:
                    """;

            String respuesta = JOptionPane.showInputDialog(menu);

            if (respuesta == null) {
                JOptionPane.showMessageDialog(null, "Programa finalizado.");
                break;
            }

            if (respuesta.isBlank()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar una opción.");
                continue;
            }

            try {
                opcion = Integer.parseInt(respuesta);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número válido.");
                continue;
            }

            switch (opcion) {
                case 1 -> registrarGuia();
                case 2 -> registrarVehiculo();
                case 3 -> JOptionPane.showMessageDialog(null, gestor.mostrarTodasLasEntidades());
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Programa finalizado.");
                    return;
                }
                default -> JOptionPane.showMessageDialog(null, "Opción no válida.");
            }

        } while (true);
    }

    private void registrarGuia() {
        String nombre = pedirDato("Ingrese el nombre del guía:");
        if (nombre == null) return;

        String identificador = pedirDato("Ingrese el identificador del guía:");
        if (identificador == null) return;

        String especialidad = pedirDato("Ingrese la especialidad del guía:");
        if (especialidad == null) return;

        GuiaTuristico guia = new GuiaTuristico(nombre, identificador, especialidad);
        gestor.agregarEntidad(guia);

        JOptionPane.showMessageDialog(null, "Guía turístico registrado correctamente.");
    }

    private void registrarVehiculo() {
        String nombre = pedirDato("Ingrese el nombre del vehículo:");
        if (nombre == null) return;

        String identificador = pedirDato("Ingrese el identificador del vehículo:");
        if (identificador == null) return;

        String tipo = pedirDato("Ingrese el tipo de vehículo:");
        if (tipo == null) return;

        String capacidadTexto = pedirDato("Ingrese la capacidad de pasajeros:");
        if (capacidadTexto == null) return;

        int capacidad;

        try {
            capacidad = Integer.parseInt(capacidadTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La capacidad debe ser un número válido.");
            return;
        }

        Vehiculo vehiculo = new Vehiculo(nombre, identificador, tipo, capacidad);
        gestor.agregarEntidad(vehiculo);

        JOptionPane.showMessageDialog(null, "Vehículo registrado correctamente.");
    }

    private String pedirDato(String mensaje) {
        String dato = JOptionPane.showInputDialog(mensaje);

        if (dato == null) {
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
            return null;
        }

        if (dato.isBlank()) {
            JOptionPane.showMessageDialog(null, "El campo no puede quedar vacío.");
            return null;
        }

        return dato;
    }
}