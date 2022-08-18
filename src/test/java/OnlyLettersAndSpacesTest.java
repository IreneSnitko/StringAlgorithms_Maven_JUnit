import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OnlyLettersAndSpacesTest {

    OnlyLettersAndSpaces ols;

    @BeforeEach
    void setUp () {
        ols = new OnlyLettersAndSpaces();
    }

    @Order(1)
    @Test
    public void testOnlyLettersAndSpaces_lettersSignsNumbers() {

        String str = "I 555like     J A V A777 {]- ";

        String expectedResult = "I like J A V A";

        String actualResult = ols.getStringToOnlyLettersAndSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOnlyLettersAndSpaces_oneLetter() {

        String str = "   !#@$%1= 9856&  ?/// 5 7 8 9 0   a-";

        String expectedResult = "a";

        String actualResult = ols.getStringToOnlyLettersAndSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOnlyLettersAndSpaces_numbersAndSigns() {

        String str = "   \1= 2 3 4&  ?/// 5 7 8 9 0   ";

        String expectedResult = "";

        String actualResult = ols.getStringToOnlyLettersAndSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOnlyLettersAndSpaces_stringIsEmpty() {

        String str = "";

        String expectedResult = "";

        String actualResult = ols.getStringToOnlyLettersAndSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOnlyLettersAndSpaces_stringIsNull() {

        String str = null;

        String expectedResult = "";

        String actualResult = ols.getStringToOnlyLettersAndSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}