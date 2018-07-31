import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BearrowerTest {

    Bearrower duderino;
    Book lordOfTheFlies;
    Book lordOfTheRings;
    Book lordOfTheLords;
    Book lordyMcBookFace;

    Library letterL;

    @Before
    public void before(){
        duderino = new Bearrower();
        lordOfTheFlies = new Book(GenreType.DRAMA);
        lordOfTheRings = new Book(GenreType.ADVENTURE);
        lordOfTheLords = new Book(GenreType.RELIGIOUS);
        lordyMcBookFace = new Book(GenreType.COMEDY);
        letterL = new Library(3);
    }

    @Test
    public void isIlliterate(){
        assertEquals(0, duderino.getTotalCollection());
    }

    @Test
    public void borrowABook(){
        letterL.addBook(lordyMcBookFace);
        letterL.addBook(lordOfTheRings);
        letterL.addBook(lordOfTheLords);
        duderino.borrow(lordyMcBookFace, letterL);
        assertEquals(1, duderino.getTotalCollection());
        assertEquals(2, letterL.getTotalBooks());
    }
}
