public class BookView {
    public void displayBook(int id, String title, String author, boolean available) {
        System.out.println("---------------------------");
        System.out.println("Book ID   : " + id);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Available : " + (available ? "Yes" : "No"));
        System.out.println("---------------------------");
    }

    public void displayMessage(String message) {
        System.out.println(">> " + message);
    }
}