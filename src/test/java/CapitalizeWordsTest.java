import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CapitalizeWordsTest {

    CapitalizeWords capW;

    @BeforeEach
    void setUp() {
        capW = new CapitalizeWords();
    }

    @Order(1)
    @Test
    public void testCapitalizeWords_happyPathTwoWords() {

        String expectedResult = "Happy Birthday";

        String actualResult = capW.getCapitalLetters("    happy  birthday   ");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testCapitalizeWords_happyPathManyWords() {

        String expectedResult = "John Jacob Smith Jr.";

        String actualResult = capW.getCapitalLetters("  john    jacob   smith jr.");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testCapitalizeWords_oneLetter() {

        String expectedResult = "";

        String actualResult = capW.getCapitalLetters("a");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testCapitalizeWords_twoLetter() {

        String expectedResult = "He";

        String actualResult = capW.getCapitalLetters("  he ");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCapitalizeWords_stringIsNull() {

        String expectedResult = "";

        String actualResult = capW.getCapitalLetters(null);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCapitalizeWords_stringIsEmpty() {

        String expectedResult = "";

        String actualResult = capW.getCapitalLetters("");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCapitalizeWords_onlySpaces() {

        String expectedResult = "";

        String actualResult = capW.getCapitalLetters("     ");

        Assertions.assertEquals(expectedResult, actualResult);
    }
}