package season2project1;

import java.util.ArrayList;

/**
 * Representa las características o atributos de la Fruta.
 *
 * @author Yon Hawer Piñeros
 */
public class Fruit {

    /**
     * Representa los atributos seleccionados.
     */
    public String name;
    private float averageWeigth;
    public ArrayList colors;

    /**
     * Representa el constructor con el cual creamos la instancia de la clase.
     * Creamos los constructores de los parámetros a utilizar.
     *
     * @param colors
     */
    public Fruit(ArrayList colors) {
        this.colors = colors;
    }

    /**
     * Representa el acceso a los campos o atributos de la Fruta.
     *
     * @return Los datos solicitados de la Fruta.
     */
    public ArrayList getColors() {
        return colors;
    }

    public void setColors(ArrayList colors) {
        this.colors = colors;
    }

    /**
     * Representa la lista de colores de las frutas en este caso se selecciona
     * el color en la posición 3 = Orange.
     */
    public void createFruit() {

        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("White");
        colors.add("Orange");

        System.out.println(colors.get(3));

    }
}
