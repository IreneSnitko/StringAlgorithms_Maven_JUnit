import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class StringBetweenLettersTest {

    StringBetweenLetters sbl;

    @BeforeEach
    void setUp() {
        sbl = new StringBetweenLetters();
    }

    @Order(1)
    @Test
    public void testStringBetweenLetters_oneWord() {

        String expectedResult = "edivide";

        String actualResult = sbl.findStringBetweenLetters("redivider", "e");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testStringBetweenLetters_oneWord_2() {

        String expectedResult = "oo";

        String actualResult = sbl.findStringBetweenLetters("toot", "o");

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(3)
    @Test
    public void testStringBetweenLetters_manyWord() {

        String expectedResult = "ll up if I pull";

        String actualResult = sbl.findStringBetweenLetters("Pull up if I pull up", "l");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testStringBetweenLetters_manyWord_2() {

        String expectedResult = "t New York, – Roy went";

        String actualResult = sbl.findStringBetweenLetters("Not New York, – Roy went on", "t");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringBetweenLetters_stringsIsNull() {

        String expectedResult = "Error! Enter the text, please";

        String actualResult = sbl.findStringBetweenLetters(null, null);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringBetweenLetters_stringIsEmpty() {

        String expectedResult = "Error! Enter the text, please";

        String actualResult = sbl.findStringBetweenLetters("", "a");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringBetweenLetters_onlySpaces() {

        String expectedResult = "Error! Enter the text, please";

        String actualResult = sbl.findStringBetweenLetters("     ", "   ");

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
