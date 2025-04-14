import java.lang.reflect.Array;


public class LibraryTest {
    public static void main(String[] args) {
        Book firstBook = new Book("Harry Potter", 1994, "J.K. Rowling", 346);
        Book secondBook = new Book("I love Java", 1999, "Dima", 1465);
        Movie firstMovie = new Movie("Java is Goat", 2018, "Tim Burton", 137);
        Movie secondMovie = new Movie("Java is Goat the sequel", 2023, "Tim Burton", 98);
        LibraryMedia[] libraryMedia = {firstBook, secondBook, firstMovie, secondMovie};
        for (LibraryMedia libraryMediaItem : libraryMedia) {
            libraryMediaItem.displayInformation();
        }
        firstBook.checkNumberOfPages();
        secondBook.checkNumberOfPages();
        firstMovie.checkDuration();
        secondMovie.checkDuration();

        LibraryMedia book = firstBook;
        LibraryMedia movie = firstMovie;

        firstBook.borrow();
        firstBook.borrow();




        LibraryMedia[] media = {book, movie};
        for (LibraryMedia libraryMediaItem : media) {
            if (libraryMediaItem instanceof Book) {
                ((Book) libraryMediaItem).checkNumberOfPages();
            } else if (libraryMediaItem instanceof Movie) {
                ((Movie) libraryMediaItem).checkDuration();
            }
        }
        // Creating objects of different types
        Book book1 = new Book("The Witcher", 1990, "Andrzej Sapkowski",
                320);
        Movie movie1 = new Movie("The Green Mile", 1999, "Frank Darabont",
                189);
        // Demonstrating polymorphism – storing different types in a base class array
        LibraryMedia[]mediaArray = new LibraryMedia[2];
        mediaArray[0] = book1;   // Book object stored as LibraryMedia
        mediaArray[1] = movie1;  // Movie object stored as LibraryMedia
        // Demonstrating polymorphism – calling methods on different types
        System.out.println("===== INFORMATION ABOUT ALL MEDIA =====");
        for (LibraryMedia media1 : mediaArray) {
            // Same method name, but the correct implementation is called
            // depending on the actual object type (polymorphism)
            media1.displayInformation();
            System.out.println("--------------------");
        }
        // Demonstrating borrowing and returning operations
        System.out.println("\n===== BORROWING AND RETURNING OPERATIONS ===== ");
        book1.borrow();  // Borrowing the book
        book1.borrow();  // Attempting to borrow again – should show that it’s already borrowed
        book1.returnMedia();  // Returning the book
        // Calling type-specific methods
        System.out.println("\n===== TYPE-SPECIFIC METHODS =====");
        book1.checkNumberOfPages();   // Method specific to Book
        movie1.checkDuration();       // Method specific to Movie
// Demonstrating casting to call type-specific methods via base class reference
    System.out.println("\n===== TYPE CASTING =====");
        for (LibraryMedia media1 : mediaArray) {
            if (media1 instanceof Book) {
                // Cast and call the method specific to Book
                Book b = (Book) media1;
                b.checkNumberOfPages();
                // Alternatively, use one-liner cast:
                // ((Book) media).checkNumberOfPages();
            } else if (media1 instanceof Movie) {
                // Cast and call the method specific to Movie
                ((Movie) media1).checkDuration();
            }
        }

    }


}

