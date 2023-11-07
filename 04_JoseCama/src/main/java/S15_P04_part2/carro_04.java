
package S15_P04_part2;

/**
 *
 * @author Usuario12
 */
public class carro_04 {
    //Atributos | O4_JoseCama
     String auto;
     String marca;
     String color;
     int modelo;  // POR ejemplo: "Yo soy modelo: 2023"
     int velocidad;

    //Metodos  | 04_JoseCama
    public void getAuto() {
        System.out.println("Yo soy una: " + auto);
    }

    public void getMarca() {
        System.out.println("Yo soy marca: " + marca);
    }
    
    public void getColor(){
        System.out.println("Mi color es: " + color);
    }
    
    public void getModelo(){
        System.out.println("Yo soy modelo: " + modelo);
    }
    public void  getVelocidad(){
        System.out.println("Yo voy a una velocidad de: " + velocidad + "km");
    }
}
