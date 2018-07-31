import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Book lordOfTheFlies;
    Book lordOfTheRings;
    Book lordOfTheLords;
    Book lordyMcBookFace;

    Library letterL;

    @Before
    public void before(){
        lordOfTheFlies = new Book(GenreType.DRAMA);
        lordOfTheRings = new Book(GenreType.ADVENTURE);
        lordOfTheLords = new Book(GenreType.RELIGIOUS);
        lordyMcBookFace = new Book(GenreType.COMEDY);
        letterL = new Library(3);
    }

    @Test
    public void libraryHasNoBooks(){
        assertEquals(0, letterL.getTotalBooks());
    }

    @Test
    public void libraryHasOneBook(){
        assertEquals(0, letterL.getTotalBooks());
        letterL.addBook(lordyMcBookFace);
        assertEquals(1, letterL.getTotalBooks());
    }

    @Test
    public void libraryIsAtFullCapacity(){
        letterL.addBook(lordyMcBookFace);
        letterL.addBook(lordOfTheFlies);
        letterL.addBook(lordOfTheRings);
        letterL.addBook(lordOfTheLords);
        assertEquals(3, letterL.getTotalBooks());
    }

    @Test
    public void libraryHasOneAdventureBook(){
        letterL.addBookOrganized(lordOfTheRings);
        letterL.addBookOrganized(lordOfTheRings);
        assertEquals(2, letterL.getTotalByGenre(GenreType.ADVENTURE));
    }
}
