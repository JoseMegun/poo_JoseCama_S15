
package S15_P04_part2;

public class fruta_04 {
//Atributos | O4_JoseCama
     String nombre;
     String color;
     String vitamina;
     int peso;  
     int precio;

    //Metodos  | 04_JoseCama
    public void getNombre() {
        System.out.println("Yo soy una: " + nombre);
    }

    public void getColor(){
        System.out.println("Mi color es: " + color);
    }
    
    public void getVitamina() {
        System.out.println("Yo tengo vitamina: " + vitamina);
    }
    
    public void getPeso(){
        System.out.println("Yo peso: " + peso + " gr");
    }
    public void  getPrecio(){
        System.out.println("Yo tengo un precio de: " + precio + " soles");
    }    
}
