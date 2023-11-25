package S15_04_Parte4;

// Estudiante: Jose Megun Cama La Madrid

public class Main_S15_04_Parte4 {
    public static void main(String[] args) {
        
        // Ejemplo con la clase Pelicula_04
        pelicula_04 peli = new pelicula_04();
        peli.titulo = "Inception";
        peli.director = "Christopher Nolan";
        peli.duracion = 148;
        peli.genero = "Ciencia Ficción";

        peli.reproducir();
        peli.pausar();
        peli.obtenerDuracion();
        peli.clasificarGenero();

        // Ejemplo con la clase Celular_04
        celular_04 cel = new celular_04();
        cel.marca = "Samsung";
        cel.modelo = "Galaxy S21";
        cel.almacenamiento = 128;
        cel.numero = 123456789;

        cel.llamar();
        cel.nuevoNumero();
        cel.mostrarAlmacenamiento();
        cel.reproducirMusica();

        // Ejemplo con la clase Aerolinea_04
        aerolinea_04 aero = new aerolinea_04();
        aero.nombre = "Airways";
        aero.vuelosDiarios = 100;
        aero.marcaWiFi = "SkyNet";
        aero.paisDestino = "España";

        aero.reservarVuelo();
        aero.verificarWiFi();
        aero.informarNumeroVuelos();
        aero.revisarDestinos();

        // Ejemplo con la clase Libro_04
        libro_04 lib = new libro_04();
        lib.titulo = "1984";
        lib.autor = "George Orwell";
        lib.paginas = 328;
        lib.genero = "Distopía";

        lib.abrir();
        lib.leerPagina();
        lib.informarPaginas();
        lib.clasificarGenero();
    }
}
