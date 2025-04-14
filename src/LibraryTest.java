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


        LibraryMedia[] media = {book, movie};
        for (LibraryMedia libraryMediaItem : media) {
            if (libraryMediaItem instanceof Book) {
                ((Book) libraryMediaItem).checkNumberOfPages();
            } else if (libraryMediaItem instanceof Movie) {
                ((Movie) libraryMediaItem).checkDuration();
            }
        }
    }

}

