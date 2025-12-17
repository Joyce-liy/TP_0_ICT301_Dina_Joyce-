public class Main {
    public static void main(String[] args) {
        Database myDb = new MySQLDatabase(); 
        OrderProcessor order = new OrderProcessor(myDb);
        order.processOrder("'Données à sauvegarder'");
    }
}