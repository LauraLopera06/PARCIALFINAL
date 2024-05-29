package ParcialFinalEstructuras;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class ModificarRegistro {

    public void ModificarRegistroEI(LinkedList<Estudiante_Ingenieria> estudiantes, LinkedList<Computador_Portatil> equipos) {

        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Buscar por cedula"
                    + "\n2. Buscar por serial"
                    + "\n\nIngrese la forma de buscar el registro a modificar: ", "MODIFICAR REGISTRO", 3));

            switch (opcion) {

                case 1:
                    String buscarC = JOptionPane.showInputDialog(null, "Ingrese la cedula del registro a modificar: ", "CEDULA MODIFICAR REGISTRO", 3);

                    if (estudiantes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay registros ingresados", "ERROR", 0);

                    } else {
                        for (Estudiante_Ingenieria estudiante : estudiantes) {
                            if (estudiante.getCedula().equalsIgnoreCase(buscarC)) {
                                for (Computador_Portatil equipo : equipos) {
                                    if (estudiante.getSerial().equalsIgnoreCase(equipo.getSerial())) {
                                        equipo.setPrecio(Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el nuevo precio del equipo: ", "MODIFICAR PRECIO", 3)));

                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "No existe un registro con esa cedula", "ERROR", 0);
                            }
                        }
                    }
                    break;

                case 2:
                    String buscarS = JOptionPane.showInputDialog(null, "Ingrese el serial del registro a modificar: ", "SERIAL MODIFICAR REGISTRO", 3);

                    if (estudiantes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay registros ingresados", "ERROR", 0);

                    } else {
                        for (Computador_Portatil equipo : equipos) {
                            if (equipo.getSerial().equalsIgnoreCase(buscarS)) {
                                equipo.setPrecio(Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el nuevo precio del equipo: ", "MODIFICAR PRECIO", 3)));

                            } else {
                                JOptionPane.showMessageDialog(null, "No existe un registro con ese serial", "ERROR", 0);
                            }
                        }
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Ingresaste una opcion inexistente", "ERROR", 0);
                    break;
            }

        } while (opcion != 1 && opcion != 2);
    }

    public void ModificarRegistroED(LinkedList<Estudiante_Diseno> estudiantes, LinkedList<Tabla_Grafica> equipos) {

        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Buscar por cedula"
                    + "\n2. Buscar por serial"
                    + "\n\nIngrese la forma de buscar el registro a modificar: ", "BUSCAR REGISTRO", 3));

            switch (opcion) {

                case 1:
                    String buscarC = JOptionPane.showInputDialog(null, "Ingrese la cedula del registro a buscar: ", "CEDULA BUSCAR REGISTRO", 3);

                    if (estudiantes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay registros ingresados", "ERROR", 0);

                    } else {
                        for (Estudiante_Diseno estudiante : estudiantes) {
                            if (estudiante.getCedula().equalsIgnoreCase(buscarC)) {
                                for (Tabla_Grafica equipo : equipos) {

                                    int buscar = Integer.parseInt(equipo.getSerial());

                                    if (buscar == estudiante.getSerial()) {
                                        equipo.setPrecio(Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el nuevo precio del equipo: ", "MODIFICAR PRECIO", 3)));

                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "No existe un registro con esa cedula", "ERROR", 0);
                            }
                        }
                    }
                    break;

                case 2:
                    String buscarS = JOptionPane.showInputDialog(null, "Ingrese el serial del registro a modificar: ", "CEDULA BUSCAR REGISTRO", 3);

                    if (estudiantes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay registros ingresados", "ERROR", 0);

                    } else {
                        for (Tabla_Grafica equipo : equipos) {
                            if (equipo.getSerial().equalsIgnoreCase(buscarS)) {
                                equipo.setPrecio(Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el nuevo precio del equipo: ", "MODIFICAR PRECIO", 3)));

                            } else {
                                JOptionPane.showMessageDialog(null, "No existe un registro con ese serial", "ERROR", 0);
                            }
                        }
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Ingresaste una opcion inexistente", "ERROR", 0);
                    break;
            }

        } while (opcion != 1 && opcion != 2);

    }

}
