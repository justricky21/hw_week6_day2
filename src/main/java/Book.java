public class Book {
    private GenreType genreType;
    public Book(GenreType genreType){
        this.genreType = genreType;
    }
    public GenreType getGenreType(){
        return this.genreType;
    }
}
