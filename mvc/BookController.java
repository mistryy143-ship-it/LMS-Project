public class BookController {
    private Book model;
    private BookView view;

    public BookController(Book model, BookView view) {
        this.model = model;
        this.view = view;
    }

    public void issueBook() {
        if (model.isAvailable()) {
            model.setAvailable(false);
            view.displayMessage("Book issued successfully.");
        } else {
            view.displayMessage("Book is already issued.");
        }
    }

    public void returnBook() {
        if (!model.isAvailable()) {
            model.setAvailable(true);
            view.displayMessage("Book returned successfully.");
        } else {
            view.displayMessage("This book was not issued.");
        }
    }

    public void updateView() {
        view.displayBook(model.getBookId(), model.getTitle(),
                         model.getAuthor(), model.isAvailable());
    }
}