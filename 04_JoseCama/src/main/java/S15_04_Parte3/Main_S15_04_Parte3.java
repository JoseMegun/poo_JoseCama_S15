package S15_04_Parte3;

// Estudiante: Jose Megun Cama La Madrid

public class Main_S15_04_Parte3 {

    public static void main(String[] args) {
        // Ejemplo con la clase Cancion_04
        cancion_04 miCancion = new cancion_04();
        miCancion.titulo = "Imagine";
        miCancion.artista = "John Lennon";
        miCancion.duracion = 180;
        miCancion.genero = "Pop";

        miCancion.reproducir();
        miCancion.obtenerDuracion();
        miCancion.cambiarArtista();
        miCancion.clasificar();

        // Ejemplo con la clase Empleado_04
        empleado_04 miEmpleado = new empleado_04();
        miEmpleado.nombre = "Juan Perez";
        miEmpleado.cargo = "Desarrollador";
        miEmpleado.edad = 30;
        miEmpleado.salario = 50000.0;

        miEmpleado.trabajar();
        miEmpleado.aumento();
        miEmpleado.informarEdad();
        miEmpleado.vacaciones();

        // Ejemplo con la clase Producto_04
        producto_04 miProducto = new producto_04();
        miProducto.nombre = "Smartphone";
        miProducto.categoria = "Electrónica";
        miProducto.precio = 60.00;
        miProducto.stock = 50;

        miProducto.mostrarInfo();
        miProducto.venta();
        miProducto.nuevoPrecio();
        miProducto.reponerStock();

        // Ejemplo con la clase Restaurante_04
        restaurante_04 miRestaurante = new restaurante_04();
        miRestaurante.nombre = "La Deliciosa";
        miRestaurante.tipoCocina = "Italiana";
        miRestaurante.capacidad = 100;
        miRestaurante.abierto = true;

        miRestaurante.reserva();
        miRestaurante.platoEspecial();
        miRestaurante.informarClientes();
        miRestaurante.cerrar();
    }
}
