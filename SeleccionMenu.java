package ParcialFinalEstructuras;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class SeleccionMenu {

    public SeleccionMenu(String menu) {

        LinkedList<Estudiante_Ingenieria> EstudiantesIngenieria = new LinkedList<>();
        LinkedList<Estudiante_Diseno> EstudiantesDiseno = new LinkedList<>();
        LinkedList<Computador_Portatil> ComputadorPortatil = new LinkedList<>();
        LinkedList<Tabla_Grafica> TablaGrafica = new LinkedList<>();

        LinkedList<Object> EI = new LinkedList<>();
        LinkedList<Object> ED = new LinkedList<>();
        LinkedList<Object> CP = new LinkedList<>();
        LinkedList<Object> TG = new LinkedList<>();

        // Llenar las listas con objetos de estudiantes
        EstudiantesIngenieria.add(new Estudiante_Ingenieria("123", "Laura", "Perez", "123456789", 5, 4.5f, "S123"));
        EstudiantesDiseno.add(new Estudiante_Diseno("456", "Ana", "Gomez", "987654321", "virtual", 3, 456));

        JOptionPane.showMessageDialog(null, "BIENVENIDO AL MENU", "BIENVENIDA", 1);

        int opcion = 0;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "MENU", 3));

            switch (opcion) {

                case 1:
                    String menuE = "1. Registrar prestamo de equipo"
                            + "\n2. Modificar prestamo de equipo (por serial o cedula)"
                            + "\n3. Devolución del equipo (por serial o cedula)"
                            + "\n4. Buscar equipo (por serial o cedula)"
                            + "\n5. Volver al menu principal"
                            + "\n\nDigite una opcion:";

                    SeleccionMenuEI SMEI = new SeleccionMenuEI(menuE, EstudiantesIngenieria, ComputadorPortatil);
                    break;

                case 2:
                    String menuED = "1. Registrar prestamo de equipo"
                            + "\n2. Modificar prestamo de equipo (por serial o cedula)"
                            + "\n3. Devolución del equipo (por serial o cedula)"
                            + "\n4. Buscar equipo (por serial o cedula)"
                            + "\n5. Volver al menu principal"
                            + "\n\nDigite una opcion:";

                    SeleccionMenuED SMED = new SeleccionMenuED(menuED, EstudiantesDiseno, TablaGrafica);
                    break;

                case 3:
                    Inventario Inventario = new Inventario();
                    Inventario.ExportarEstudiantesIngenieria(EstudiantesIngenieria);
                    Inventario.ExportarEstudiantesDiseno(EstudiantesDiseno);
                    Inventario.mostrarContenidoArchivo("EstudiantesIngenieria.txt");
                    Inventario.mostrarContenidoArchivo("EstudiantesDiseno.txt");

                    importarE importar = new importarE();
                    String archivoEstudiantesIngenieria = "EstudiantesIngenieria.txt";
                    LinkedList<Object> datosEI = importar.importarEstudiantes(archivoEstudiantesIngenieria);
                    for (Object objeto : datosEI) {
                        if (objeto instanceof Estudiante_Ingenieria) {
                            EI.add(objeto);
                        } else if (objeto instanceof Computador_Portatil) {
                            CP.add(objeto);
                        }
                    }

                    String archivoDiseno = "EstudiantesDiseño.txt";
                    LinkedList<Object> datosED = importar.importarEstudiantes(archivoDiseno);
                    for (Object objeto : datosED) {
                        if (objeto instanceof Estudiante_Diseno) {
                            ED.add(objeto);
                        } else if (objeto instanceof Tabla_Grafica) {
                            TG.add(objeto);
                        }
                    }
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Hasta la proxima!", "SALIDA", 1);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Ingresaste una opcion inexistente", "ERROR", 0);
                    break;
            }
        } while (opcion != 4);

    }

}
