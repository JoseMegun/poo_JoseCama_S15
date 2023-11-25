package S15_04_Parte5;

// Estudiante: Jose Megun Cama La Madrid

public class videojuego_04 {
    
    //Atributos
    String nombre;
    String genero;
    int cantidad;
    String empresa;
    
    // Metodos
    public void jugar() {
        System.out.println("El dia de voy a jugar: " + nombre);
    }
    
    public void tipoJuego() {
        System.out.println("El juego es de género: " + genero);
    }
    
    public void ventas() {
        System.out.println("El juego " + nombre + " ha vendido actualmente " + cantidad + " millones de copias");
    }
    
    public void origen() {
        System.out.println("El juego fue creado por la empresa: " + empresa);
    }
}
