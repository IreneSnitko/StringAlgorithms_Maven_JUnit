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
    public void testOnlyLetters_lettersSignsNumbers() {

        String str = "   dsg3-6490 &?  ighrпРРОР4362РПАj\\k{fdka[]jgJKL-734615643FB++=35   ";

        String expectedResult = "dsgighrпРРОРРПАjkfdkajgJKLFB";

        String actualResult = ol.getStringToOnlyLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOnlyLetters_numbersSigns() {

        String str = "1234567890-+=  {} []!@";

        String expectedResult = "";

        String actualResult = ol.getStringToOnlyLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOnlyLetters_numbers() {

        String str = "1234567890";

        String expectedResult = "";

        String actualResult = ol.getStringToOnlyLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOnlyLetters_stringIsEmpty() {

        String str = "";

        String expectedResult = "";

        String actualResult = ol.getStringToOnlyLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOnlyLetters_spaces() {

        String str = "    ";

        String expectedResult = "";

        String actualResult = ol.getStringToOnlyLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOnlyLetters_stringIsNull() {

        String str = null;

        String expectedResult = "";

        String actualResult = ol.getStringToOnlyLetters(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}