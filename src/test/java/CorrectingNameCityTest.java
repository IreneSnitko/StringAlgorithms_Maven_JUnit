import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CorrectingNameCityTest {

    CorrectingNameCity cnc;

    @BeforeEach
    void setUp() {
        cnc = new CorrectingNameCity();
    }

    @Order(1)
    @Test
    public void testCorrectingNameCity_smallLetters() {

        String expectedResult = "Baltimore";

        String actualResult = cnc.getRightNameCity("baltimore");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testCorrectingNameCity_bigLetters() {

        String expectedResult = "Birmingham";

        String actualResult = cnc.getRightNameCity("BIRMINGHAM");

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(3)
    @Test
    public void testCorrectingNameCity_extraSpaces() {

        String expectedResult = "Detroit";

        String actualResult = cnc.getRightNameCity("           dETROit     ");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testCorrectingNameCity_twoWords() {

        String expectedResult = "San Francisco";

        String actualResult = cnc.getRightNameCity("  saN   FranciscO ");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testCorrectingNameCity_withOneDash() {

        String expectedResult = "Baden-Baden";

        String actualResult = cnc.getRightNameCity("   badEN   -   BADEN");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testCorrectingNameCity_withTwoDash() {

        String expectedResult = "Rivière-Sur-Tarn";

        String actualResult = cnc.getRightNameCity("   rivière   -   sur   -tarn   ");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCorrectingNameCity_stringIsEmpty() {

        String expectedResult = "Error! Enter the name of the city, please";

        String actualResult = cnc.getRightNameCity("");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCorrectingNameCity_stringIsNull() {

        String expectedResult = "Error! Enter the name of the city, please";

        String actualResult = cnc.getRightNameCity(null);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCorrectingNameCity_onlySpaces() {

        String expectedResult = "Error! Enter the name of the city, please";

        String actualResult = cnc.getRightNameCity("     ");

        Assertions.assertEquals(expectedResult, actualResult);
    }
}