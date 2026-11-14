package movies;

public class Movie{
    private String name;
    private String format;
    private double rating;

    public Movie(String name, String format, double rating){
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    public Movie(Movie source){
        if(source == null) return;
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().length() < 3){
            throw new IllegalArgumentException("Name must not be empty and must be at least three characters");
        }
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString(){
        return this.rating + "\t" + this.format + "\t\t" + this.name;
    }
}