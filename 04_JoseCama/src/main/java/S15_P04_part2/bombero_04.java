
package S15_P04_part2;

/**
 *
 * @author Usuario12
 */
public class bombero_04 {
    //Atributos | O4_JoseCama
     String nombre;
     String herramienta;
     String mascota;  // Nombre del perro dalmata
     int edad;
     String distrito;

    //Metodos  | 04_JoseCama
    public void getNombre() {
        System.out.println("Mi nombre es: " + nombre);
    }

    public void getHerramienta() {
        System.out.println("Yo utilizo una: " + herramienta);
    }
    
    public void getMascota(){
        System.out.println("Tenemos un perro dalmata llamado: " + mascota);
    }
    
    public void getEdad(){
        System.out.println("Yo tengo: " + edad);
    }
    public void  getDistrito(){
        System.out.println("Yo protejo al distrito de: " + distrito);
    }
}
