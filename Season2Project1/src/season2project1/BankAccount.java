package season2project1;

/**
 * Representa las características o atributos de la Cuenta Bancaria.
 *
 * @author Yon Hawer Piñeros
 */
public class BankAccount {

    /**
     * Representa los atributos seleccionados.
     */
    public String nameClient;
    public String lastNameClient;
    private int accountNumber;
    protected boolean activated;

    /**
     * Representa el constructor con el cual creamos la instancia de la clase.
     * Creamos los constructores de los parámetros a utilizar.
     *
     * @param activated
     */
    public BankAccount(boolean activated) {
        this.activated = activated;
    }

    /**
     * Representa el acceso a los campos o atributos de la Cuenta Bancaria.
     *
     * @return Los datos de la cuenta si esta activa o no lo esta.
     */
    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Método para imprimir la información solicitada True o False.
     */
    public void activated() {
        if (activated == true) {
            System.out.println("Account is Active");
        } else {
            System.out.println("Account is Not Active");
        }
    }
}
