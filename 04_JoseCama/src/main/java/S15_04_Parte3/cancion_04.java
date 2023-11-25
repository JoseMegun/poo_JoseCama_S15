package S15_04_Parte3;

// Estudiante: Jose Megun Cama La Madrid

public class cancion_04 {
    
    // Atributos
    String titulo;
    String artista;
    int duracion;
    String genero;

    // Métodos
    public void reproducir() {
        System.out.println("Reproduciendo la cancion " + titulo + " de " + artista);
    }
    
    public void obtenerDuracion() { 
        System.out.println("La duracion de la cancion es de " + duracion + " segundos");
    }
    
    public void cambiarArtista() {
        System.out.println("La cancion es interpretada por " + artista);
    }
    
    public void clasificar() {
        System.out.println("La cancion pertenece al género: " + genero);
    }
}
