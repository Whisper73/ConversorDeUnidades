
package co.com.codigo;

public class ConversorTemperatura {

    private double input, resultado;
    private int index1, index2;

    public ConversorTemperatura() {
    }

    public ConversorTemperatura(double input, int index1, int index2) {
        this.input = input;
        this.index1 = index1;
        this.index2 = index2;
    }

        /*
    
    Kelvin (K)
Celsius (°C)
Fahrenheit (°F)
Rankine (°R, °Ra)

    */
    public double ConvertirAcelcius() {

        double num = 0;
        switch (this.index1) {
            case 0 ->
                num = this.input - 273.15;
            case 1 ->
                num = this.input;   
            case 2 ->
                num = (this.input -  32)/1.8;
            case 3 ->
                num = (this.input - 491.67)/1.8;
       
        }

        return num;
    }

    public void TemperaturaFinal() {
        switch (this.index2) {
            case 0 ->
                this.resultado = ConvertirAcelcius() + 273.15;
            case 1 ->
                this.resultado = ConvertirAcelcius();
            case 2 ->
                this.resultado = (1.8 * ConvertirAcelcius()) + 32;
            case 3 ->
                this.resultado = (ConvertirAcelcius() + 273.15) * 1.8;
 
        }

    }

    public double getResultado() {
        return resultado;
    }

}
