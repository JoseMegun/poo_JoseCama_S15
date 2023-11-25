package S15_04_Parte4;

// Estudiante: Jose Megun Cama La Madrid

public class pelicula_04 {
    
    // Atributos
    String titulo;
    String director;
    int duracion;
    String genero;

    // Métodos
    public void reproducir() {
        System.out.println("Voy a ver la pelicula " + titulo + " dirigido por " + director);
    }
    
    public void pausar() {
        System.out.println("Pausando la pelicula " + titulo);
    }
    
    public void obtenerDuracion() {
        System.out.println("La duracion de la pelicula es de " + duracion + " minutos");
    }
    
    public void clasificarGenero() {
        System.out.println("La pelicula pertenece al género: " + genero);
    }
    
}
