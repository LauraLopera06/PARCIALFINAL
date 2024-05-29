package ParcialFinalEstructuras;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class SeleccionMenuEI {

    RegistroComputadorPortatil RCP = new RegistroComputadorPortatil();
    RegistroEstudianteIngenieria REI = new RegistroEstudianteIngenieria();

    public SeleccionMenuEI(String menu, LinkedList<Estudiante_Ingenieria> listaEI, LinkedList<Computador_Portatil> listaCP) {

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "MENU ESTUDIANTE INGENIERIA", 3));

            switch (opcion) {

                case 1:
                    Computador_Portatil computador = RCP.RegistroComputadorPortatil(listaCP);
                    Estudiante_Ingenieria estudianteI = REI.RegistroEstudianteIngenieria(computador, listaEI);
                    listaEI.add(estudianteI);
                    listaCP.add(computador);
                    break;

                case 2:
                    ModificarRegistro MR = new ModificarRegistro();
                    MR.ModificarRegistroEI(listaEI, listaCP);
                    break;

                case 3:

                DevolucionRegistro DR = new DevolucionRegistro();
                DR.DevolverRegistroEI(listaEI, listaCP);

                    break;

                case 4:
                    BuscarEquipo BE = new BuscarEquipo();
                    BE.BuscarEquipoEI(listaEI, listaCP);
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
