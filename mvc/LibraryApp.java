public class LibraryApp {
    public static void main(String[] args) {
        Book book = new Book(101, "Java Programming", "James Gosling");
        BookView view = new BookView();
        BookController controller = new BookController(book, view);

        controller.updateView();
        controller.issueBook();
        controller.updateView();
        controller.issueBook();
        controller.returnBook();
        controller.updateView();
    }
}