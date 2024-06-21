import javax.swing.*;
import java.text.DecimalFormat;

public class Main {

    private static double Pesos;

    public static void main(String[] args) {

        boolean continuarPrograma = true;

        while (continuarPrograma) {

            String[] options = { "Pesos a Euros", "Pesos a Dólares", "Pesos a Libras Esterlinas", "Pesos a Yen",
                    "Pesos a Won" };
            String choice = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                    "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            String input = JOptionPane.showInputDialog("Ingrese la cantidad en Pesos: ");
            double pesos;
            try {
                pesos = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no válido.");
                return;
            }
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");

            if (choice.equals("Pesos a Dólares")) {
                double dollars = pesos * 0.054;
                JOptionPane.showMessageDialog(null,
                        pesos + " pesos son " + FormatearDecimal.format(dollars) + " dólares.");
            } else if (choice.equals("Pesos a Euros")) {
                double euros = pesos * 0.051;
                JOptionPane.showMessageDialog(null, pesos + " Pesos son " + euros + " euros.");
            } else if (choice.equals("Pesos a Libras Esterlinas")) {
                double pounds = pesos *0.043;
                JOptionPane.showMessageDialog(null, pesos + " Pesos son " + pounds + " libras esterlinas.");
            } else if (choice.equals("Pesos a Yen")) {
                double yen = Pesos *8.63;
                JOptionPane.showMessageDialog(null, pesos + " Pesos son " + yen + " yenes japoneses.");
            } else if (choice.equals("Pesos a Won")) {
                double won = Pesos *75.59;
                JOptionPane.showMessageDialog(null, pesos + " Pesos son " + won + " wones surcoreanos.");
            }

            int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                continuarPrograma = false;
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
            }
        }

    }
}