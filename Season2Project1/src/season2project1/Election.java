package season2project1;

/**
 * Representa las características o atributos de la Votación.
 *
 * @author Yon Hawer Piñeros
 */
public class Election {

    /**
     * Representa los atributos seleccionados.
     */
    public String location;
    private int tableNumber;
    protected boolean qualifiedPerson;

    /**
     * Representa el constructor con el cual creamos la instancia de la clase.
     * Creamos los constructores de los parámetros a utilizar.
     *
     * @param qualifiedPerson
     */
    public Election(boolean qualifiedPerson) {
        this.qualifiedPerson = qualifiedPerson;
    }

    /**
     * Representa el acceso a los campos o atributos de las Votaciones.
     *
     * @return Los datos de la personas habilitadas a votar.
     */
    public boolean isQualifiedPerson() {
        return qualifiedPerson;
    }

    public void setQualifiedPerson(boolean qualifiedPerson) {
        this.qualifiedPerson = qualifiedPerson;
    }

    /**
     * Método para imprimir la información solicitada True o False.
     */
    public void qualified() {
        if (qualifiedPerson == true) {
            System.out.println("the person is qualified to vote.");

        } else {
            System.out.println("the person is not qualified to vote.");

        }
    }
}
