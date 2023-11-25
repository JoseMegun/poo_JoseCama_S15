package S15_04_Parte3;

// Estudiante: Jose Megun Cama La Madrid

public class restaurante_04 {
    
    // Atributos
    String nombre;
    String tipoCocina;
    int capacidad;
    boolean abierto;

    // Métodos
    public void reserva() {
        System.out.println("El restaurante " + nombre + " ha recibido una reserva para hoy");
    }
    
    public void platoEspecial() {
        System.out.println("El restaurante esta preparando su plato especial: " + tipoCocina);
    }
    
    public void informarClientes() {
        System.out.println("El restaurante tiene capacidad de " + capacidad + " clientes");
    }
    
    public void cerrar() {
        abierto = false;
        System.out.println("El restaurante " + nombre + " ha cerrado por hoy");
    }
    
}
