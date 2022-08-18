import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CheckingWhitespacesTest {

    CheckingWhitespaces cwh;

    @BeforeEach
    void setUp() {
        cwh = new CheckingWhitespaces();
    }

    @Order(1)
    @Test
    public void testCheckingWhitespaces_withExtraSpaces() {

        String str = "    Quality Assurance         ";

        String expectedResult = "Extra spaces have been removed";

        String actualResult = cwh.checkWhitespaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testCheckingWhitespaces_withoutExtraSpaces() {

        String str = "Quality Assurance";

        String expectedResult = "There were no spaces";

        String actualResult = cwh.checkWhitespaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testCheckingWhitespaces_stringIsEmpty() {

        String str = "";

        String expectedResult = "Line is empty";

        String actualResult = cwh.checkWhitespaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCheckingWhitespaces_onlySpaces() {

        String str = "   ";

        String expectedResult = "Line is empty";

        String actualResult = cwh.checkWhitespaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCheckingWhitespaces_stringIsNull() {

        String str = null;

        String expectedResult = "Line is empty";

        String actualResult = cwh.checkWhitespaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}