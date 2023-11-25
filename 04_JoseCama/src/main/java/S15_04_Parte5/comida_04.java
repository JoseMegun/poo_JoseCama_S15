package S15_04_Parte5;

// Estudiante: Jose Megun Cama La Madrid

public class comida_04 {
    
    // Atributos
    String nombre;
    String tipo;
    int precio;
    int cantidad;

    // Métodos
    public void comidaFavorita() {
        System.out.println("Mi comida favorita es: " + nombre);
    } 
    
    public void tipoComida() {
        System.out.println("La " + nombre + " es de tipo " + tipo);
    }
    
    public void costo() {
        System.out.println("El precio de la " + nombre + " es de s/. " + precio + " soles");
    }
    
    public void numeroComida() {
        System.out.println("Tendremos una fiesta, donde compraremos " + cantidad + " " + nombre);
    }
}

