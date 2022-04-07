package season2project1;

import java.util.ArrayList;

/**
 * Representa las características o atributos de la Floristería.
 *
 * @author Yon Hawer Piñeros
 */
public class FlowerShop {

    /**
     * Representa los atributos seleccionados.
     */
    public String country;
    public String climate;
    private int costFlower;
    public ArrayList typeFlower;

    /**
     * Representa el constructor con el cual creamos la instancia de la clase.
     * Creamos los constructores de los parámetros a utilizar.
     *
     * @param typeFlower
     */
    public FlowerShop(ArrayList typeFlower) {
        this.typeFlower = typeFlower;
    }

    /**
     * Representa el acceso a los campos o atributos de la Floristería.
     *
     * @return Los datos solicitados de la Floristería.
     */
    public ArrayList getTypeFlower() {
        return typeFlower;
    }

    public void setTypeFlower(ArrayList typeFlower) {
        this.typeFlower = typeFlower;
    }

    /**
     * Representa la lista de tipos de flores en este caso se selecciona el
     * nombre en la posición 2 = Orchid (Orquídea).
     */
    public void createFlower() {

        ArrayList<String> types = new ArrayList<String>();
        types.add("Rose");
        types.add("Tulip");
        types.add("orchid");
        types.add("Carnation");
        types.add("Sunflower");

        System.out.println(types.get(2));

    }
}
