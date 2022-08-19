import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IdenticalLettersTest {

    IdenticalLetters il;

    @BeforeEach
    void setUp() {
        il = new IdenticalLetters();
    }

    @Order(1)
    @Test
    public void testIdenticalLetters_sameLetters() {

        boolean expectedResult = true;

        boolean actualResult = il.isLettersAreSame("Abracadabra");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testIdenticalLetters_notSameLetters() {

        boolean expectedResult = false;

        boolean actualResult = il.isLettersAreSame("Whippersnapper");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testIdenticalLetters_sameLettersAndExtraSpaces() {

        boolean expectedResult = true;

        boolean actualResult = il.isLettersAreSame("     me   MORA nduM   ");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIdenticalLetters_stringIsOneLetter() {

        boolean expectedResult = true;

        boolean actualResult = il.isLettersAreSame("b  ");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIdenticalLetters_stringIsTwoLetters() {

        boolean expectedResult = true;

        boolean actualResult = il.isLettersAreSame("   n  n   ");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIdenticalLetters_stringIsNull() {

        boolean expectedResult = false;

        boolean actualResult = il.isLettersAreSame(null);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIdenticalLetters_stringIsEmpty() {

        boolean expectedResult = false;

        boolean actualResult = il.isLettersAreSame("");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIdenticalLetters_stringIsOnlySpcs() {

        boolean expectedResult = false;

        boolean actualResult = il.isLettersAreSame("       ");

        Assertions.assertEquals(expectedResult, actualResult);
    }
}