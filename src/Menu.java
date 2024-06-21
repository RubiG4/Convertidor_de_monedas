import javax.swing.*;
import java.text.DecimalFormat;

public class Menu {
    private boolean continuarPrograma;
    private double pesoConvertido;
    static double pesos;

    //La funcion MostrarMenu va regresar un valor true o false y tiene como parametro la variable continuarPrograma
    public boolean MostrarMenu(boolean continuarPrograma){
        //Se crea una instancia a la clase Moneda mediante la variable llama moneda
        Moneda moneda = new Moneda();
        String[] options = { "Pesos a Euros", "Pesos a Dólares", "Pesos a Libras Esterlinas", "Pesos a Yen",
                "Pesos a Won" };
        String choice = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        String input = JOptionPane.showInputDialog("Ingrese la cantidad en Pesos: ");

        try {
            pesos = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor no válido.");

        }
        DecimalFormat FormatearDecimal = new DecimalFormat("#.##");

        if (choice.equals("Pesos a Dólares")) {

            double dollars = moneda.calcular(pesos, "Pesos a Dólares" );
            JOptionPane.showMessageDialog(null,
                    pesos + " pesos son " + FormatearDecimal.format(dollars) + " dólares.");
        } else if (choice.equals("Pesos a Euros")) {
            //la varaible
            this.pesoConvertido = moneda.calcular(pesos, "Pesos a Euros");
            JOptionPane.showMessageDialog(null, pesos + " Pesos son " + pesoConvertido + " euros.");
        } else if (choice.equals("Pesos a Libras Esterlinas")) {
            this.pesoConvertido = moneda.calcular(pesos, "Pesos a Libras Esterlinas");
            JOptionPane.showMessageDialog(null, pesos + " Pesos son " + pesoConvertido + " libras esterlinas.");
        } else if (choice.equals("Pesos a Yen")) {
            this.pesoConvertido = moneda.calcular(pesos,"Pesos a Yen" );
            JOptionPane.showMessageDialog(null, pesos + " Pesos son " + pesoConvertido + " yenes japoneses.");
        } else if (choice.equals("Pesos a Won")) {
            this.pesoConvertido = moneda.calcular(pesos,"Pesos a Won" );
            JOptionPane.showMessageDialog(null, pesos + " Pesos son " + pesoConvertido + " wones surcoreanos.");
        }

        int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
            continuarPrograma = false;
            JOptionPane.showMessageDialog(null, "Programa Finalizado");
        }
        //En este return va regresar un true o false dependiendo si el usuario decide terminar el programa
        return  continuarPrograma;
    }

}
