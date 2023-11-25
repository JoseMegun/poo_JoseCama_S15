package S15_04_Parte4;

// Estudiante: Jose Megun Cama La Madrid

public class celular_04 {
    
    // Atributos
    String marca;
    String modelo;
    int almacenamiento;
    int numero;

    // Métodos
    public void llamar() {
        System.out.println("Llamando desde el teléfono " + marca + " " + modelo + ".");
    }

    public void nuevoNumero() {
        System.out.println("Mi nuevo celular tiene el numero: " + numero);
    }

    public void reproducirMusica() {
        System.out.println("Reproduciendo música en el teléfono " + marca);
    }

    public void mostrarAlmacenamiento() {
        System.out.println("El teléfono " + marca + " " + modelo + " tiene " + almacenamiento + " GB de almacenamiento.");
    }
}
