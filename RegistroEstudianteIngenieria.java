package ParcialFinalEstructuras;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class RegistroEstudianteIngenieria {

    public Estudiante_Ingenieria RegistroEstudianteIngenieria(Computador_Portatil CP, LinkedList<Estudiante_Ingenieria> listaEI) {
        ValidarInput validar = new ValidarInput(); // LLAMAMOS AL MÉTODO PARA VALIDACIONES

        String nombre = validar.validarInput("Ingrese el nombre:", "^[a-zA-Z ]+$"); //LETRAS MIN MAY Y ESPACIOS
        String apellido = validar.validarInput("Ingrese el apellido:", "^[a-zA-Z ]+$");
        String cedula;
        
        boolean existe;
        do {
            cedula = validar.validarInput("Ingrese la cédula:", "\\d+");//SOLO NÚMEROS
            existe = false;
            for (Estudiante_Ingenieria EI : listaEI) {
                if (EI.getCedula().equalsIgnoreCase(cedula)) {
                    JOptionPane.showMessageDialog(null, "La cédula ingresada ya existe. Por favor, ingrese una cédula única", "ERROR", JOptionPane.ERROR_MESSAGE);
                    existe = true;
                }
            }
        } while (existe == true);
        
        String telefono = validar.validarInput("Ingrese el telefono:", "\\d{7,10}");//SOLO NÚMEROS DE 7 A 10 DIGITOS
        int semestre = Integer.parseInt(validar.validarInput("Ingrese el numero de semestre (Recuerde que máximo son 10 semestres):", "^(10|[1-9])$"));//NÚMEROS ENTRE 1 Y 10
        float promedio = Float.parseFloat(validar.validarInput("Ingrese el promedio:", "\\d+(\\.\\d+)?"));//DECIMALES CON PUNTO
        String serial = CP.getSerial();

        Estudiante_Ingenieria estudianteI = new Estudiante_Ingenieria(cedula, nombre, apellido, telefono, semestre, promedio, serial);

        return estudianteI;

    }
}
