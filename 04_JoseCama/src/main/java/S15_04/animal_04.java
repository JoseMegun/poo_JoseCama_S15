package S15_04;

/**
 *
 * @author 04_JoseCama
 */
public class animal_04 {
    
    //Atributos | O4_JoseCama
     String nombre;
     int edad;
     String especie;
     int peso;

    public animal_04(String nombre, int edad, String especie, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.peso = peso; 
    }

    //Metodos  | 04_JoseCama
    public void getNombreAnimal() {
        System.out.println("Mi nombre es: " + nombre);
    }

    public void getEdad() {
        System.out.println("Mi edad es: " + edad);
    }
    
    public void getEspecie(){
        System.out.println("Mi especie es: " + especie);
    }
    
    public void getPeso(){
        System.out.println("Mi peso es de: " + peso + " kg");
    }
}

