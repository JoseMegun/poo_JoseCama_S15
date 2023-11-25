package S15_04_Parte3;

// Estudiante: Jose Megun Cama La Madrid

public class empleado_04 {
    
    // Atributos
    String nombre;
    String cargo;
    int edad;
    double salario;
    
    // Métodos
    public void trabajar() {
        System.out.println(nombre + " esta trabajando como " + cargo);
    }
    
    public void aumento() {
        System.out.println(nombre + " ha recibido un aumento. Su nuevo salario es: s/." + salario + " soles");
    }
    
    public void informarEdad() {
        System.out.println(nombre + " tiene " + edad + " años");
    }
    
    public void vacaciones() {
        System.out.println(nombre + " esta tomando vacaciones");
    }
}
