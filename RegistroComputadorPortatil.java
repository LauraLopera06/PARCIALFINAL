package ParcialFinalEstructuras;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class RegistroComputadorPortatil {

    public Computador_Portatil RegistroComputadorPortatil(LinkedList<Computador_Portatil> listaCP) {

        ValidarInput validar = new ValidarInput(); // LLAMAMOS AL MÉTODO PARA VALIDACIONES

        String serial;
        boolean existe;

        do {
            serial = validar.validarInput("Ingrese el serial:", "^[a-zA-Z0-9]+$"); //LETRAS MIN MAY Y NUMEROS
            existe = false;
            for (Computador_Portatil cp : listaCP) {
                if (cp.getSerial().equalsIgnoreCase(serial)) {
                    JOptionPane.showMessageDialog(null, "El serial ingresado ya existe. Por favor, ingrese un serial único", "ERROR", JOptionPane.ERROR_MESSAGE);
                    existe = true;
                }
            }
        } while (existe == true);

        String marca = validar.validarInput("Ingrese la marca:", "^[a-zA-Z]+$");//SOLO LETRAS
        float tamano = Float.parseFloat(validar.validarInput("Ingrese el tamaño (pulgadas):", "\\d+(\\.\\d+)?"));//DECIMALES CON PUNTO
        float precio = Float.parseFloat(validar.validarInput("Ingrese el precio:", "\\d+(\\.\\d+)?"));//DECIMALES CON PUNTO

        int sistema = 0;
        do {
            sistema = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Windows 7"
                    + "\n2. Windows 10"
                    + "\n3. Windows 11"
                    + "\n\nIngrese el sistema:", "SISTEMA", 3));

            switch (sistema) {
                case 1:
                    sistema = 1;
                    break;

                case 2:
                    sistema = 2;
                    break;

                case 3:
                    sistema = 3;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Ingresaste una opcion inexistente", "ERROR", 0);
                    break;
            }
        } while (sistema != 1 && sistema != 2 && sistema != 3);

        int procesador = 0;
        do {
            procesador = Integer.parseInt(JOptionPane.showInputDialog(null, "1. AMD Ryzen"
                    + "\n2. Intel® Core™ i5"
                    + "\n\nIngrese el procesador:", "PROCESADOR", 3));

            switch (procesador) {
                case 1:
                    procesador = 1;
                    break;

                case 2:
                    procesador = 2;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Ingresaste una opcion inexistente", "ERROR", 0);
                    break;
            }
        } while (procesador != 1 && procesador != 2 && procesador != 3);

        Computador_Portatil computador = new Computador_Portatil(serial, marca, tamano, precio, sistema, procesador);

        return computador;
    }
}
