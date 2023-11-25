package S15_04_Parte5;

// Estudiante: Jose Megun Cama La Madrid

public class juguete_04 {
    
    // Atributos
    String nombre;
    String marca;
    int edadMinima;
    String tipo;

    // Métodos
    public void jugar() {
        System.out.println("Estoy jugando " + nombre + " fabricado por " + marca);
    }

    public void revisarReglas() {
        System.out.println("Debo revisar las instrucciones de " + nombre);
    }

    public void informarEdad() {
        System.out.println("El juguete " + nombre + " es adecuado para personas de al menos " + edadMinima + " años.");
    }

    public void tipoJuguete() {
        System.out.println("El juguete de " + nombre + " es de tipo de " + tipo);
    }
    
}
