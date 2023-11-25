package S15_04_Parte5;

// Estudiante: Jose Megun Cama La Madrid

public class Main_S15_04_Parte5 {
    
    public static void main(String[] args) {
        // Ejemplo con la clase Comida_04
        comida_04 comida = new comida_04();
        comida.nombre = "Pizza";
        comida.tipo = "Hawaiana";
        comida.precio = 20;
        comida.cantidad = 6;
        
        comida.comidaFavorita();
        comida.tipoComida();
        comida.costo();
        comida.numeroComida();

        // Ejemplo con la clase Escuela_04
        escuela_04 escuela = new escuela_04();
        escuela.nombre = "Gerardo Salomon Mejia Saco";
        escuela.ubicacion = "Cerro Azul";
        escuela.estudiantes = 500;
        escuela.cursos = 10;

        escuela.informarEstudiantes();
        escuela.realizarClase();
        escuela.lugarColegio();
        escuela.cantidadCursos();

        // Ejemplo con la clase Juguete_04
        juguete_04 juguete = new juguete_04();
        juguete.nombre = "Monopoly";
        juguete.marca = "Hasbro";
        juguete.edadMinima = 3;
        juguete.tipo = "Entretenimiento";

        juguete.jugar();
        juguete.revisarReglas();
        juguete.informarEdad();
        juguete.tipoJuguete();

        // Ejemplo con la clase Videojuego_04
        videojuego_04 videojuego = new videojuego_04();
        videojuego.nombre = "The Legend of Zelda: Breath of the Wild";
        videojuego.genero = "Aventura";
        videojuego.cantidad = 20;
        videojuego.empresa = "Nintendo";

        videojuego.jugar();
        videojuego.tipoJuego();
        videojuego.ventas();
        videojuego.origen();
    }
}
