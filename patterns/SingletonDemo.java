public class SingletonDemo {
    public static void main(String[] args) {
        DatabaseConnection c1 = DatabaseConnection.getInstance();
        DatabaseConnection c2 = DatabaseConnection.getInstance();

        c1.query("SELECT * FROM Book");
        c2.query("SELECT * FROM Member");

        System.out.println("Same object? " + (c1 == c2));
    }
}