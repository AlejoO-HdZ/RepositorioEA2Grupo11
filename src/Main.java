import java.util.Scanner; //Se importa Libreria SCANNER para la captura de Datos des Consola

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona[] personas = new Persona[5]; // Almacena 5 Personas (Se usa un Array en vez de ArrayList para un tamaño fijo de 5 elementos)

        //B) CAPTURA de Datos (NOMBRE APELLIDO GENERO EDAD) de 5 Personas (Datos capturados por TECLADO)
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el NOMBRE de la persona " + (i + 1) + ":");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el APELLIDO:");
            String apellido = scanner.nextLine();
            System.out.println("Ingrese el GENERO (Masculino/Femenino):");
            String genero = scanner.nextLine();
            System.out.println("Ingrese la EDAD (Años Cumplidos):");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            personas[i] = new Persona(nombre, apellido, genero, edad);
        }

        //MOSTRAR nombres y generos de las 5 personas
        mostrarNombresYGeneros(personas);

        scanner.close();
    }

    //B) METODO para RETORNAR nombres y géneros
    public static void mostrarNombresYGeneros(Persona[] personas) {
        System.out.println("Lista de nombres y generos:");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Género: " + persona.getGenero());
        }
    }