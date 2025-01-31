package uppgift1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Maintest {
    @Test
    void testtoenglish() {
        toenglish english = new toenglish();
        assertEquals("HEJ", english.översättTillenglish(".... . .---"));
        assertEquals("A", english.översättTillenglish(".-"));
        assertEquals("B", english.översättTillenglish("-..."));
    }

    @Test
    void testtomorse() {
        tomorse morse = new tomorse();
        assertEquals(".... . .---", morse.översättTillMorse("HEJ"));
        assertEquals(".-", morse.översättTillMorse("A"));
        assertEquals("-...", morse.översättTillMorse("B"));
    }
    @Test
    void testextraletters(){
        toenglish english=new toenglish();
        tomorse morse=new tomorse();
        assertEquals("?",english.översättTillenglish("ö"));
        assertEquals("?...- . .-. ... ?- -",morse.översättTillMorse("översätt"));
    }
    @Test
    void testtoenglishWithUnknownCharacters() {
        toenglish english = new toenglish();
        assertEquals("HEJ?", english.översättTillenglish(".... . .--- ......"));
    }
    @Test
    void testtomorseWithSpaces() {
        tomorse morse = new tomorse();
        assertEquals(".... . .-.. .-.. ---   .-- --- .-. .-.. -..", morse.översättTillMorse("HELLO WORLD"));
    }
    }