package ParcialFinalEstructuras;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Inventario {

    public void ExportarEstudiantesIngenieria(LinkedList<Estudiante_Ingenieria> lista) {
        try {
            File archivo = new File("EstudiantesIngenieria.txt");
            FileWriter exportar = new FileWriter(archivo, false);

            for (Estudiante_Ingenieria estudiante : lista) {
                exportar.write("Cedula" + " : " + estudiante.getCedula() + "\n");
                exportar.write("Nombre" + " : " + estudiante.getNombre() + "\n");
                exportar.write("Apellido" + " : " + estudiante.getApellido() + "\n");
                exportar.write("Telefono" + " : " + estudiante.getTelefono() + "\n");
                exportar.write("Semestre" + " : " + estudiante.getSemestre() + "\n");
                exportar.write("Promedio" + " : " + estudiante.getPromedio() + "\n");
                exportar.write("Serial" + " : " + estudiante.getSerial() + "\n");
                exportar.write("\n\n");
            }
            exportar.close();
            JOptionPane.showMessageDialog(null, "Datos Exportados correctamente a EstudiantesIngenieria.txt", "Exportar", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al exportar los datos: " + e.getMessage(), "Exportar", 0);
        }
    }

    public void ExportarEstudiantesDiseno(LinkedList<Estudiante_Diseno> lista) {
        JOptionPane jo = new JOptionPane();
        try {
            File archivo = new File("EstudiantesDiseno.txt");
            FileWriter exportar = new FileWriter(archivo, false);

            for (Estudiante_Diseno estudiante : lista) {
                exportar.write("Cedula" + " : " + estudiante.getCedula() + "\n");
                exportar.write("Nombre" + " : " + estudiante.getNombre() + "\n");
                exportar.write("Apellido" + " : " + estudiante.getApellido() + "\n");
                exportar.write("Telefono" + " : " + estudiante.getTelefono() + "\n");
                exportar.write("Modalidad" + " : " + estudiante.getModalidad() + "\n");
                exportar.write("Asignaturas" + " : " + estudiante.getAsignaturas() + "\n");
                exportar.write("Serial" + " : " + estudiante.getSerial() + "\n");
                exportar.write("\n\n");
            }
            exportar.close();
            JOptionPane.showMessageDialog(null, "Datos Exportados correctamente a EstudiantesDiseno.txt", "Exportar", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al exportar los datos: " + e.getMessage(), "Exportar", 0);
        }
    }

    public void mostrarContenidoArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
