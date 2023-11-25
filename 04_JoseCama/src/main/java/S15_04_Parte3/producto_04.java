package S15_04_Parte3;

// Estudiante: Jose Megun Cama La Madrid

public class producto_04 {
    
    // Atributos
    String nombre;
    String categoria;
    double precio;
    int stock;
    
    // Métodos
    public void mostrarInfo() {
        System.out.println("Informacion del producto: " + nombre);
        System.out.println("categoria: " + categoria);
    }
    
    public void venta() {
        System.out.println("Venta realizada. Se compró " + nombre);
    }
    
    public void nuevoPrecio() {
        System.out.println("El nuevo precio de " + nombre + "es de s/." + precio + " soles");
    }
    
    public void reponerStock() {
        System.out.println("Se ha repuesto el stock de la venta. Nuevo stock " + stock + " unidades");
    }
}
