import javax.swing.*;
import java.text.DecimalFormat;

public class Main {

    private static double Pesos;

    public static void main(String[] args) {
        Menu menu = new Menu();
        boolean continuarPrograma = true;

        while (continuarPrograma) {
            continuarPrograma = menu.MostrarMenu(continuarPrograma);

        }

    }
}