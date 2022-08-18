import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OnlyNumbersInStringTest {

    OnlyNumbersInString on;

    @BeforeEach
    void setUp () {
        on = new OnlyNumbersInString();
    }

    @Order(1)
    @Test
    public void OnlyNumbersInStringTestLettersSignsNumbers() {

        String str = "123 ?AbcdE -4567- Ray 8 9 0 11!@##$%   ";

        String expectedResult = "123456789011";

        String actualResult = on.getStringToOnlyNumbers(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void OnlyNumbersInStringTestLettersSigns() {

        String str = "TTT ?AbcdE -mnb- Ray s % $ stop !@##$%   ";

        String expectedResult = "";

        String actualResult = on.getStringToOnlyNumbers(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void OnlyNumbersInStringTestOneNumber() {

        String str = "TTT ?AbcdE -mnb- Ray 1s % $ stop !@##$%   ";

        String expectedResult = "1";

        String actualResult = on.getStringToOnlyNumbers(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void OnlyNumbersInStringTestStringIsEmpty() {

        String str = "";

        String expectedResult = "";

        String actualResult = on.getStringToOnlyNumbers(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void OnlyNumbersInStringTestStringIsNull() {

        String str = null;

        String expectedResult = "";

        String actualResult = on.getStringToOnlyNumbers(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void OnlyNumbersInStringTestSpaces() {

        String str = "  ";

        String expectedResult = "";

        String actualResult = on.getStringToOnlyNumbers(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}