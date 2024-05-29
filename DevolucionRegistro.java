package ParcialFinalEstructuras;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class DevolucionRegistro {

    public void DevolverRegistroEI(LinkedList<Estudiante_Ingenieria> estudiantes, LinkedList<Computador_Portatil> equipos) {

        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Buscar por cedula"
                    + "\n2. Buscar por serial"
                    + "\n\nIngrese la forma de buscar el registro a eliminar: ", "DEVOLVER REGISTRO", 3));

            switch (opcion) {
                case 1:
                    String buscarC = JOptionPane.showInputDialog(null, "Ingrese la cedula del registro a eliminar: ", "CEDULA DEVOLVER REGISTRO", 3);

                    if (estudiantes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay registros ingresados", "ERROR", 0);
                    } else {
                        boolean encontrado = false;
                        Estudiante_Ingenieria estudianteAEliminar = null;
                        Computador_Portatil equipoAEliminar = null;
                        for (Estudiante_Ingenieria estudiante : estudiantes) {
                            if (estudiante.getCedula().equalsIgnoreCase(buscarC)) {
                                encontrado = true;
                                for (Computador_Portatil equipo : equipos) {
                                    if (estudiante.getSerial().equalsIgnoreCase(equipo.getSerial())) {
                                        equipoAEliminar = equipo;
                                        break;
                                    }
                                }
                                estudianteAEliminar = estudiante;
                                break;
                            }
                        }
                        if (encontrado) {
                            estudiantes.remove(estudianteAEliminar);
                            equipos.remove(equipoAEliminar);
                            JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente", "ÉXITO", 1);
                        } else {
                            JOptionPane.showMessageDialog(null, "No existe un registro con esa cedula", "ERROR", 0);
                        }
                    }
                    break;

                case 2:
                    String buscarS = JOptionPane.showInputDialog(null, "Ingrese el serial del registro a eliminar: ", "SERIAL DEVOLVER REGISTRO", 3);

                    if (equipos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay registros ingresados", "ERROR", 0);
                    } else {
                        boolean encontrado = false;
                        Computador_Portatil equipoAEliminar = null;
                        Estudiante_Ingenieria estudianteAEliminar = null;
                        for (Computador_Portatil equipo : equipos) {
                            if (equipo.getSerial().equalsIgnoreCase(buscarS)) {
                                encontrado = true;
                                equipoAEliminar = equipo;
                                for (Estudiante_Ingenieria estudiante : estudiantes) {
                                    if (estudiante.getSerial().equalsIgnoreCase(buscarS)) {
                                        estudianteAEliminar = estudiante;
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                        if (encontrado) {
                            equipos.remove(equipoAEliminar);
                            estudiantes.remove(estudianteAEliminar);
                            JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente", "ÉXITO", 1);
                        } else {
                            JOptionPane.showMessageDialog(null, "No existe un registro con ese serial", "ERROR", 0);
                        }
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Ingresaste una opcion inexistente", "ERROR", 0);
                    break;
            }

        } while (opcion != 1 && opcion != 2);
    }

    public void DevolverRegistroED(LinkedList<Estudiante_Diseno> estudiantes, LinkedList<Tabla_Grafica> equipos) {

        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Buscar por cedula"
                    + "\n2. Buscar por serial"
                    + "\n\nIngrese la forma de buscar el registro a eliminar: ", "DEVOLVER REGISTRO", 3));

            switch (opcion) {
                case 1:
                    String buscarC = JOptionPane.showInputDialog(null, "Ingrese la cedula del registro a eliminar: ", "CEDULA DEVOLVER REGISTRO", 3);

                    if (estudiantes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay registros ingresados", "ERROR", 0);
                    } else {
                        boolean encontrado = false;
                        Estudiante_Diseno estudianteAEliminar = null;
                        Tabla_Grafica equipoAEliminar = null;
                        for (Estudiante_Diseno estudiante : estudiantes) {
                            if (estudiante.getCedula().equalsIgnoreCase(buscarC)) {
                                encontrado = true;
                                for (Tabla_Grafica equipo : equipos) {
                                    if (estudiante.getSerial() == Integer.parseInt(equipo.getSerial())) {
                                        equipoAEliminar = equipo;
                                        break;
                                    }
                                }
                                estudianteAEliminar = estudiante;
                                break;
                            }
                        }
                        if (encontrado) {
                            estudiantes.remove(estudianteAEliminar);
                            equipos.remove(equipoAEliminar);
                            JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente", "ÉXITO", 1);
                        } else {
                            JOptionPane.showMessageDialog(null, "No existe un registro con esa cedula", "ERROR", 0);
                        }
                    }
                    break;

                case 2:
                    String buscarS = JOptionPane.showInputDialog(null, "Ingrese el serial del registro a eliminar: ", "SERIAL DEVOLVER REGISTRO", 3);

                    if (equipos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay registros ingresados", "ERROR", 0);
                    } else {
                        boolean encontrado = false;
                        Tabla_Grafica equipoAEliminar = null;
                        Estudiante_Diseno estudianteAEliminar = null;
                        for (Tabla_Grafica equipo : equipos) {
                            if (equipo.getSerial().equalsIgnoreCase(buscarS)) {
                                encontrado = true;
                                equipoAEliminar = equipo;
                                for (Estudiante_Diseno estudiante : estudiantes) {
                                    if (estudiante.getSerial() == Integer.parseInt(equipo.getSerial())) {
                                        estudianteAEliminar = estudiante;
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                        if (encontrado) {
                            equipos.remove(equipoAEliminar);
                            estudiantes.remove(estudianteAEliminar);
                            JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente", "ÉXITO", 1);
                        } else {
                            JOptionPane.showMessageDialog(null, "No existe un registro con ese serial", "ERROR", 0);
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
