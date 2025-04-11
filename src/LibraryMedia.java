public class LibraryMedia {
    String title;
    int publicationYear;
    boolean available;

    public LibraryMedia(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.available = true;
    }

    public void borrow(String title) {
        if (available) {
            System.out.println("This media has been borrowed");
            this.available = false;
        } else {
            System.out.println("This media has not been borrowed");
        }
    }

    public void returnMedia(){
        if (!available){
            this.available = true;
            System.out.println("This media has been returned");
        }
        else{
            System.out.println("This media hasn't been borrowed");
        }
    }
}
