package data;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class GestorServicios {

    private List<ServicioTuristico> servicios;

    public GestorServicios() {

        servicios = new ArrayList<>();

        // Rutas gastronómicas
        servicios.add(
                new RutaGastronomica(
                        "Ruta Sabores del Sur",
                        4,
                        5)
        );

        servicios.add(
                new RutaGastronomica(
                        "Ruta Tradiciones Chilotas",
                        3,
                        4)
        );

        // Paseos lacustres
        servicios.add(
                new PaseoLacustre(
                        "Paseo Lago Llanquihue",
                        2,
                        "Catamarán")
        );

        servicios.add(
                new PaseoLacustre(
                        "Navegación Volcánica",
                        3,
                        "Lancha")
        );

        // Excursiones culturales
        servicios.add(
                new ExcursionCultural(
                        "Historia de Frutillar",
                        2,
                        "Museo Colonial Alemán")
        );

        servicios.add(
                new ExcursionCultural(
                        "Patrimonio Local",
                        4,
                        "Teatro del Lago")
        );

    }
    public List<ServicioTuristico> obtenerServicios() {
        return servicios;
    }

    public void mostrarServicios() {

        System.out.println("========================================");
        System.out.println("      SERVICIOS TURÍSTICOS");
        System.out.println("========================================\n");

        for (ServicioTuristico servicio : servicios) {

            servicio.mostrarInformacion();

            System.out.println("--------------------------------");
        }

    }

}