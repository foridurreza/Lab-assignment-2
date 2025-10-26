public class Movie {
    // Private instance variables
    private String title;
    private String director;
    private double duration; // in hours

    // Constructor
    public Movie(String title, String director, double duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Invalid title. It cannot be empty.");
        }
    }

    // Getter and Setter for director
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        if (director != null && !director.trim().isEmpty()) {
            this.director = director;
        } else {
            System.out.println("Invalid director name. It cannot be empty.");
        }
    }

    // Getter and Setter for duration
    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        if (duration > 0) {
            this.duration = duration;
        } else {
            System.out.println("Invalid duration. It must be positive.");
        }
    }

    // Method to return movie details as a formatted string
    public String getMovieDetails() {
        return "🎬 Movie Title: " + title + 
               "\n🎥 Director: " + director + 
               "\n⏱ Duration: " + duration + " hours";
    }

    // Main method to test the Movie class
    public static void main(String[] args) {
        Movie m1 = new Movie("Inception", "Christopher Nolan", 2.8);

        System.out.println(m1.getMovieDetails());
        System.out.println();

        // Modify details using setters
        m1.setTitle("Interstellar");
        m1.setDirector("Christopher Nolan");
        m1.setDuration(2.9);

        System.out.println("After updating details:\n");
        System.out.println(m1.getMovieDetails());
    }
}

    

