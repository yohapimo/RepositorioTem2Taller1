package season2project1;

/**
 * Representa las características o atributos de un Colegio.
 *
 * @author Yon Hawer Piñeros
 */
public class School {

    /**
     * Representa los atributos seleccionados.
     */
    public String name;
    public int numberLocations;
    public int totalTeachers;
    public int totalStudents;

    /**
     * Representa el constructor con el cual creamos la instancia de la clase.
     * Creamos los constructores de los parámetros a utilizar.
     *
     * @param totalTeachers
     * @param totalStudents
     */
    public School(int totalTeachers, int totalStudents) {
        this.totalTeachers = totalTeachers;
        this.totalStudents = totalStudents;
    }

    /**
     * Representa el acceso a los campos o atributos del Colegio.
     *
     * @return Los datos solicitados en este caso el número de profesores y el
     * número de alumnos.
     */
    public int getTotalTeachers() {
        return totalTeachers;
    }

    public void setTotalTeachers(int totalTeachers) {
        this.totalTeachers = totalTeachers;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    /**
     * Representa el método con el cual vamos a seleccionar la información
     * solicitada del colegio.
     *
     */
    public void createSchool() {

        System.out.println("#Teachers:" + getTotalTeachers() + " || " + "#Students:" + getTotalStudents());

    }
}
