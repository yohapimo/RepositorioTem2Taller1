package season2project1;

/**
 * Representa las características o atributos de la persona.
 *
 * @author Yon Hawer Piñeros
 */
public class Person {

    /**
     * Representa los atributos seleccionados.
     */
    public String name;
    public String lastName1;
    public String lastName2;
    public String dateBirth;
    public float height;

    /**
     * Representa el constructor con el cual creamos la instancia de la clase.
     * Creamos los constructores de los parámetros a utilizar.
     *
     * @param name
     * @param lastName1
     * @param lastName2
     */
    public Person(String name, String lastName1, String lastName2) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;

    }

    /**
     * Representa el acceso a los campos o atributos de la persona.
     *
     * @return Los datos solicitados de la persona.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     * Representa el método con el cual vamos a seleccionar los datos de la
     * persona.
     */
    public void createPerson() {
        System.out.println(getName() + " " + getLastName1() + " " + getLastName2());
    }
}
