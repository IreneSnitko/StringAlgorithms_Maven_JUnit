import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OnlyLettersTest {

    OnlyLetters ol;

    @BeforeEach
    void setUp () {
        ol = new OnlyLetters();
    }

    @Order(1)
    @Test
    public void OnlyLettersTestLettersSignsNumbers() {

        String str = "   dsg3-6490 &?  ighrпРРОР4362РПАj\\k{fdka[]jgJKL-734615643FB++=35   ";

        String expectedResult = "dsgighrпРРОРРПАjkfdkajgJKLFB";

        String actualResult = ol.getStringToOnlyLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void OnlyLettersTestNumbersSigns() {

        String str = "1234567890-+=  {} []!@";

        String expectedResult = "";

        String actualResult = ol.getStringToOnlyLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void OnlyLettersTestNumbers() {

        String str = "1234567890";

        String expectedResult = "";

        String actualResult = ol.getStringToOnlyLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void OnlyLettersTestEmptyString() {

        String str = "";

        String expectedResult = "";

        String actualResult = ol.getStringToOnlyLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void OnlyLettersTestSpaces() {

        String str = "    ";

        String expectedResult = "";

        String actualResult = ol.getStringToOnlyLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void OnlyLettersTestStringIsNull() {

        String str = null;

        String expectedResult = "";

        String actualResult = ol.getStringToOnlyLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}