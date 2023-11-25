package S15_04_Parte4;

// Estudiante: Jose Megun Cama La Madrid

public class libro_04 {
    
    // Atributos
    String titulo;
    String autor;
    int paginas;
    String genero;

    // Métodos
    public void abrir() {
        System.out.println("Estoy abriendo el libro " + titulo + " escrito por " + autor);
    }
    
    public void leerPagina() {
        System.out.println("Leeré una página del libro " + titulo);
    }
    
    public void informarPaginas() {
        System.out.println("El libro tiene " + paginas + " páginas");
    }
    
    public void clasificarGenero() {
        System.out.println("El libro pertenece al género: " + genero);
    }
    
}
