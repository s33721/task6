public class Book extends LibraryMedia {
    private String author;
    private int numberOfPages;

    public Book(String title, int publicationYear, String author, int numberOfPages) {
        super(title, publicationYear);
        this.author = author;
        if (numberOfPages > 0) this.numberOfPages = numberOfPages;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + numberOfPages);
    }

    public void checkNumberOfPages() {
        if (this.numberOfPages > 500) {
            System.out.println("This book is a long one");
        } else {
            System.out.println("This book is a standard one");
        }
    }


}
