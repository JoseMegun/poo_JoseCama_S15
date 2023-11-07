package S15_04;

/**
 *
 * @author 04_JoseCama
 */
public class calculadora_04 {
    
    // Método para sumar dos números
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    // Método para restar dos números
    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    // Método para multiplicar dos números
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Método para dividir dos números
    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; // Devuelve NaN (Not-a-Number) en caso de división por cero.
        }
    }

    }

