
package co.com.codigo;

public class ConversorUnidadesDeLongitud {

    private double input, resultado;
    private int index1, index2;

    public ConversorUnidadesDeLongitud() {

    }

    
    
    public ConversorUnidadesDeLongitud(double input, int index1, int index2) {
        this.input = input;
        this.index1 = index1;
        this.index2 = index2;
    }


    public double ConvertirAcentimetro() {
        double num = 0;
        switch (this.index1) {

            case 0 ->
                num = this.input;
            case 1 ->
                num = this.input / 10;
            case 2 ->
                num = this.input * 100;
            case 3 ->
                num = this.input * 100000;
            case 4 ->
                num = this.input * 30.48;
            case 5 ->
                num = this.input * 2.54;

        }

        return num;
    }

    public void ResultadoFinal() {
        switch (this.index2) {

            case 0 ->
                this.resultado = ConvertirAcentimetro();
            case 1 ->
                this.resultado = ConvertirAcentimetro() * 10;
            case 2 ->
                this.resultado = ConvertirAcentimetro() / 100;
            case 3 ->
                this.resultado = ConvertirAcentimetro() / 100000;
            case 4 ->
                this.resultado = ConvertirAcentimetro() / 30.48;
            case 5 ->
                this.resultado = ConvertirAcentimetro() / 2.54;

        }

    }

    public double getResultado() {
        return resultado;
    }

}
