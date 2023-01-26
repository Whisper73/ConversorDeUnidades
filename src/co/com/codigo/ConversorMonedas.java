
package co.com.codigo;

public class ConversorMonedas {

    private double input, resultado;
    private int index1, index2;
    double dolar = 1, col = 4731.50, eu = 0.93, yen = 132.41, won = 1244.84, libra = 0.82;

    public ConversorMonedas() {

    }

    public ConversorMonedas(double input, int index1, int index2) {
        this.input = input;
        this.index1 = index1;
        this.index2 = index2;
    }

    public double convertiraDolar() {
        double resultadoDolar = 0;

        switch (this.index1) {

            case 0 ->
                resultadoDolar = (this.input * this.dolar) / this.dolar;

            case 1 ->
                resultadoDolar = (this.input * this.dolar) / this.eu;

            case 2 ->
                resultadoDolar = (this.input * this.dolar) / this.libra;

            case 3 ->
                resultadoDolar = (this.input * this.dolar) / this.yen;

            case 4 ->
                resultadoDolar = (this.input * this.dolar) / this.won;

            case 5 ->
                resultadoDolar = (this.input * this.dolar) / this.col;

        }

        return resultadoDolar;

    }

    public void convertirAmonedaFinal() {

        switch (this.index2) {

            case 0 ->
                this.resultado = convertiraDolar() * this.dolar;

            case 1 ->
                this.resultado = convertiraDolar() * this.eu;

            case 2 ->
                this.resultado = convertiraDolar() * this.libra;

            case 3 ->
                this.resultado = convertiraDolar() * this.yen;

            case 4 ->
                this.resultado = convertiraDolar() * this.won;

            case 5 ->
                this.resultado = convertiraDolar() * this.col;

        }

    }

    public double getResultado() {
        return resultado;
    }

}
