package S15_04_Parte4;

// Estudiante: Jose Megun Cama La Madrid

public class aerolinea_04 {
    
    // Atributos
    String nombre;
    int vuelosDiarios;
    String marcaWiFi;
    String paisDestino;

    // Métodos
    public void reservarVuelo() {
        System.out.println("Reservando un vuelo con la aerolínea " + nombre + " hacia " + paisDestino + ".");
    }

    public void verificarWiFi() {
        System.out.println("En el avion esta utilizando el wifi de la compañia " + marcaWiFi);
    }

    public void informarNumeroVuelos() {
        System.out.println("La aerolínea " + nombre + " realiza " + vuelosDiarios + " vuelos diarios.");
    }

    public void revisarDestinos() {
        System.out.println("Estoy revisando los destinos de la aerolínea " + nombre + ".");
    }
}
