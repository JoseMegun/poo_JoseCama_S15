package S15_04;

/**
 *
 * @author 04_JoseCama
 */
public class estudiante_04 {
    
    //Atributos | O4_JoseCama
     String nombre;
     int edad;
     String colegio;
     int celular;

    public estudiante_04(String nombre, int edad, String colegio, int celular) {
        this.nombre = nombre;
        this.edad = edad;
        this.colegio = colegio;
        this.celular = celular; 
    }

    //Metodos  | 04_JoseCama
    public void getNombre() {
        System.out.println("Mi nombre es: " + nombre);
    }

    public void getEdad() {
        System.out.println("Mi edad es: " + edad);
    }
    
    public void getColegio(){
        System.out.println("yo estudio en: " + colegio);
    }
    
    public void getCelular(){
        System.out.println("Mi numero de celular es: " + celular);
    }
    
  }
