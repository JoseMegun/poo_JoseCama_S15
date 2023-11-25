package S15_04_Parte5;

// Estudiante: Jose Megun Cama La Madrid

public class escuela_04 {
    
    // Atributos
    String nombre;
    String ubicacion;
    int estudiantes;
    int cursos;

    // Métodos
    public void informarEstudiantes() {
        System.out.println("La escuela " + nombre + " tiene " + estudiantes + " estudiantes");
    }
    
    public void realizarClase() {
        System.out.println("Realizando una clase en la escuela " + nombre);
    }
    
    public void lugarColegio() {
        System.out.println("El colegio esta ubicado en " + ubicacion);
    }
    
    public void cantidadCursos() {
        System.out.println("El colegio tiene cursos en total: " + cursos);
    }
    
}
