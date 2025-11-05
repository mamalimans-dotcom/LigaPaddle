package edu.masanz.da.lp;

import java.util.Scanner;

/**
 * Clase principal para ejecutar la aplicación de gestión de ligas de paddle.
 * Utiliza la clase GestorLigas para gestionar las ligas y la clase Gui para la interacción con el usuario.
 */
public class App {

    private GestorLigas gestorLigas;

    /**
     * Constructor de la clase App.
     */
    public App() {
        // TODO 11: instancia el GestorLigas e inicializa las ligas utilizando la clase Init
        gestorLigas = new GestorLigas();
            Init.crearLigas(gestorLigas);
    }

    /**
     * Método principal para ejecutar la aplicación.
     */
    public void run() {
        // TODO 12: en un bucle muestra el menú, lee la opción y ejecuta la opción hasta que se elija salir.
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("*****************************************");
            System.out.println("*        L I G A S    P A D D L E       *");
            System.out.println("*****************************************");
            System.out.println(" 1. Listar equipos ligas");
            System.out.println(" 2. Mostrar tabla resultados de una liga");
            System.out.println(" 3. Listar campeones ligas");
            System.out.println(" 4. Anotar marcadores partido a una liga");
            System.out.println(" 0. Salir de la aplicación");
            System.out.println("*****************************************");
            int texto = Gui.leerNumero("Elige una opcion: ");
            if( texto != 0){
                ejecutarOpcion(texto);
            }else {
                salir();

            }break;

        }






    }

    /**
     * Ejecuta la opción seleccionada del menú.
     * @param numOpc Número de opción seleccionada.
     */
    private void ejecutarOpcion(int numOpc) {
        // TODO 13: implementa la ejecución de las opciones del menú utilizando un switch.
        // Llama a los métodos correspondientes para cada opción.
        switch (numOpc){
            case 1:
                listarEquiposLigas();
                break;
            case 2:
                mostrarTablaResultadosLiga();
                break;
            case 3:
                listarCampeonesLigas();
                break;
            case 4:
                anotarMarcadoresLiga();
                break;
            case 0:
                salir();
                break;

        }


    }

    /**
     * Lista los equipos de las ligas disponibles.
     */
    private void listarEquiposLigas() {
        // TODO 14: muestra la lista de ligas, lee el número de liga y muestra la lista de equipos de la liga seleccionada.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ligas disponibles:");
        System.out.println(gestorLigas.getListaLigas());
        System.out.println("Numero de liga:");
        String texto = sc.nextLine();
        int opcion = Integer.parseInt(texto);
        System.out.println("Equipos de la liga:");
        System.out.println(gestorLigas.getListaEquipos(opcion));




    }

    /**
     * Lista los campeones de las ligas.
     */
    private void listarCampeonesLigas() {
        // TODO 15: muestra el listado de campeones de todas las ligas.
        System.out.println(gestorLigas.getListadoCampeonesLigas());

    }

    /**
     * Muestra la tabla de resultados de una liga seleccionada.
     */
    private void mostrarTablaResultadosLiga() {
        // TODO 16: muestra la lista de ligas, lee el número de liga y muestra la tabla de resultados de la liga seleccionada.
        Scanner st = new Scanner(System.in);
        System.out.println("Ligas disponibles:");
        System.out.println(gestorLigas.getListaLigas());
        System.out.println("Numero de liga:");
        String text = st.nextLine();
        int op = Integer.parseInt(text);
        System.out.println("Resultados:");
        System.out.println(gestorLigas.getTablaResultadosLiga(op));


    }

    /**
     * Muestra la tabla de resultados de una liga específica.
     * @param numLiga Número de la liga.
     */
    private void mostrarTablaResultadosLiga(int numLiga) {
        // TODO 17: muestra la tabla de resultados de la liga indicada.
        System.out.println("Resultados");
        System.out.println(gestorLigas.getTablaResultadosLiga(numLiga));


    }

    /**
     * Anota los marcadores de los partidos de una liga seleccionada.
     */
    private void anotarMarcadoresLiga() {
        // TODO 18: Para anotar los marcadores de los partidos de una liga seleccionada,
        // muestra la lista de ligas, lee el número de liga, muestra la lista de equipos,
            Scanner sc = new Scanner(System.in);
            System.out.println("Ligas disponibles:");
            System.out.println(gestorLigas.getListaLigas());
            System.out.println("Numero de liga:");
            String texto = sc.nextLine();
            int opcion = Integer.parseInt(texto);
            System.out.println("Equipos de la liga:");
            System.out.println(gestorLigas.getListaEquipos(opcion));

        // permite al usuario seleccionar dos equipos y anotar los marcadores de sus partidos.

        // Muestra la tabla de resultados antes y después de anotar los marcadores.
        // Permite repetir el proceso hasta que el usuario decida salir.


















    }

    /**
     * Muestra un mensaje de salida: "Saliendo...".
     */
    private void salir() {
        Gui.mostrarTexto("Saliendo...");
    }

    /**
     * Muestra un mensaje de opción no válida: "Opción no válida".
     */
    private void opcionNoValida() {
        Gui.mostrarTexto("Opción no válida");
    }


}
