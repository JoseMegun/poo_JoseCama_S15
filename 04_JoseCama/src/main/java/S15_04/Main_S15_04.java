package S15_04;

/**
 *
 * @author 04_JoseCama
 */
public class Main_S15_04 {
    public static void main(String[] args){
        
        /* Objeto Calculadora | 04_JoseCama */
        calculadora_04 calculadora;
        calculadora = new calculadora_04();

        // Ejemplos de operaciones matemáticas  | 04_JoseCama 
        double resultadoSuma = calculadora.sumar(5.0, 3.0);
        System.out.println("Resultado de la suma: " + resultadoSuma);

        double resultadoResta = calculadora.restar(5.0, 3.0);
        System.out.println("Resultado de la resta: " + resultadoResta);

        double resultadoMultiplicacion = calculadora.multiplicar(5.0, 3.0);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);

        double resultadoDivision = calculadora.dividir(6.0, 2.0);
        System.out.println("Resultado de la división: " + resultadoDivision);

        double resultadoDivisionPorCero = calculadora.dividir(6.0, 0.0);
        
        
        
        
        
    }
        
}

