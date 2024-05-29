package ParcialFinalEstructuras;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class SeleccionMenuED {

    RegistroTablaGrafica RTG = new RegistroTablaGrafica();
    RegistroEstudianteDiseno RED = new RegistroEstudianteDiseno();

    public SeleccionMenuED(String menu, LinkedList<Estudiante_Diseno> listaED, LinkedList<Tabla_Grafica> listaTG){

        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "MENU ESTUDIANTE DISENO", 3));

            switch (opcion) {

                case 1:
                    Tabla_Grafica tabla = RTG.RegistroTablaGrafica(listaTG);
                    Estudiante_Diseno estudianteD = RED.RegistroEstudianteDiseno(tabla, listaED);
                    listaED.add(estudianteD);
                    listaTG.add(tabla);
                    break;

                case 2:
                    ModificarRegistro MR = new ModificarRegistro();
                    MR.ModificarRegistroED(listaED, listaTG);
                    break;

                case 3:

                    DevolucionRegistro DR = new DevolucionRegistro();
                    DR.DevolverRegistroED(listaED, listaTG);

                    break;

                case 4:
                    BuscarEquipo BE = new BuscarEquipo();
                    BE.BuscarEquipoED(listaED, listaTG);
                    break;

                case 5:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Ingresaste una opcion inexistente", "ERROR", 0);
                    break;

            }

        } while (opcion != 5);
    }

}
