//A) Se crea la CLASE Persona con Modificador Acceso Private para el ENCAPSULAMIENTO de los Datos de la persona
public class Persona {
    private String nombre; //Atributo Privado nombre, solo accesible mediante metodo publico (Getters)
    private String apellido; //Atributo Privado apellido, solo accesible mediante metodo publico (Getters)
    private String genero; //Atributo Privado genero, solo accesible mediante metodo publico (Getters)
    private int edad; //Atributo Privado edad, solo accesible mediante metodo publico (Getters)


    // CONSTRUCTOR para inicializar el objeto Persona
    public Persona(String nombre, String apellido, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }

    //ABSTRACCION (Al ocultar la Clase Persona se exponen solo metodos necesarios GETTERS
    //Métodos de acceso (Getters)
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }
}
