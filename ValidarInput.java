package ParcialFinalEstructuras;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class ValidarInput {
   
    public String validarInput(String mensaje, String regex) { //método para validaciones

        Pattern pattern = Pattern.compile(regex);
        String input = JOptionPane.showInputDialog(null, mensaje, "", JOptionPane.QUESTION_MESSAGE);
        Matcher matcher = pattern.matcher(input);

        while (!matcher.matches()) {
            JOptionPane.showMessageDialog(null, "Inténtelo de nuevo. " + mensaje, "Error", JOptionPane.ERROR_MESSAGE);
            input = JOptionPane.showInputDialog(null, mensaje, "", JOptionPane.QUESTION_MESSAGE);
            matcher = pattern.matcher(input);
        }
        return input;

    } 
}
