package movies;

public class Store{
    private final Movie[] movies;

    public Store(){
        this.movies = new Movie[10];
    }

    public Movie[] getMovies(){
        return this.movies;
    }

    public Movie getMovie(int index){
        return new Movie(this.movies[index]);
    }

    public void setMovie(int index, Movie movie){
        this.movies[index] = new Movie(movie);
    }
}