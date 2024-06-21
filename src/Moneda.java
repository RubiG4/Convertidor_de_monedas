public class Moneda {

    private double pesoConvertido;

    public double calcular(double pesoConvertido, String opcion) {
        switch (opcion) {
            case "Pesos a Dólares":
                this.pesoConvertido = pesoConvertido * 0.054;
            break;

            case "Pesos a Euros":
                this.pesoConvertido = pesoConvertido * 0.051;
            break;

            case "Pesos a Libras Esterlinas":
                this.pesoConvertido = pesoConvertido * 0.043;
            break;

            case "Pesos a Yen":
                this.pesoConvertido = pesoConvertido * 8.63;
            break;

            case "Pesos a Won":
                this.pesoConvertido = pesoConvertido * 75.59;
            break;
        }

        return this.pesoConvertido;
    }

}
