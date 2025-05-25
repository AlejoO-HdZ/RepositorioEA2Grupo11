import java.util.Scanner; //Se importa Libreria SCANNER para la captura de Datos desde Consola
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona[] personas = new Persona[5]; // Almacena 5 Personas (Se usa un Array en vez de ArrayList para un tamaño fijo de 5 elementos)

        //B) CAPTURA de Datos (NOMBRE APELLIDO GENERO EDAD) de 5 Personas (Datos capturados por TECLADO)
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el NOMBRE de la persona " + (i + 1) + ":");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el APELLIDO de la persona " + (i + 1) + ":");
            String apellido = scanner.nextLine();

            // PLUS - Validación de género (Con las estructura del ciclo While se controlan los valores correctos y esperados)
            String genero;
            while (true) {
                System.out.println("Ingrese el GENERO (Masculino/Femenino) de la persona " + (i + 1) + ":");
                genero = scanner.nextLine();
                if (genero.equalsIgnoreCase("Masculino") || genero.equalsIgnoreCase("Femenino")) {
                    break;
                } else {
                    System.out.println("Género no válido. Ingrese 'Masculino' o 'Femenino'.");
                }
            }
            // PLUS - Validación de edad en el rango de 1 a 120 (se controla que sea un numero entero valido y logico)
            int edad;
            while (true) {
                System.out.println("Ingrese EDAD de la persona " + (i + 1) + " en Años Cumplidos (entre 1 y 120):");
                if (scanner.hasNextInt()) {
                    edad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    if (edad >= 1 && edad <= 120) {
                        break;
                    } else {
                        System.out.println("Edad no válida. Ingrese un número entre 1 y 120.");
                    }
                } else {
                    System.out.println("Entrada no válida. Ingrese un número entero.");
                    scanner.nextLine(); // Limpiar el buffer de entrada
                }
            }

            personas[i] = new Persona(nombre, apellido, genero, edad);
        }

        //MOSTRAR nombres y generos de las 5 personas
        mostrarNombresYGeneros(personas);

        //MOSTRAR promedio de edades
        System.out.println("El PROMEDIO de EDAD de las 5 personas es: " + calcularPromedioEdad(personas));

        // MOSTRAR cantidad de personas por género
        System.out.println("CANTIDAD de personas con genero MASCULINO: " + contarGenero(personas, "Masculino"));
        System.out.println("CANTIDAD de personas con genero FEMENINO: " + contarGenero(personas, "Femenino"));

        scanner.close();
    }

    //B) METODO para RETORNAR nombres y géneros
    public static void mostrarNombresYGeneros(Persona[] personas) {
        System.out.println(); // Línea vacía para Mejorar visualizacion de datos en consola
        System.out.println("Lista de nombres y generos:");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Género: " + persona.getGenero());
        }
    }

    //C) METODO para CALCULAR PROMEDIO de edad
    public static double calcularPromedioEdad(Persona[] personas) {
        System.out.println(); // Línea vacía para Mejorar visualizacion de datos en consola
        int sumaEdades = 0;
        for (Persona persona : personas) {
            sumaEdades += persona.getEdad();
        }
        return (double) sumaEdades / personas.length;
    }

    // D Y E) METODO para CONTAR la CANTIDAD de personas por cada género
    // POLIMORFISMO Este metodo permite contar diferentes tipos de genero segun un parametro
    public static int contarGenero(Persona[] personas, String generoBuscado) {
        int contador = 0;
        for (Persona persona : personas) {
            if (persona.getGenero().equalsIgnoreCase(generoBuscado)) {
                contador++;
            }
        }
        return contador;
    }
}

