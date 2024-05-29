package ParcialFinalEstructuras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class importarE {

    public LinkedList<Object> importarEstudiantes(String archivo) {
        LinkedList<Object> lista = new LinkedList<>();
        try {
            BufferedReader importar = new BufferedReader(new FileReader(archivo));
            String linea = "";
            while ((linea = importar.readLine()) != null) {
                String[] lineas = linea.split(":");
                String atributo = lineas[0].toLowerCase().trim();
                String valor = lineas[1].trim();
                switch (atributo) {
                    case "ingenieria":
                        String cedulaIng = valor;
                        String nombreIng = importar.readLine().split(":")[1].trim();
                        String apellidoIng = importar.readLine().split(":")[1].trim();
                        String telefonoIng = importar.readLine().split(":")[1].trim();
                        int semestreIng = Integer.parseInt(importar.readLine().split(":")[1].trim());
                        float promedioIng = Float.parseFloat(importar.readLine().split(":")[1].trim());
                        String serialIng = importar.readLine().split(":")[1].trim();
                        Estudiante_Ingenieria estudianteIng = new Estudiante_Ingenieria(cedulaIng, nombreIng, apellidoIng, telefonoIng, semestreIng, promedioIng, serialIng);

                        lista.add(estudianteIng);
                        // Leer la línea en blanco entre estudiantes
                        importar.readLine();
                        break;

                    case "diseno":
                        String cedulaDis = valor;
                        String nombreDis = importar.readLine().split(":")[1].trim();
                        String apellidoDis = importar.readLine().split(":")[1].trim();
                        String telefonoDis = importar.readLine().split(":")[1].trim();
                        String modalidadDis = importar.readLine().split(":")[1].trim();
                        int asignaturasDis = Integer.parseInt(importar.readLine().split(":")[1].trim());
                        String serialDis = importar.readLine().split(":")[1].trim();
                        Estudiante_Diseno estudianteDis = new Estudiante_Diseno(cedulaDis, nombreDis, apellidoDis, telefonoDis, modalidadDis, asignaturasDis, asignaturasDis);

                        lista.add(estudianteDis);
                        // Leer la línea en blanco entre estudiantes
                        importar.readLine();
                        break;

                    default:
                        break;
                }
            }
            importar.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
