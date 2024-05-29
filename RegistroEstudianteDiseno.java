package ParcialFinalEstructuras;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class RegistroEstudianteDiseno {

    public Estudiante_Diseno RegistroEstudianteDiseno(Tabla_Grafica TG, LinkedList<Estudiante_Diseno> listaED) {
        ValidarInput validar = new ValidarInput(); // LLAMAMOS AL MÉTODO PARA VALIDACIONES

        String nombre = validar.validarInput("Ingrese el nombre:", "^[a-zA-Z ]+$"); //LETRAS MIN MAY Y ESPACIOS
        String apellido = validar.validarInput("Ingrese el apellido:", "^[a-zA-Z ]+$");

        String cedula;
        boolean existe;
        do {
            cedula = validar.validarInput("Ingrese la cédula:", "\\d+");//SOLO NÚMEROS            for (Computador_Portatil cp : listaCP) {
            existe = false;
            for (Estudiante_Diseno ED : listaED) {
                if (ED.getCedula().equalsIgnoreCase(cedula)) {
                    JOptionPane.showMessageDialog(null, "La cédula ingresada ya existe. Por favor, ingrese una cédula única", "ERROR", JOptionPane.ERROR_MESSAGE);
                    existe = true;
                }
            }
        } while (existe == true);

        String telefono = validar.validarInput("Ingrese el telefono:", "\\d{7,10}");//SOLO NÚMEROS DE 7 A 10 DIGITOS
        String modalidad = validar.validarInput("Ingrese la modalidad (Presencial o Virtual):", "^(virtual|presencial)$");//SOLO ADMITE PRESENCIAL O VIRTUAL
        int asignaturas = Integer.parseInt(validar.validarInput("Ingrese la cantidad de asignaturas:", "\\d+"));
        int serial = Integer.parseInt(TG.getSerial());

        Estudiante_Diseno estudianteD = new Estudiante_Diseno(cedula, nombre, apellido, telefono, modalidad, asignaturas, serial);

        return estudianteD;
    }

}
