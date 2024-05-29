package ParcialFinalEstructuras;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class RegistroTablaGrafica {

    public Tabla_Grafica RegistroTablaGrafica(LinkedList<Tabla_Grafica> listaTG) {
        ValidarInput validar = new ValidarInput(); // LLAMAMOS AL MÉTODO PARA VALIDACIONES

        String serial;
        boolean existe;

        do {
            serial = validar.validarInput("Ingrese el serial:", "^[a-zA-Z0-9]+$"); // LETRAS MIN MAY Y NUMEROS
            existe = false;
            for (Tabla_Grafica tg : listaTG) {
                if (tg.getSerial().equalsIgnoreCase(serial)) {
                    JOptionPane.showMessageDialog(null, "El serial ingresado ya existe. Por favor, ingrese un serial único", "ERROR", JOptionPane.ERROR_MESSAGE);
                    existe = true;
                }
            }
        } while (existe == true);
        
        String marca = validar.validarInput("Ingrese la marca:", "^[a-zA-Z]+$");// SOLO LETRAS
        float tamano = Float.parseFloat(validar.validarInput("Ingrese el tamaño (pulgadas):", "\\d+(\\.\\d+)?"));// DECIMALES CON PUNTO
        float precio = Float.parseFloat(validar.validarInput("Ingrese el precio:", "\\d+(\\.\\d+)?"));// DECIMALES CON PUNTO
        float peso = Float.parseFloat(validar.validarInput("Ingrese el peso (kilogramos):", "\\d+(\\.\\d+)?"));// DECIMALES CON PUNTO

        int almacenamiento = 0;
        do {
            almacenamiento = Integer.parseInt(JOptionPane.showInputDialog(null, "1. 256GB\n2. 512GB\n3. 1 TB\n\nIngrese el almacenamiento:", "ALMACENAMIENTO", 3));
            switch (almacenamiento) {
                case 1:
                    almacenamiento = 256;
                    break;
                case 2:
                    almacenamiento = 512;
                    break;
                case 3:
                    almacenamiento = 1024; // 1 TB en GB
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingresaste una opción inexistente", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (almacenamiento != 256 && almacenamiento != 512 && almacenamiento != 1024);

        Tabla_Grafica tabla = new Tabla_Grafica(serial, marca, tamano, precio, almacenamiento, peso);

        return tabla;
    }

}
