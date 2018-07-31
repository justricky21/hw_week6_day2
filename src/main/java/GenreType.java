public enum GenreType {
    ADVENTURE("Some people doing something adventurous"),
    DRAMA("Some people doing some sad things"),
    COMEDY("Some people doing funny stuff"),
    RELIGIOUS("Some people praying really hard");

    private String description;
    GenreType(String description){
        this.description = description;
    }
}
