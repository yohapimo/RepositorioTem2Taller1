package season2project1;

/**
 * Clase Main.
 *
 * Representa las instancias de las clases.
 *
 * @version 01.01.01 2022-04-06
 *
 * @author Yon Hawer Piñeros - yonhawer@hotmail.com
 *
 * @since Clase Main presente desde la versión 01
 */
public class Season2Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * Representa las instancias de las 6 clases creadas y así obtener la
         * información solicitada por el usuario.
         */
        Person objPerson = new Person("Name1", "LastNane1", "LastName2");
        objPerson.createPerson();

        Fruit objFruit = new Fruit(null);
        objFruit.createFruit();

        BankAccount objBankAccount = new BankAccount(true);
        objBankAccount.activated();

        School objSchool = new School(50, 2000);
        objSchool.createSchool();

        FlowerShop objFlowerShop = new FlowerShop(null);
        objFlowerShop.createFlower();

        Election objElection = new Election(false);
        objElection.qualified();

    }

}
