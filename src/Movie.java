public class Movie extends LibraryMedia {
    private String director;
    private int duration;

    public Movie(String title, int publicationYear, String director, int duration) {
        super(title, publicationYear);
        this.director = director;
        if (duration > 0) this.duration = duration;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration);
    }

    public void checkDuration() {
        if (duration > 120) {
            System.out.println("This movie is long.");
        } else {
            System.out.println("This movie is standard.");
        }
    }


}
