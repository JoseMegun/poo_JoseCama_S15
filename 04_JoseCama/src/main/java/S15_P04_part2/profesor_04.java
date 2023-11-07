
package S15_P04_part2;

/**
 *
 * @author Usuario12
 */
public class profesor_04 {
    //Atributos | O4_JoseCama
     String nombre;
     String especialidad;
     int celular ;
     String colegio;
     int edad;

    //Metodos  | 04_JoseCama
    public void getNombre() {
        System.out.println("Mi nombre es: " + nombre);
    }

    public void getEspecialidad() {
        System.out.println("Yo en educo con los temas de: " + especialidad);
    }
    
    public void getCelular(){
        System.out.println("Mi numero de ceular es: " + celular);
    }
    
    public void getColegio(){
        System.out.println("Yo trabajo en el colegio: " + colegio);
    }
    public void  getEdad(){
        System.out.println("Yo tengo " + edad + " de edad");
    }
}
