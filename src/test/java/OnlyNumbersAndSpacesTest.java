import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OnlyNumbersAndSpacesTest {

    OnlyNumbersAndSpaces ons;

    @BeforeEach
    void setUp () {
        ons = new OnlyNumbersAndSpaces();
    }

    @Order(1)
    @Test
    public void OnlyNumbersAndSpacesTestLettersSignsNumbers() {

        String str = " 1 2 34%  H5@ o 67Me swe45et ho9m0e- /= 0";

        String expectedResult = "1 2 34  5  67 45 90  0";

        String actualResult = ons.getStringToOnlyNumbersAndSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void OnlyNumbersAndSpacesTestLettersSigns() {

        String str = "   dshghakgyagwfygyagv%%$*%%kjgsgf    ";

        String expectedResult = "";

        String actualResult = ons.getStringToOnlyNumbersAndSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void OnlyNumbersAndSpacesTestOneNumber() {

        String str = "   dshghakgyagwfyg1yagv%%$*%%kjgsgf    ";

        String expectedResult = "1";

        String actualResult = ons.getStringToOnlyNumbersAndSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void OnlyNumbersAndSpacesTestStringIsEmpty() {

        String str = "";

        String expectedResult = "";

        String actualResult = ons.getStringToOnlyNumbersAndSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void OnlyNumbersAndSpacesTestStringIsNull() {

        String str = null;

        String expectedResult = "";

        String actualResult = ons.getStringToOnlyNumbersAndSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void OnlyNumbersAndSpacesTestOnlySpaces() {

        String str = "         ";

        String expectedResult = "";

        String actualResult = ons.getStringToOnlyNumbersAndSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}